package com.liubei.code.study.no_6.demo05;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/13 12:29 上午
 * @Version 1.0
 */
public class MethodInterceptor01 implements MethodInterceptor {

	@Nullable
	@Override
	public Object invoke(@Nonnull MethodInvocation invocation) throws Throwable {
		System.out.println("MethodInterceptor01  start");
		Object ret =  invocation.proceed();
		System.out.println("MethodInterceptor01  end");
		return ret;
	}
}
