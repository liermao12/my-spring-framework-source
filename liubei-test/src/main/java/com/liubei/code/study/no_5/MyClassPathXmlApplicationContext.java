package com.liubei.code.study.no_5;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @Author: ltb
 * @Date: 2021/3/2 10:50
 * @Version: 1.0
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations) throws BeansException {
		super(configLocations);
	}

	/**
	 * 重写AbstractXmlApplicationContext.initPropertySources() 方法
	 * 在此指定需要验证非空的环境变量
	 */
	@Override
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("LG_HOME");
	}
}
