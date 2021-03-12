package com.liubei.code.study.no_6.demo01;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/3/7 4:19 下午
 * @Version 1.0
 */
public class Cat implements Animal{
	@Override
	public void eat() {
		System.out.println("猫猫 吃 猫粮！");
	}

	@Override
	public void go() {
		System.out.println("猫猫~ 跑跑!");
	}
}
