package com.o2o.model.result;

public class Answer {
	//回答内容
	private String content;
	//序号
	private int sort;
	
	public Answer(String content, int sort) {
		super();
		this.content = content;
		this.sort = sort;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	
}
