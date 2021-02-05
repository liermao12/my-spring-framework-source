package com.liubei.code.study.no_2.lookup_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/2/5 1:09 上午
 * @Version 1.0
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring-lookup-method-test.xml");
		GetBeanTest test = (GetBeanTest)bf.getBean("getBeanTest");
		test.showMe();
	}
}
