package com.liubei.code.study.no_6.demo04;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/12 11:41 下午
 * @Version 1.0
 */
public class TwoMethodInterceptor implements MyMethodInterceptor{

	@Override
	public Object invoke(MyMethodInvocation methodInvocation) throws Throwable {
		System.out.println("two interceptor begin");
		Object ret = methodInvocation.proceed();
		System.out.println("two interceptor end");
		return ret;
	}
}
