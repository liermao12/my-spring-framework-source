package com.liubei.code.study.no_5.requiredProperties;

import com.liubei.code.study.no_5.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * TODO
 *
 * @Author: ltb
 * @Date: 2021/3/2 10:54
 * @Version: 1.0
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new MyClassPathXmlApplicationContext("spring-test.xml");
	}
}
