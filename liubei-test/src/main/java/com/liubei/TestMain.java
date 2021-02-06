package com.liubei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/2/6 10:04 下午
 * @Version 1.0
 */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-bf.xml");
		ComponentA componentA = (ComponentA) context.getBean("componentA");
		System.out.println(componentA);
	}
}
