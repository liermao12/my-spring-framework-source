package com.liubei.code.study.no_6.demo04;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/11 5:10 下午
 * @Version 1.0
 */
public interface MyMethodInvocation {

	/**
	 * 驱动拦截器链，执行增强逻辑 + 被代理方法调用
	 */
	Object proceed() throws Throwable;
}
