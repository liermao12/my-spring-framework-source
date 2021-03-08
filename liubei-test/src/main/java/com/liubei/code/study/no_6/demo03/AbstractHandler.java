package com.liubei.code.study.no_6.demo03;

import java.lang.reflect.InvocationTargetException;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/7 9:31 下午
 * @Version 1.0
 */
public abstract class AbstractHandler {
	/**
	 * 责任链 下一个 处理单元
	 */
	private AbstractHandler nextHandler;

	abstract Object invoke(TargetMethod targetMethod) throws Throwable ;

	public Object  proceed(TargetMethod targetMethod) throws Throwable {
		if (!hasNext()) {
			return targetMethod.getMethod().invoke(targetMethod.getTarget(), targetMethod.getArgs());
		}
		return nextHandler.invoke(targetMethod);
	}

	public boolean hasNext() {
		if (nextHandler != null) {
			return true;
		}
		return false;
	}

	public static class HeadHandler extends AbstractHandler{

		@Override
		Object invoke(TargetMethod targetMethod) {
			return null;
		}
	}


	public void setNextHandler(AbstractHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
