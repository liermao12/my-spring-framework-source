package com.liubei.code.study.no_2.lookup_method;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/2/5 1:09 上午
 * @Version 1.0
 */
public abstract class GetBeanTest {

	void showMe(){
		this.getBean().showMe();
	}

	public abstract User getBean();
}
