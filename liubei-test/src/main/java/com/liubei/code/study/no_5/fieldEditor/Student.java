package com.liubei.code.study.no_5.fieldEditor;

import java.util.Date;

/**
 *
 *
 * @Author: ltb
 * @Date: 2021/3/2 14:47
 * @Version: 1.0
 */
public class Student {

	private String name;

	private Date birthday;

	public String getName() {
		return name;
	}

	public Student setName(String name) {
		this.name = name;
		return this;
	}

	public Date getBirthday() {
		return birthday;
	}

	public Student setBirthday(Date birthday) {
		this.birthday = birthday;
		return this;
	}
}
