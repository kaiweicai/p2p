package com.yiqiandai.p2p.web.activity.view;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiqiandai.p2p.web.activity.bo.Activity;
import com.yiqiandai.p2p.web.activity.service.ActivityService;

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
	
	@RequestMapping(value = "/activityview.dhtml", method = GET)
	public String view(String id,Model model) {
		int activityId = Integer.parseInt(id);
		Activity activity = activityService.findById(activityId);
		model.addAttribute("activity", activity);
		return "/activity/activityView";
	}
}
