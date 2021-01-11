package com.liubei;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/1/11 1:36 上午
 * @Version 1.0
 */
public class User {

	private int age;

	private String name;

	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
