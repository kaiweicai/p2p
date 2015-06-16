package com.yiqiandai.p2p.web.project.service;

import javax.annotation.Resource;
import com.yiqiandai.p2p.base.service.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.yiqiandai.p2p.web.project.bo.Project;
import com.yiqiandai.p2p.web.project.dao.ProjectDAO;

/**
 * @comment Service实现类
 * @author Administrator
 * @date 2015-06-12 
 */
@Service 
public class ProjectServiceImpl extends BaseServiceImpl<Project> implements ProjectService{
	
	public ProjectDAO getDao() {
		return (ProjectDAO)super.dao;
	}
	
	@Resource(name="projectDAOImpl")
	public void setDao(ProjectDAO dao) {
		super.dao = dao;
	}
}
