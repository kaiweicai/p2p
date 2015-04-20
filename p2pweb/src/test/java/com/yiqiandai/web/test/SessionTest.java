package com.yiqiandai.web.test;

import java.io.File;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yiqiandai.p2p.base.session.model.T1030;
import com.yiqiandai.p2p.base.session.service.T1030Service;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("/p2p-servlet-test.xml") 
public class SessionTest {
	Logger logger = LoggerFactory.getLogger(SessionTest.class);
	@Resource
	T1030Service sessionService;
	
	@Test
	public void testSessionService(){
//		T1030 session = sessionService.saveAndQuerySessionFromCookie("04923568-bd56-4960-9434-5c27f0c7f4f2", "192.168.0.1", "come from test");
//		logger.info(session.toString());
	}
}
