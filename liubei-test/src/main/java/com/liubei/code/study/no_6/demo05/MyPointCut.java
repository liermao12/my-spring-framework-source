package com.liubei.code.study.no_6.demo05;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/13 12:33 上午
 * @Version 1.0
 */
public class MyPointCut implements Pointcut {

	@Override
	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			@Override
			public boolean matches(Class<?> clazz) {
				return true;
			}
		};
	}

	@Override
	public MethodMatcher getMethodMatcher() {
		return new MethodMatcher() {
			@Override
			public boolean matches(Method method, Class<?> targetClass) {
				if(method.getName().equals("eat")){
					return true;
				}
				return false;
			}

			@Override
			public boolean isRuntime() {
				return false;
			}

			@Override
			public boolean matches(Method method, Class<?> targetClass, Object... args) {
				return false;
			}
		};
	}
}
