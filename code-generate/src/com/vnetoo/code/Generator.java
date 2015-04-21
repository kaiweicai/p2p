/**
 * 
 */
package com.vnetoo.code;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author chenh
 * @date 2013年8月20日
 */
public class Generator {

	private String packagePath; 		//新添加功能的包路径
	private String baseName; 			//新添加名称
	private String boName;				//BO名称（包含Package路径）
	private String sysdate;				//日期
	private String author;				//作者
	private boolean overWrite = false; 	//是否覆盖原来文件
	
	private JdbcTemplate jt; 
	private String dbUserName;			//数据库用户名称
	private String databaseName;			//表名称
	private String tableName;			//表名称
	private String seqName;				//SEQ名称
	private String tableComment;		//表注释
	private String pkName;				//主键名称
	private List<ColumnInfo> columnList;			//字段信息集合
	private String dbName;				//数据库名称
	
	private String pathBO;
	private String pathDao;
	private String pathService;
	private String pathView;
	
	private String projectPath;
	private String srcProjectPath;	
	private String srcPath;	
	private String cfgPath;
	private String jspPath;
	
	/**
	 *	字段信息结构
	 */
	private class ColumnInfo{
		public String name;		//字段名称
		public String comment;	//字段注释
		public String type;		//字段类型
		public String defVal;	//字段默认值
		public boolean nullAble;//是否可以为空，true可以为空，false不能为空
	}

	
	
	private String parseBOType(String type){
		if(type.equals("CHAR")||type.equals("VARCHAR")||type.equals("VARCHAR2"))
			return "java.lang.String";
		else if(type.equals("NUMBER") || type.equals("BIGINT") || type.equals("INT"))
			return "java.lang.Integer";
		else if(type.equals("DATE") || type.startsWith("TIMESTAMP") || type.equals("DATETIME"))
			return "java.util.Date";
		else if(type.equals("CLOB")||type.equals("BLOB"))
			return "java.lang.String";
		else
			return "java.lang.Object";
	}
	
	private String parseType(String type){
		if(type.equals("CHAR")||type.equals("VARCHAR")||type.equals("VARCHAR2"))
			return "VARCHAR";
		else if(type.equals("NUMBER") || type.equals("BIGINT") || type.equals("INT"))
			return "NUMERIC";
		else if(type.equals("DATE") || type.startsWith("TIMESTAMP") || type.equals("DATETIME"))
			return "TIMESTAMP";
		else if(type.equals("CLOB"))
			return "ClobStringTypeHandler";
		else if(type.equals("BLOB"))
			return "BlobStringTypeHandler";
		else 
			return "";
	}
	
	private String propertyFrom(String column){
		if(column==null||column.equals(""))
			return "";
		String[]name=column.split("_");
		if(name.length==1){
			return name[0].toLowerCase();
		}
		String ret=name[0].toLowerCase();
		for(int i=1;i<name.length;i++){
			name[i]=name[i].toLowerCase();
			ret+=UpperFirst(name[i]);
		}
		return ret;
	}
	
	private String UpperFirst(String name) {
		if (name == null)
			return "";
		if (name.length() == 1)
			return name.toUpperCase();
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	private String LowerFirst(String name) {
		if (name == null)
			return "";
		if (name.length() == 1)
			return name.toLowerCase();
		return name.substring(0, 1).toLowerCase() + name.substring(1);
	}
	
	/**
	 * 写新文件
	 * @param fileName
	 * @param data
	 * @throws Exception
	 */
	private void writeFile(String fileName, String data) throws Exception {
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName));
		out.write(data.getBytes("UTF-8"));
		out.close();
	}
	
	/**
	 * 读模板文件
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	private String readModual(String fileName) throws Exception {
		StringBuffer sb = new StringBuffer();
		String resPath = getClass().getPackage().getName().replace('.', '/') + "/template/" + fileName;
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcProjectPath + "/src/" + resPath));
		byte[] b = new byte[1024 * 1024 * 5];
		int size = bis.read(b);
		while (size != -1) {
			sb.append(new String(b, 0, size, "UTF-8"));
			size = bis.read(b);
		}
		bis.close();
		return sb.toString();
	}
	
	/**
	 * 读模板文件
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	private String readConfigFile(String fileName) throws Exception {
		StringBuffer sb = new StringBuffer();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
		byte[] b = new byte[1024 * 1024 * 5];
		int size = bis.read(b);
		while (size != -1) {
			sb.append(new String(b, 0, size, "UTF-8"));
			size = bis.read(b);
		}
		bis.close();
		return sb.toString();
	}

	/**
	 * 创建文件
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	private boolean createFile(String fileName) throws Exception {
		File file = new File(fileName);
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			return file.createNewFile();
		} else {
			return overWrite;//默认不覆盖，要覆盖改为true
		}
	}
	
	/**
	 * @param ds			数据源
	 * @param tableName		表名称
	 * @param packagePath	包路径
	 * @param overWrite		是否覆盖文件
	 */
	public Generator(BasicDataSource ds,String dbName,String tableName,String packagePath,boolean overWrite,
			String pathBO,String pathDao,String pathService,String pathView,
					 String projectPath,
					 String srcProjectPath,	
					 String srcPath,
					 String cfgPath,
					 String jspPath
			){
		this.pathBO = pathBO;
		this.pathDao = pathDao;
		this.pathService = pathService;
		this.pathView = pathView;
		
		this.projectPath=projectPath;
		this.srcProjectPath=srcProjectPath;	
		this.srcPath=srcPath;	
		this.cfgPath=cfgPath;
		this.jspPath=jspPath;
		
		jt=new JdbcTemplate(ds);
		this.dbName=dbName;
		this.tableName=tableName.toUpperCase();
		this.dbUserName=ds.getUsername().toUpperCase();
		this.seqName="SEQ_"+this.tableName;
		this.packagePath=packagePath;
		this.baseName = UpperFirst(propertyFrom(this.tableName));
		this.boName = packagePath+".bo."+baseName;
		this.author = System.getProperty("user.name");
		this.sysdate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		this.overWrite = overWrite;		
		try {
			query();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("检查用户"+dbUserName+"表空间是否存在表："+tableName);
		}
		
		//initDlg();
	}
	
	private void query()throws Exception{
		//String sql="select comments from user_tab_comments where upper(TABLE_NAME)=upper('"+this.tableName+"')";
		String sql="SELECT TABLE_COMMENT FROM information_schema.TABLES WHERE TABLE_NAME = upper('"+this.tableName+"')";
		this.tableComment=(String)jt.queryForObject(sql,new Object[]{}, String.class);
		if(tableComment==null)
			tableComment="";
		
//		sql="select column_name from user_cons_columns where constraint_name="+
//			"(select    constraint_name   from    user_constraints "+   
//            "where    table_name   =    upper('"+this.tableName+"')  and    constraint_type   ='P')";
		sql="SELECT COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_NAME='"+this.tableName+"' AND COLUMN_KEY = 'PRI'";
		
		
		this.pkName=(String)jt.queryForObject(sql, String.class);
		if(this.pkName==null)
			this.pkName="";
		else
			this.pkName=this.pkName.toUpperCase();
		
//		sql="select a.column_name as column_name,a.comments as comments,b.DATA_TYPE as type,b.DATA_DEFAULT as defval ,b.NULLABLE "+
//			"from user_col_comments a ,ALL_TAB_COLUMNS b "+
//			"where upper(a.TABLE_NAME)=upper('"+this.tableName+"')  and upper(b.OWNER)=upper('"+dbUserName+"')"+
//			"and upper(b.TABLE_NAME)=upper(a.TABLE_NAME) and upper(b.column_name)=upper(a.column_name)";
		sql="SELECT COLUMN_NAME as column_name,COLUMN_COMMENT AS comments,DATA_TYPE AS type,COLUMN_DEFAULT AS defval,IS_NULLABLE AS NULLABLE  FROM information_schema.COLUMNS WHERE TABLE_NAME='"+this.tableName+"'";
		columnList=jt.query(sql, new org.springframework.jdbc.core.RowMapper<ColumnInfo>(){
			public ColumnInfo mapRow(java.sql.ResultSet rs, int i) throws java.sql.SQLException{
				ColumnInfo ti=new ColumnInfo();
				ti.name=rs.getString("column_name").toUpperCase();
				ti.comment=rs.getString("comments");
				ti.type=rs.getString("type").toUpperCase();
				ti.defVal=rs.getString("defVal");
				ti.nullAble=rs.getString("NULLABLE").equals("Y");
				return ti;
			}
		});
	}
	
	/**
	 * 产生BO抽象类文件
	 * @throws Exception
	 */
	public void createAbstractBO()throws Exception{
		String temp=packagePath+"."+this.pathBO;
		String fileName = srcPath + File.separator + temp.replace(".", File.separator)+File.separator+ "Abstract"+baseName + ".java";
		System.out.println("creating AbstractBOFile...");
		if (!createFile(fileName)) {
			System.out.println(">>>createAbstractBO-Abstract" + baseName+ ".java is exist!");
			return;
		}
		String data = readModual("abstractBO.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${sysdate}", sysdate);
		data = data.replace("${author}", author);	
		data = data.replace("${tableComment}", tableComment);		
		data = data.replace("${package}", temp);
		
		String props="";
		String setget="";
		System.out.println("columnList.size() is "+columnList.size());
		for(int i=0;i<columnList.size();i++){
			ColumnInfo bean=(ColumnInfo)columnList.get(i);
			props+="\n\t/**\n\t * @alias "+bean.comment+"\n\t */";
			props+="\n\tprotected "+parseBOType(bean.type)+" "+propertyFrom(bean.name)+";";
			setget+="\n\tpublic void set"+UpperFirst(propertyFrom(bean.name))+"("+parseBOType(bean.type)+" "+propertyFrom(bean.name)+"){";
			setget+="\n\t\t this."+propertyFrom(bean.name)+"="+propertyFrom(bean.name)+";";
			setget+="\n\t}";
			setget+="\n\tpublic "+parseBOType(bean.type)+" get"+UpperFirst(propertyFrom(bean.name))+"(){";
			setget+="\n\t\t return this."+propertyFrom(bean.name)+";";
			setget+="\n\t}";
			
		}
		data = data.replace("${props}", props);
		data = data.replace("${setget}", setget);
		
		writeFile(fileName, data);
	}
	
	/**
	 * 产生BO类文件
	 * @throws Exception
	 */
	public void createBO()throws Exception{
				
		String temp=packagePath+"."+this.pathBO;;
		String fileName = srcPath + File.separator + temp.replace(".", File.separator)+File.separator+ baseName + ".java";
		System.out.println("creating BOFile...");
		if (!createFile(fileName)) {
			System.out.println(">>>createBO-" + baseName+ ".java is exist!");
			return;
		}
		String data = readModual("bo.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${sysdate}", sysdate);
		data = data.replace("${author}", author);	
		data = data.replace("${tableComment}", tableComment);		
		data = data.replace("${package}", temp);
		
		String props="";
		String setget="";
		String strBuff="";
		
		for(int i=0;i<columnList.size();i++){
			ColumnInfo bean=(ColumnInfo)columnList.get(i);
			props+="\n\t/**\n\t * @alias "+bean.comment+"\n\t */";
			props+="\n\tprivate "+parseBOType(bean.type)+" "+propertyFrom(bean.name)+";";
			setget+="\n\tpublic void set"+UpperFirst(propertyFrom(bean.name))+"("+parseBOType(bean.type)+" "+propertyFrom(bean.name)+"){";
			setget+="\n\t\t this."+propertyFrom(bean.name)+"="+propertyFrom(bean.name)+";";
			setget+="\n\t}";
			setget+="\n\tpublic "+parseBOType(bean.type)+" get"+UpperFirst(propertyFrom(bean.name))+"(){";
			setget+="\n\t\t return this."+propertyFrom(bean.name)+";";
			setget+="\n\t}";
			strBuff+="\t\tsb.append(\""+propertyFrom(bean.name)+":\"+"+propertyFrom(bean.name)+"+\";\");\n";
		}
		data = data.replace("${props}", props);
		data = data.replace("${setget}", setget);
		data = data.replace("${strBuff}", strBuff);
		//System.out.println(strBuff);
		writeFile(fileName, data);		
	}
	/**
	 * 产生DAO接口
	 * @throws Exception
	 */
	public void createDAO()throws Exception{
		String temp=packagePath+"."+pathDao;
		String fileName = srcPath + File.separator + temp.replace(".", File.separator)+File.separator + baseName + "DAO.java";
		System.out.println("creating DAOFile...");
		if (!createFile(fileName)) {
			System.out.println(">>>createDAO-" + baseName+ "DAO.java is exist!");
			return;
		}
		String data = readModual("dao.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${sysdate}", sysdate);
		data = data.replace("${author}", author);	
		data = data.replace("${tableComment}", tableComment);		
		data = data.replace("${package}", temp);
		String imp="import "+boName+";";
		data = data.replace("${import}", imp);
		
		writeFile(fileName, data);
	}
	
	/**
	 * 产生DAO实现类
	 * @throws Exception
	 */
	public void createDAOImpl()throws Exception{
		String temp=packagePath+"."+pathDao;
		String fileName = srcPath + File.separator + temp.replace(".", File.separator)+File.separator + baseName + "DAOImpl.java";
		System.out.println("creating DAOImplFile...");
		if (!createFile(fileName)) {
			System.out.println(">>>createDAOImpl-" + baseName+ "DAOImpl.java is exist!");
			return;
		}
		String data = readModual("daoImpl.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${sysdate}", sysdate);
		data = data.replace("${author}", author);	
		data = data.replace("${tableComment}", tableComment);		
		data = data.replace("${package}", temp);
		String imp="import "+boName+";";
		data = data.replace("${import}", imp);
		
		writeFile(fileName, data);
	}
	/**
	 * 产生Service接口
	 * @throws Exception
	 */
	public void createService()throws Exception{
		String temp=packagePath+"."+pathService;
		String fileName = srcPath + File.separator + temp.replace(".", File.separator)+File.separator + baseName + "Service.java";
		System.out.println("creating ServiceFile...");
		if (!createFile(fileName)) {
			System.out.println(">>>createService-" + baseName+ "Service.java is exist!");
			return;
		}
		String data = readModual("service.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${sysdate}", sysdate);
		data = data.replace("${author}", author);	
		data = data.replace("${tableComment}", tableComment);		
		data = data.replace("${package}", temp);
		String imp="import "+boName+";";
		data = data.replace("${import}", imp);
		
		writeFile(fileName, data);
	}
	
	/**
	 * 产生Service实现类
	 * @throws Exception
	 */
	public void createServiceImpl()throws Exception{
		String temp=packagePath+"."+pathService;
		String fileName = srcPath + File.separator + temp.replace(".", File.separator)+File.separator + baseName + "ServiceImpl.java";
		System.out.println("creating ServiceImplFile...");
		if (!createFile(fileName)) {
			System.out.println(">>>createServiceImpl-" + baseName+ "ServiceImpl.java is exist!");
			return;
		}
		String data = readModual("serviceImpl.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${baseName.lowerFirst}", LowerFirst(baseName));
		data = data.replace("${sysdate}", sysdate);
		data = data.replace("${author}", author);	
		data = data.replace("${tableComment}", tableComment);		
		data = data.replace("${package}", temp);
		String imp="import "+boName+";\n";
		imp+="import "+packagePath+"."+pathDao+"."+baseName+"DAO;";
		data = data.replace("${import}", imp);
		
		writeFile(fileName, data);
	}
	/**
	 * 产生Action
	 * @throws Exception
	 */
	public void createAction(String updateProperty)throws Exception{
		String temp=packagePath+"."+pathView;
		String fileName = srcPath + File.separator + temp.replace(".", File.separator)+File.separator + baseName + "Action.java";
		System.out.println("creating ActionFile...");
		if (!createFile(fileName)) {
			System.out.println(">>>createAction-" + baseName+ "Action.java is exist!");
			return;
		}
		String data = readModual("action.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${sysdate}", sysdate);
		data = data.replace("${author}", author);	
		data = data.replace("${tableComment}", tableComment);		
		data = data.replace("${package}", temp);
		String imp="import "+boName+";\n";
		imp+="import "+packagePath+"."+pathService+"."+baseName+"Service;\n";
		//imp+="import "+packagePath+"."+FILEPATH_VIEW+"."+baseName+"Form;";
		data = data.replace("${import}", imp);
		data = data.replace("${baseName.lowerFirst}", LowerFirst(baseName));
				
		if(updateProperty!=null)
			data = data.replace("${updateProperty}", updateProperty);
		writeFile(fileName, data);
	}
	
	/**
	 * 产生映射文件
	 * @throws Exception
	 */
	public void createOrmFile()throws Exception{
		//String temp=packagePath+"."+pathDao;
		//temp=temp.replace(".", File.separator);
		String fileName = cfgPath + File.separator + "mapper" + File.separator + baseName + ".xml";
		System.out.println("\ncreating OrmFile...");
		if (!createFile(fileName)) {
			System.out.println(">>>createOrmFile-" + baseName+ ".xml is exist!");
			return;
		}

		String data = readModual("bo.xml");
		data = data.replace("${baseName}", baseName);
		data = data.replace("${boName}", boName);
		
		String orm="";
		String columns="";
		String props="";		
		String resetVal="";	
		String where="";
		String whereBO="";
		boolean hasLastUpdateTime = false;
		
		for(int i=0;i<columnList.size();i++){
			ColumnInfo bean=(ColumnInfo)columnList.get(i);
			orm+="\n\t\t<result property=\""+propertyFrom(bean.name)+"\" column=\""+bean.name+"\" ";
			if(bean.type.equals("CHAR")||bean.type.equals("VARCHAR")||bean.type.equals("VARCHAR2")){
				 orm+="jdbcType=\"VARCHAR\"";
			}else if(bean.type.equals("NUMBER")){
				orm+="jdbcType=\"NUMERIC\"";
			}
			else if(bean.type.equals("DATE")||bean.type.equals("TIMESTAMP")){
				orm+="jdbcType=\"TIMESTAMP\"";
			}else if(bean.type.equals("CLOB")){
				orm+="typeHandler=\"ClobStringTypeHandler\" ";
			}else if(bean.type.equals("BLOB")){
				orm+="typeHandler=\"BlobStringTypeHandler\" ";
			}
			orm+="/>";
			columns+="\n\t\t\t\t"+bean.name+",";
				if(bean.defVal!=null){
					props+="\n\t\t\t\t"+bean.defVal+",";
				}
				else{
					if(bean.type.equals("CLOB")||bean.type.equals("BLOB")){
						props+="\n\t\t\t\t#{"+propertyFrom(bean.name)+",jdbcType="+parseType(bean.type)+"},";
					}else{
						props+="\n\t\t\t\t#{"+propertyFrom(bean.name)+",jdbcType="+parseType(bean.type)+"},";
					}					
				}
			if(!propertyFrom(bean.name).equals("id") && !propertyFrom(bean.name).equals("enableFlag") 
					&& !propertyFrom(bean.name).equals("createTime") && !propertyFrom(bean.name).equals("createBy")
					&& !propertyFrom(bean.name).equals("lastUpdateTime")){
				resetVal+="\n\t\t\t\t<if test=\""+propertyFrom(bean.name)+"!=null\" >";
				resetVal+="\n\t\t\t\t\t"+bean.name+"=#{"+propertyFrom(bean.name)+",jdbcType="+parseType(bean.type)+"},";	
				resetVal+="\n\t\t\t\t</if>";
			}
			if(propertyFrom(bean.name).equals("lastUpdateTime"))
				hasLastUpdateTime = true;
			where+=parseWhere(bean,false);
			whereBO+=parseWhere(bean,true);
		}
		if(hasLastUpdateTime)
			resetVal+="\n\t\t\t\tLAST_UPDATE_TIME=SYSDATE";
		
		data = data.replace("${orm}", orm);
		data = data.replace("${seqName}", this.dbUserName+"."+this.seqName);
		data = data.replace("${databaseName}", this.dbName);
		data = data.replace("${tableName}", this.tableName);			
		if(columns.endsWith(","))columns=columns.substring(0, columns.length()-1);
		data = data.replace("${columns}", columns);
		if(props.endsWith(","))props=props.substring(0, props.length()-1);
		data = data.replace("${props}", props);
		if(resetVal.endsWith(","))resetVal=resetVal.substring(0, resetVal.length()-1);
		data = data.replace("${resetVal}", resetVal);							//去掉主键的字段(属性)
		data = data.replace("${pkFilter}", pkName+"=#{"+propertyFrom(pkName)+"}");
		data = data.replace("${pkName}",pkName);
		data = data.replace("${where}","\n"+where);
		data = data.replace("${where.bo}","\n"+whereBO);
		writeFile(fileName, data);
	}
	
	public void modifySqlMapConfig()throws Exception{
		String fileName = cfgPath + File.separator + "mybatis.xml";
		System.out.println("modifySqlMapConfig...");
		
		String mapString="<mapper resource=\"mapper/"+baseName+".xml\"/>";
		String aliasString = "<typeAlias alias=\""+baseName+"\" type=\""+boName+"\"/>";
		
		String data = readConfigFile(fileName);		
		if(data.indexOf(mapString)>=0){
			System.out.println(">>>modifySqlMapConfig-SqlMap is exist!");
			return;
		}
		
		data = data.replace("</typeAliases>", "\t"+aliasString+"\n\t</typeAliases>");
		data = data.replace("</mappers>", "\t"+mapString+"\n\t</mappers>");	
		writeFile(fileName, data);
	}
	
	private String parseWhere(ColumnInfo bean,boolean bo){
		String ret="";		
		if(bean.type.equals("CHAR")||bean.type.equals("VARCHAR")||bean.type.equals("VARCHAR2")){
			ret+="\t\t\t<if test=\"";
			if(bo)ret+="bo.";
			ret+=propertyFrom(bean.name)+"!=null and ";
			if(bo)ret+="bo.";
			ret+=propertyFrom(bean.name)+"!='' \">\n";
			ret+=parseWherePropertyLike(bean,bo);
			ret+="\t\t\t</if>\n";			
		}
		else if(bean.type.equals("INT")||bean.type.equals("BIGINT")){
			ret+="\t\t\t<if test=\"";
			if(bo)ret+="bo.";
			ret+=propertyFrom(bean.name)+"!=null\">\n";
			ret+=parseWhereProperty(bean,bo);
			ret+="\t\t\t</if>\n";
		}
		else{
			ret+="\t\t\t<if test=\"";
			if(bo)ret+="bo.";
			ret+=propertyFrom(bean.name)+"!=null\" >\n";
			ret+=parseWhereProperty(bean,bo);
			ret+="\t\t\t</if>\n";
		}		
		return ret;
	}
	private String parseWhereProperty(ColumnInfo bean,boolean bo){
		String ret="";
		if(bean.type.equals("CLOB")||bean.type.equals("BLOB")){
			if(bo)
				ret+="\t\t\t\tAND "+bean.name+"=#{bo."+propertyFrom(bean.name)+"}\n";
			else
				ret+="\t\t\t\tAND "+bean.name+"=#{"+propertyFrom(bean.name)+"}\n";
		}else{
			if(bo)
				ret+="\t\t\t\tAND "+bean.name+"=#{bo."+propertyFrom(bean.name)+"}\n";
			else
				ret+="\t\t\t\tAND "+bean.name+"=#{"+propertyFrom(bean.name)+"}\n";
		}
		return ret;
	}
	private String parseWherePropertyLike(ColumnInfo bean,boolean bo){
		String ret="";
		if(bo)
			//ret+="\t\t\tAND upper("+bean.name+") like upper('%${bo."+propertyFrom(bean.name)+"}%')\n";
			ret+="\t\t\t\tAND UPPER("+bean.name+") like UPPER(CONCAT(CONCAT('%', #{bo."+propertyFrom(bean.name)+"}), '%'))\n";
		else
			ret+="\t\t\t\tAND UPPER("+bean.name+") like UPPER(CONCAT(CONCAT('%', #{"+propertyFrom(bean.name)+"}), '%'))\n";
		return ret;
	}
	private JFrame frm=new JFrame();	//字段选择
	JCheckBox[] checkBox;
	private void initDlg(){
		
		Container c=new Container();
		c.setLayout(new GridLayout(columnList.size()+1,1));
		
		frm.setLayout(new BorderLayout());
		checkBox=new JCheckBox[columnList.size()];
		for(int i=0;i<columnList.size();i++){
			ColumnInfo bean=(ColumnInfo)columnList.get(i);
			checkBox[i]=new JCheckBox(bean.comment+"-"+bean.name);
			c.add(checkBox[i]);
		}
		JButton jb=new JButton("OK");
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	
				frm.setVisible(false);
				goon();				
			}
		});
		c.add(jb);
		frm.add(c,BorderLayout.CENTER);
		frm.setSize(300, 400);
		frm.move(400, 100);
		frm.setVisible(false);
	}
	private synchronized void goon(){
		notifyAll();
	}
	public void closeDlg()
	{
		System.out.println("close");
		frm.dispose();		
	}
	public void createJspSearch()throws Exception{
		
		frm.setTitle("选择查询条件字段...");
		frm.setVisible(true);
		
		synchronized( this ) {
			wait(Long.MAX_VALUE);
		}
		
		String tr_list="";
		String map_list="";			
		
		for(int i=0;i<checkBox.length;i++){
			if(checkBox[i].isSelected()){
				ColumnInfo bean=(ColumnInfo)columnList.get(i);
				String type=parseBOType(bean.type);
				if(type.equals("java.lang.String")){
					tr_list+=
						"\t\t<tr>\n"+
							"\t\t\t<th>"+bean.comment+"：</th>\n"+
							"\t\t\t<td>&nbsp;<input type=\"text\" id=\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\" name=\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\"/></td>\n"+
						"\t\t</tr>\n";
					map_list+=
						"\tmap.put(\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\",\"'\"+document.getElementById(\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\").value.trim()+\"'\");\n";
				}
				else if(type.equals("java.lang.Integer")){
					tr_list+=
						"\t\t<tr>\n"+
							"\t\t\t<th>"+bean.comment+"：</th>\n"+
							"\t\t\t<td>&nbsp;\n"+
								"\t\t\t\t<select id=\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\" name=\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\">\n" +
								"\t\t\t\t<option value=\"0\" selected>--------请选择--------</option>\n" +
								"\t\t\t\t</select>\n" +
							"\t\t\t</td>\n"+
						"\t\t</tr>\n";
					map_list+=
						"\tmap.put(\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\",\"'\"+document.getElementById(\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\")+\"'\");\n";
				}
				else if(type.equals("java.util.Date")){
					tr_list+=
							"\t\t<tr>\n"+
								"\t\t\t<th>"+bean.comment+"：</th>\n"+
								"\t\t\t<td>&nbsp;<input type=\"text\" id=\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\" name=\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\""
								+ " onfocus=\"WdatePicker({readOnly:true,startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd HH:mm:ss',alwaysUseStartDate:true})\"/></td>\n"+
							"\t\t</tr>\n";
						map_list+=
							"\tmap.put(\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\",\"'\"+document.getElementById(\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\").value.trim()+\"'\");\n";
				}
				else{
					
				}					
			}
		}
		
		String fileName = jspPath + File.separator + LowerFirst(baseName) + File.separator + "search.htm";
		System.out.println("creating createJspSearch...");
		if (!createFile(fileName)) {
			System.out.println(">>>createJspSearch-" + baseName+ "search.htm is exist!");
			return;
		}
		String data = readModual("JspSearch.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${baseName.lowerFirst}", LowerFirst(baseName));
		data = data.replace("${tableComment}", tableComment);
		
		data = data.replace("${tr_list}", tr_list);
		data = data.replace("${map_list}", map_list);
		
		writeFile(fileName, data);
	}
	
	public void createJspList()throws Exception{
		
		frm.setTitle("选择列表显示字段...");
		frm.setVisible(true);
		
		synchronized( this ) {
			wait(Long.MAX_VALUE);
		}
		
		String tr_list="";
		String map_list="";	
		int td_count=5;
		
		for(int i=0;i<checkBox.length;i++){
			if(checkBox[i].isSelected()){
				ColumnInfo bean=(ColumnInfo)columnList.get(i);
				String type=parseBOType(bean.type);
				tr_list+=
					"\t\t\t<th>&nbsp;"+bean.comment+"</th>\n";							
				td_count++;
				if(type.equals("java.lang.String")){
					map_list+="\t\t\t<td>&nbsp;<#if item."+propertyFrom(bean.name)+"??>${item."+propertyFrom(bean.name)+"}</#if></td>\n";		
				}
				else if(type.equals("java.lang.Integer")){
					map_list+="\t\t\t<td>&nbsp;<#if item."+propertyFrom(bean.name)+"??>${item."+propertyFrom(bean.name)+"?c!0}</#if></td>\n";
				}
				else if(type.equals("java.util.Date")){
					map_list+="\t\t\t<td>&nbsp;<#if item."+propertyFrom(bean.name)+"??>${item."+propertyFrom(bean.name)+"?string(\"yyyy-MM-dd HH:mm:ss\")}</#if></td>\n";
				}
				else{
					map_list+="\t\t<td>&nbsp;${item."+propertyFrom(bean.name)+"}</td>\n";
				}					
			}
		}
		
		String fileName = jspPath + File.separator + LowerFirst(baseName) + File.separator + "list.htm";
		System.out.println("creating createJspList...");
		if (!createFile(fileName)) {
			System.out.println(">>>createJspList-" + baseName+ "list.htm is exist!");
			return;
		}
		String data = readModual("JspList.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${baseName.lowerFirst}", LowerFirst(baseName));
		data = data.replace("${tableComment}", tableComment);	
		
		data = data.replace("${tr_list}", tr_list);
		data = data.replace("${map_list}", map_list);
		data = data.replace("${td_count}", td_count+"");
		
		writeFile(fileName, data);
	}
	
	public void createJspEdit()throws Exception{
		
		frm.setTitle("选择增加/修改字段...");
		frm.setVisible(true);
		
		synchronized( this ) {
			wait(Long.MAX_VALUE);
		}
		
		String tr_list="";
		String map_list="";	
		String required_list="";
		String message_list="";
		String updateProperty="";
		for(int i=0;i<checkBox.length;i++){
			if(checkBox[i].isSelected()){
				ColumnInfo bean=(ColumnInfo)columnList.get(i);
				String type=parseBOType(bean.type);
				map_list+=
					",\n\t\t\t\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\":document.getElementById(\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\").value";
				if(!bean.nullAble){
					required_list+="\t\t\t\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\":{\n"+
							"\t\t\t\trequired:true\n"+
							"\t\t\t},\n";
					message_list+="\t\t\t\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\":{\n"+
							"\t\t\t\trequired:\"请输入"+bean.comment+"\"\n"+
							"\t\t\t},\n";
				}
				if(type.equals("java.lang.Integer")){
					required_list+="\t\t\t\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\":{\n"+
							"\t\t\t\tdigits:true,min:0\n"+
							"\t\t\t},\n";
					message_list+="\t\t\t\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\":{\n"+
							"\t\t\t\tdigits:\""+bean.comment+"必须为整数\",min:\""+bean.comment+"不能小于0\"\n"+
							"\t\t\t},\n";
				}
				
				tr_list+=
						"\t\t\t\t<tr>\n"+
							"\t\t\t\t\t<th >"+bean.comment;
						if(!bean.nullAble){
							tr_list+="<strong class=\"red\">*</strong>";
						}
						tr_list+="</th>\n\t\t\t\t\t<td>";
				if(type.equals("java.lang.String")){
					tr_list+="<input type=\"text\" name=\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\" value=\"<#if "+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"??>${"+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"!}</#if>\">";
				}
				else if(type.equals("java.lang.Integer")){
					tr_list+="<input type=\"text\" name=\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\" value=\"<#if "+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"??>${"+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"?c}</#if>\">";					
				}
				else if(type.equals("java.util.Date")){
					tr_list+=
						"<input type=\"text\" name=\""+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"\" value=\"<#if "+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"??>${("+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"?string('yyyy-MM-dd HH:mm:ss'))!}</#if>\""+
						"onfocus=\"WdatePicker({readOnly:true,startDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd HH:mm:ss',alwaysUseStartDate:true})\">";											
				}
				else{
					
				}
				tr_list+="</td>\n\t\t\t\t</tr>\n";
				
				if(!propertyFrom(bean.name).equals("id") && !propertyFrom(bean.name).equals("enableFlag") 
						&& !propertyFrom(bean.name).equals("createTime") && !propertyFrom(bean.name).equals("createBy")
						&& !propertyFrom(bean.name).equals("lastUpdateTime")){
					updateProperty+="\n\t\t\tpo.set"+UpperFirst(propertyFrom(bean.name))+"("+LowerFirst(baseName)+".get"+UpperFirst(propertyFrom(bean.name))+"());";
				}
			}
		}
		
		createAction(updateProperty);
		
		String fileName = jspPath + File.separator + LowerFirst(baseName) + File.separator +"edit.htm";
		System.out.println("creating createJspEdit...");
		if (!createFile(fileName)) {
			System.out.println(">>>createJspEdit-" + baseName+ "edit.htm is exist!");
			return;
		}
		String data = readModual("JspEdit.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${baseName.lowerFirst}", LowerFirst(baseName));
		data = data.replace("${tableComment}", tableComment);	
		
		data = data.replace("${tr_list}", tr_list);
		data = data.replace("${map_list}", map_list);
		if(required_list.length()>1)
			required_list = required_list.substring(0, required_list.length()-2);
		if(message_list.length()>1)
			message_list = message_list.substring(0, message_list.length()-2);
		data = data.replace("${required_list}", required_list);
		data = data.replace("${message_list}", message_list);
		
		
		writeFile(fileName, data);
	}
	public void createJspShow()throws Exception{
		
		frm.setTitle("选择查看字段...");
		frm.setVisible(true);
		
		synchronized( this ) {
			wait(Long.MAX_VALUE);
		}
		
		String tr_list="";
		
		for(int i=0;i<checkBox.length;i++){
			if(checkBox[i].isSelected()){
				ColumnInfo bean=(ColumnInfo)columnList.get(i);
				String type=parseBOType(bean.type);
				tr_list+=
						"\t\t\t\t<tr>\n"+
							"\t\t\t\t\t<th >"+bean.comment;						
						tr_list+="</th>\n\t\t\t\t\t<td>";
				if(type.equals("java.lang.String")){
					tr_list+="<#if "+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"??>${"+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"!}</#if>";
				}
				else if(type.equals("java.lang.Integer")){
					if(propertyFrom(bean.name).equals("createBy") || propertyFrom(bean.name).equals("lastUpdateBy"))						
						tr_list+="<#if "+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"??><@tag.userName id=\"${"+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"?c!0}\"/></#if>";					
					else
						tr_list+="<#if "+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"??>${"+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"?c}</#if>";					
				}
				else if(type.equals("java.util.Date")){
					tr_list+="<#if "+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"??>${("+LowerFirst(baseName)+"."+propertyFrom(bean.name)+"?string('yyyy-MM-dd HH:mm:ss'))!}</#if>";											
				}
				else{
					
				}
				tr_list+="</td>\n\t\t\t\t</tr>\n";				
			}
		}
		
		String fileName = jspPath + File.separator + LowerFirst(baseName) + File.separator +"show.htm";
		System.out.println("creating createJspShow...");
		if (!createFile(fileName)) {
			System.out.println(">>>createJspShow-" + baseName+ "show.htm is exist!");
			return;
		}
		String data = readModual("JspShow.txt");
		
		data = data.replace("${baseName}", baseName);
		data = data.replace("${baseName.lowerFirst}", LowerFirst(baseName));
		data = data.replace("${tableComment}", tableComment);	
		
		data = data.replace("${tr_list}", tr_list);
		
		writeFile(fileName, data);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
				
		//数据库配置
		BasicDataSource ds=new BasicDataSource();		
		ds.setDriverClassName(args[0]);
		ds.setUrl(args[1]);
		ds.setUsername(args[2]);
		ds.setPassword(args[3]);
				
		Generator gc = new Generator(ds,args[4],args[5],args[6],Boolean.parseBoolean(args[7]),
				args[8],args[9],args[10],args[11],
				args[12],args[13],args[14],args[15],args[16]);
		if(Boolean.parseBoolean(args[17])){
			System.out.println("generate AbastractBO");
			gc.createAbstractBO();
		}
		if(Boolean.parseBoolean(args[18])){
			System.out.println("generate BO");
			gc.createBO();
		}
		if(Boolean.parseBoolean(args[19])){
			System.out.println("generate BOMapper");
			gc.createOrmFile();
			gc.modifySqlMapConfig();
		}
		if(Boolean.parseBoolean(args[20])){
			System.out.println("generate Dao");
			gc.createDAO();
		}	
		if(Boolean.parseBoolean(args[21])){
			System.out.println("generate DaoImpl");
			gc.createDAOImpl();
		}	
		if(Boolean.parseBoolean(args[22])){
			System.out.println("generate Service");
			gc.createService();
		}	
		if(Boolean.parseBoolean(args[23])){
			System.out.println("generate ServiceImpl");
			gc.createServiceImpl();
		}	
		if(Boolean.parseBoolean(args[24])){
			System.out.println("generate Action");
			gc.createAction(null);
		}	
		if(Boolean.parseBoolean(args[25])){
			gc.initDlg();
			System.out.println("generate JSP");
			gc.createJspSearch();
			gc.createJspList();
			gc.createJspEdit();
			gc.createJspShow();
			gc.closeDlg();
		}
		System.exit(0);
	}

}
