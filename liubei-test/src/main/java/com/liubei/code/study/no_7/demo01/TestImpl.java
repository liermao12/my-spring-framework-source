package com.liubei.code.study.no_7.demo01;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/14 2:21 下午
 * @Version 1.0
 */
public class TestImpl implements TestInterface{

	@Override
	public void dosomeTest() {
		System.out.println("dosomeTest execute");
	}

	@Override
	public void doOtherTest() {
		System.out.println("doOtherTest execute");
	}

	@Override
	public void a() {
		System.out.println("a function execute");
	}

	@Override
	public void b() {
		System.out.println("b function execute");
	}
}
