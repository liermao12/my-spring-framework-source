package com.liubei.code.study.no_6.demo04;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/12 11:38 下午
 * @Version 1.0
 */
public class OneMethodInterceptor implements MyMethodInterceptor{
	@Override
	public Object invoke(MyMethodInvocation myMethodInvocation) throws Throwable{
		System.out.println("one interceptor begin");
		Object ret = myMethodInvocation.proceed();
		System.out.println("one interceptor end");
		return ret;
	}
}
