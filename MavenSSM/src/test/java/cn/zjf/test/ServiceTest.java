package cn.zjf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zjf.service.AccountDaoService;

public class ServiceTest {

	public static void main(String[] args) {
		ApplicationContext app = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDaoService ads = app.getBean("accountService",AccountDaoService.class);
		System.out.println(ads.login("lwj", "123"));
	}

}
