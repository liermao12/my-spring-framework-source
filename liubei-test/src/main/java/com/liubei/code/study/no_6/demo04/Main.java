package com.liubei.code.study.no_6.demo04;

import com.liubei.code.study.no_6.demo01.Animal;
import com.liubei.code.study.no_6.demo01.Cat;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/12 11:43 下午
 * @Version 1.0
 */
public class Main {
	public static void main(String[] args) {
		//1.创建目标对象，被代理对象
		Cat cat = new Cat();
		//2.创建JdkDynamicProxy ，用来创建代理对象
		JdkDynamicProxy dynamicProxy = new JdkDynamicProxy(cat);
		//3.咱们的目的是 使用 方法拦截器，去增加方法！
		dynamicProxy.addInterceptor(new OneMethodInterceptor());
		dynamicProxy.addInterceptor(new TwoMethodInterceptor());

		//4.获取代理对象！
		Animal proxy = (Animal)dynamicProxy.getProxy();
		proxy.eat();
	}
}
