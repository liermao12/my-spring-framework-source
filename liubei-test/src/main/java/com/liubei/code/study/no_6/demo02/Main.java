package com.liubei.code.study.no_6.demo02;

import com.liubei.code.study.no_6.demo01.Animal;
import com.liubei.code.study.no_6.demo01.Cat;
import com.liubei.code.study.no_6.demo01.JdkDynamicProxy;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/7 9:23 午
 * @Version 1.0
 */
public class Main {
	public static void main(String[] args) {
		//1. 第一步 创建目标对象
		Cat cat = new Cat();
		cat.eat();
		System.out.println("-------------------------");

		//2.第一次代理，需要 JdkDynamicProxy
		JdkDynamicProxy dynamicProxy01 = new JdkDynamicProxy(cat);
		//只被代理一层的 代理对象
		Animal proxy01 = (Animal)dynamicProxy01.getProxy();

		proxy01.eat();
		System.out.println("--------------------------");

		//3.第二次代理，需要 JdkDynamicProxy2 + proxy01
		JdkDynamicProxy2 dynamicProxy02 = new JdkDynamicProxy2(proxy01);;

		Animal proxy02 = (Animal)dynamicProxy02.getProxy();
		proxy02.eat();

	}
}
