package com.o2o.model.result;

import java.util.List;

/**
 * 帮助
 * @author lenovo
 *
 */
public class Help {
	//问题
	private String ask;
	//排序
	private int sort;
	//
	private List<Answer> answer;
	
	
	public Help(String ask, int sort, List<Answer> answer) {
		super();
		this.ask = ask;
		this.sort = sort;
		this.answer = answer;
	}
	public String getAsk() {
		return ask;
	}
	public void setAsk(String ask) {
		this.ask = ask;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	

}
