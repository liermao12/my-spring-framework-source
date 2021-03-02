package com.liubei.code.study.no_5.fieldEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @Author: ltb
 * @Date: 2021/3/2 15:00
 * @Version: 1.0
 */
public class Main01 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-field-editor01.xml");
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
	}
}
