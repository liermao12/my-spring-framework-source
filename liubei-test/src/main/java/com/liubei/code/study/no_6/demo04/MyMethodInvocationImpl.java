package com.liubei.code.study.no_6.demo04;

import com.liubei.code.study.no_6.demo03.TargetMethod;

import java.util.List;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/12 11:27 下午
 * @Version 1.0
 */
public class MyMethodInvocationImpl implements MyMethodInvocation {

	private TargetMethod targetMethod;

	private List<MyMethodInterceptor> interceptorList;

	private int index = 0;

	public MyMethodInvocationImpl(TargetMethod targetMethod, List<MyMethodInterceptor> interceptorList) {
		this.targetMethod = targetMethod;
		this.interceptorList = interceptorList;
	}

	@Override
	public Object proceed() throws Throwable {
		//拦截器全部执行完毕，接下来需要执行被代理接口方法！
		if (index == interceptorList.size()) {
			return targetMethod.getMethod().invoke(targetMethod.getTarget(), targetMethod.getArgs());
		}

		//到这里，说明还有拦截器 未执行呢
		MyMethodInterceptor interceptor = interceptorList.get(index++);
		return interceptor.invoke(this);
	}

	public void setInterceptorList(List<MyMethodInterceptor> interceptorList) {
		this.interceptorList = interceptorList;
	}
}
