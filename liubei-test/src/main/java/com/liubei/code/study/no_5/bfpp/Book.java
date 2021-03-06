package com.liubei.code.study.no_5.bfpp;

/**
 * TODO
 *
 * @Author: ltb
 * @Date: 2021/3/2 19:13
 * @Version: 1.0
 */
public class Book {

	private String name;

	private String author;

	public String getName() {
		return name;
	}

	public Book setName(String name) {
		this.name = name;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public Book setAuthor(String author) {
		this.author = author;
		return this;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				", author='" + author + '\'' +
				'}';
	}
}
