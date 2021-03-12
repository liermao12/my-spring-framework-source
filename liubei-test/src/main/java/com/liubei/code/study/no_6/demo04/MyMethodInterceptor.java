package com.liubei.code.study.no_6.demo04;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/12 11:22 下午
 * @Version 1.0
 */
public interface MyMethodInterceptor {

	/**
	 * 方法拦截器接口，增加逻辑，全部写在里面
	 * @param myMethodInvocation
	 * @return
	 */
	Object invoke(MyMethodInvocation myMethodInvocation) throws Throwable;
}
