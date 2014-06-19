package org.springmvc.model;

import java.util.Set;

public class Chapter {
	private int number;
	private Title title;

	public Chapter(int number, Title title, String content) {
		this.number = number;
		this.title = title;
		this.content = content;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private String content;

}
