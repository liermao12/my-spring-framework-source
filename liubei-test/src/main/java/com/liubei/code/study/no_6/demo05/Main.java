package com.liubei.code.study.no_6.demo05;

import com.liubei.code.study.no_6.demo01.Animal;
import com.liubei.code.study.no_6.demo01.Cat;
import org.graalvm.compiler.nodes.CallTargetNode;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/13 12:30 上午
 * @Version 1.0
 */
public class Main {
	public static void main(String[] args) {

		Cat cat = new Cat();
		ProxyFactory proxyFactory = new ProxyFactory(cat);

		//proxyFactory.addAdvice(new MethodInterceptor01());
		//proxyFactory.addAdvice(new MethodInterceptor02());

		MyPointCut myPointCut = new MyPointCut();
		proxyFactory.addAdvisor(new DefaultPointcutAdvisor(myPointCut,new MethodInterceptor01()));
		proxyFactory.addAdvisor(new DefaultPointcutAdvisor(myPointCut,new MethodInterceptor02()));

		Animal proxy = (Animal)proxyFactory.getProxy();
		proxy.eat();
		proxy.go();

	}
}
