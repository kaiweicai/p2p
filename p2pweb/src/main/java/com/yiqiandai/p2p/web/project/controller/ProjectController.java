package com.yiqiandai.p2p.web.project.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yiqiandai.p2p.base.controller.BaseController;
import com.yiqiandai.p2p.common.annotation.Token;
import com.yiqiandai.p2p.web.project.bo.Project;
import com.yiqiandai.p2p.web.project.service.ProjectService;
import com.yiqiandai.p2p.web.user.UserModel;

/**
 * @comment Action
 * @author Administrator
 * @date 2015-06-12 
 */
@Controller
@RequestMapping("/project")
public class ProjectController extends BaseController<Project>{
	private static final String RESULT_SEARCH = "project/search";
	private static final String RESULT_EDIT = "project/projectEdit";
	private static final String RESULT_SHOW = "project/view";
	private static final String RESULT_LIST = "project/list";
	private static final String RESULT_SAVE = "project/projectEdit";
	@Resource
	private ProjectService projectService;
	
	/**
	 * 进入项目列表页面
	 */
	@RequestMapping(value="/list.dhtml",method=GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView();
		List<Project> projectList = projectService.pageQuery(new Project(), paginator);
		model.addObject("projectList", projectList);
		model.setViewName(RESULT_LIST);
		return model;
	}
	
	/**
	 * 进入修改页面
	 * /htm/project/edit.htm 
	 */
	@Token(save = true)
	@RequestMapping(value = "/edit/{id}.dhtml", method = { GET })
	public ModelAndView edit(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView();
		Project project = projectService.findById(id);
		modelAndView.addObject("project", project);
		modelAndView.setViewName(RESULT_EDIT);
		return modelAndView;
	}
	
	/**
	 * 保存	
	 */
	@Token(remove = true)
	@RequestMapping(value="/save.dhtml",method={GET,POST})
	public ModelAndView save(Project porject) {
		ModelAndView modelAndView = new ModelAndView();
		Integer id = projectService.saveOrUpdate(porject);
		Project p = projectService.findById(id);
		modelAndView.addObject("project", p);
		modelAndView.setViewName(RESULT_SAVE);
		return modelAndView;
	}
	
	/**
	 * 进入查询页面
	 * /htm/project/search.htm
	 */
	@RequestMapping(value="/search.dhtml",method=GET)
	public ModelAndView search(@ModelAttribute("projectModel") Project project) {
		ModelAndView model= new ModelAndView();
		List<Project> projectList =projectService.pageQuery(project, paginator);
		model.addObject("projectList",projectList);
		model.setViewName("RESULT_SEARCH");
		return model;
	}
		
	/**
	 * 进入查看页面
	 * /htm/project/show.htm 
	 */
	@RequestMapping(value="/view.dhtml?id={id}",method=GET)
	public ModelAndView show(@PathVariable Integer id)
	{
		ModelAndView modelAndView = new ModelAndView();
		Project project = projectService.findById(id);
		modelAndView.addObject("project", project);
		modelAndView.setViewName(RESULT_SHOW);
		return modelAndView;
	}
	
	
	
	/**
	 * 删除
	 */
	public String remove() 
	{
		return null;
	}
	
	/**
	 * 批量删除
	 */
	public String batchRemove() 
	{
		return null;
	}
}



