package com.liubei.code.study.no_6.demo03;

import com.liubei.code.study.no_6.demo01.Animal;
import com.liubei.code.study.no_6.demo01.Cat;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/7 9:41 下午
 * @Version 1.0
 */
public class Main {

	public static void main(String[] args) {
		//1.创建被代理对象
		Cat cat = new Cat();

		//2.创建一个责任链
		AbstractHandler headHandler = new AbstractHandler.HeadHandler();
		OneHandler one = new OneHandler();
		one.setNextHandler(new TwoHandler());
		headHandler.setNextHandler(one);

		//3.先创建 jdkdynamicproxy 对象
		JdkDynamicProxy dynamicProxy = new JdkDynamicProxy(cat, headHandler);

		//4.获取代理对象
		Animal proxy = (Animal) dynamicProxy.getProxy();
		proxy.eat();
	}

	public static class OneHandler extends AbstractHandler {

		@Override
		Object invoke(TargetMethod targetMethod) throws Throwable {
			System.out.println("one handler begin");
			Object ret = proceed(targetMethod);
			System.out.println("one handler end");
			return ret;
		}
	}

	public static class TwoHandler extends AbstractHandler {

		@Override
		Object invoke(TargetMethod targetMethod) throws Throwable {
			System.out.println("two handler begin");
			Object ret = proceed(targetMethod);
			System.out.println("two handler end");
			return ret;
		}
	}
}
