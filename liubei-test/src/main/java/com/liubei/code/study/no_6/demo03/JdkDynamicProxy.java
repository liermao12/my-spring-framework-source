package com.liubei.code.study.no_6.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/7 4:20 下午
 * @Version 1.0
 */
public class JdkDynamicProxy implements InvocationHandler {

    /**
	 * 被代理对象
	 */
	private Object target;

	/**
	 * 责任链 头结点
	 */
	private AbstractHandler headHandler;

	public JdkDynamicProxy(Object target,AbstractHandler headHandler){
		this.target = target;
		this.headHandler = headHandler;
	}

	public JdkDynamicProxy(Object target) {
		this.target = target;
	}

	/**
	 * @param proxy  代理对象，代理了target，代理对象内部持有target对象！
	 * @param method 被代理对象的方法
	 * @param args   被代理对象方法的入参
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		TargetMethod targetMethod = new TargetMethod();
		targetMethod.setTarget(target);
		targetMethod.setMethod(method);
		targetMethod.setArgs(args);
		return headHandler.proceed(targetMethod);
	}

	/**
	 * 返回代理之后的对象
	 */
	public Object getProxy() {
		//参数一：类加载器
		//参数二：代理类 需要 实现的接口集合
		//参数三：代理类虽然全部实现了接口方法，但是接口方法要依靠 InvocationHandler 去处理。
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}
}
