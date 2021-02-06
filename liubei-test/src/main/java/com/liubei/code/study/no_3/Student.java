package com.liubei.code.study.no_3;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/2/7 1:06 上午
 * @Version 1.0
 */
public class Student {

	private String id;

	private String name;

	@Autowired
	private Teacher teacher;

	public Student() {
	}

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public void start(){
		System.out.println("student bean init method 【start()】 invoked!");
	}

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
