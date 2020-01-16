package com.woniu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniu.domain.Dept;
import com.woniu.service.IDeptService;

public class App {
	
	@Test
	public void test1() throws Exception {
		ApplicationContext ctx=//
				new ClassPathXmlApplicationContext("applicationContext.xml");
		IDeptService service=(IDeptService) ctx.getBean("deptServiceImpl");
		Dept dept=new Dept();
		dept.setDid(null);
		dept.setDname("ºº ı≤ø");
		service.save(dept);
	}

}
