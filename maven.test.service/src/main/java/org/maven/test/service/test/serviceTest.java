package org.maven.test.service.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.maven.test.service.RetrieveUserInfoService;
import org.maven.test.serviceimpl.AopTestServiceImpl;
import org.maven.test.serviceimpl.RetrieveTestService;
import org.maven.test.serviceimpl.RetrieveUserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class serviceTest extends TestCase {

	@Autowired
	private RetrieveUserInfoService userInfoService;
//	private ApplicationContext context;
//
//	@Before
//	public void setUp() {
//		context = new ClassPathXmlApplicationContext(
//				"bean.xml");
//	}

	@Test
	public void testRetrieveUserInfo() {
		List<String> list = new ArrayList<String>();
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"resource/applicationContext.xml");
		RetrieveUserInfoService userInfoService = (RetrieveUserInfoService)context.getBean("userInfoService");
		AopTestServiceImpl aop = (AopTestServiceImpl)context.getBean("aopTestServiceImpl");
		System.out.println(aop);
		userInfoService.batchRetrieveUserInfo(list);
	}
	
	@Test
	public void testRetrieve(){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"resource/applicationContext.xml");
		RetrieveTestService rts = (RetrieveTestService)context.getBean("test");
		System.out.print(rts.retrieveName("cloud"));
	}
}
