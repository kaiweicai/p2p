package com.yiqiandai.p2p.activity.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiqiandai.p2p.activity.bo.Activity;
import com.yiqiandai.p2p.activity.service.ActivityService;

/**
 * @comment 活动记录表Action
 * @author Administrator
 * @date 2015-04-21 
 */
@Controller
@RequestMapping("/act")
public class ActivityAction{
	@Resource
	private ActivityService activityService;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@RequestMapping(value = "/activityview.dhtml", method = GET)
	public String view(Model model, HttpServletRequest request, HttpSession session) {
		String activityId  = request.getParameter("id");
		int id = Integer.parseInt(activityId);
		Activity activity = activityService.findById(id);
		model.addAttribute("activity", activity);
		return "/activity/activityView";
	}
	
	public static void main(String[] args) {
//		System.out.println(UUID.randomUUID().toString());
		String key = UUID.randomUUID().toString();
		System.out.println(key);
	}
}
