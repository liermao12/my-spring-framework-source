package com.liubei.code.study.no_3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/2/7 1:16 上午
 * @Version 1.0
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	/**
	 * InstantiationAwareBeanPostProcessor 中自定义的方法
	 * 在方法实例化之前执行 Bean对象还没有
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("---->postProcessBeforeInstantiation");

		//利用cglib动态代理生成对象返回
		if (beanClass == Student.class) {
			Enhancer e = new Enhancer();
			e.setSuperclass(beanClass);
			e.setCallback(new MethodInterceptor() {
				@Override
				public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
					System.out.println("目标方法执行前："+method+"\n");
					Object object = methodProxy.invokeSuper(obj, objects);
					System.out.println("目标方法执行后："+method+"\n");
					return object;
				}
			});
			Student student = (Student)e.create();
			//返回代理类
			return student;
		}
		return null;
	}
}
