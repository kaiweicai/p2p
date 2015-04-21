package com.yiqiandai.p2p.activity.service;

import javax.annotation.Resource;
import com.yiqiandai.p2p.base.service.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.yiqiandai.p2p.activity.bo.Activity;
import com.yiqiandai.p2p.activity.dao.ActivityDAO;

/**
 * @comment 活动记录表Service实现类
 * @author Administrator
 * @date 2015-04-21 
 */
@Service 
public class ActivityServiceImpl extends BaseServiceImpl<Activity> implements ActivityService{
	
	public ActivityDAO getDao() {
		// TODO Auto-generated method stub
		return (ActivityDAO)super.dao;
	}
	
	@Resource(name="activityDAOImpl")
	public void setDao(ActivityDAO dao) {
		// TODO Auto-generated method stub
		super.dao = dao;
	}
}
