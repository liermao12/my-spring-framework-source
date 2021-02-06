package com.liubei.code.study.no_3;

import com.liubei.code.study.no_2.lookup_method.GetBeanTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/2/7 1:05 上午
 * @Version 1.0
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("spring-instantiation-test.xml");
		Student student = bf.getBean(Student.class);
		System.out.println(student);
	}
}
