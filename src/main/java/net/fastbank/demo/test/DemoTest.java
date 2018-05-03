package net.fastbank.demo.test;

import javax.sql.DataSource;

import net.fastbank.controller.DemoController;
import net.fastbank.mapper.TieziMapper;
import net.fastbank.service.DemoService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-tx.xml",
		"classpath:spring-mvc.xml"})
public class DemoTest {
	
	@Autowired
	DataSource dataSource;
	@Autowired
	DemoService demoService;
	
	@Autowired
	DemoController controller;
	
	@Autowired
	TieziMapper mapper;
	
	@Test
	public void dataSourceTest() {
		System.out.println(dataSource);
		System.out.println(demoService);
		System.out.println(controller);
		System.out.println(mapper);
	}

}
