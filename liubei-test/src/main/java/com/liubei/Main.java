package com.liubei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 *
 * @Author ltb
 * @Date 2021/1/11 1:35 上午
 * @Version 1.0
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
		UserService userService = (UserService) context.getBean("userService");
		User user =  userService.getUserById(1);
		System.out.println(user);
	}
}
