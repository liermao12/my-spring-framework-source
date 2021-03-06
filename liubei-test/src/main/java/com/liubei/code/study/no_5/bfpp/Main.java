package com.liubei.code.study.no_5.bfpp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/6 4:28 下午
 * @Version 1.0
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-bfpp.xml");

		Book book01 = (Book)ac.getBean("book-01");
		Book book02 = (Book)ac.getBean("book-02");
		Book book03 = (Book)ac.getBean("book-03");
		System.out.println(book01);
		System.out.println(book02);
		System.out.println(book03);

	}
}
