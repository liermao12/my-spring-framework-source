package com.liubei.code.study.no_7.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/14 2:25 下午
 * @Version 1.0
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop-test.xml");

		TestInterface test = (TestInterface)applicationContext.getBean("test");
		test.dosomeTest();
		System.out.println("--------");
		test.doOtherTest();
		System.out.println("---------");
		test.a();
		test.b();

	}
}
