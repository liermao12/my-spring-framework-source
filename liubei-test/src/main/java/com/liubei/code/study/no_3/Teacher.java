package com.liubei.code.study.no_3;

import com.liubei.code.study.no_2.lookup_method.User;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/2/5 1:09 上午
 * @Version 1.0
 */
public class Teacher extends User {

	private String id;

	private String name;

	private String subject;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
