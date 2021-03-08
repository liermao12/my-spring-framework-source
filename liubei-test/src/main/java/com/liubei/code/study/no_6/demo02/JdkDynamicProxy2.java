package com.liubei.code.study.no_6.demo02;

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
public class JdkDynamicProxy2 implements InvocationHandler {

	/**
	 * 被代理对象
	 */
	private Object target;

	public JdkDynamicProxy2(Object target) {
		this.target = target;
	}

	/**
	 * @param proxy  代理对象，代理了target，代理对象内部持有target对象！
	 * @param method 被代理对象的方法
	 * @param args   被代理对象方法的入参
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//需求1：打印出来 参数个数
		System.out.println("方法参数个数为：" + (args != null ? args.length : 0));
		Object ret = method.invoke(target, args);
		//需求2：打印出来 返回值
		System.out.println("方法返回值为：" + (ret != null ? ret : "空"));
		return ret;
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
