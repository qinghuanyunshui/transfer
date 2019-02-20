package com.qinghuan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.qinghuan.service.AccountService;

public class Test {
	public static void main(String[] args) {
		//加载配置spring-jdbcTemplate.xml
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//获取jdbcTemplate实例
		JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
		//获取accountBiz实例
		AccountService accountService=(AccountService) context.getBean("accountService");
		//银行转账
		accountService.transfer();
	}
}
