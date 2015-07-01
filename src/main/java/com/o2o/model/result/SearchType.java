/**
 * 
 */
package com.o2o.model.result;

import java.util.List;

/**
 * @author lenovo
 * 搜索分类接口
 */
public class SearchType {
	//id
	private int id;
	//名称
	private String name;
	//名称
	private String tagname;
	//排序
	private int sort;
	//子类别
	private List<SearchType> suntype;
	
	
	public SearchType(int id, String name, String tagname, int sort,
			List<SearchType> suntype) {
		super();
		this.id = id;
		this.name = name;
		this.tagname = tagname;
		this.sort = sort;
		this.suntype = suntype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTagname() {
		return tagname;
	}
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public List<SearchType> getSuntype() {
		return suntype;
	}
	public void setSuntype(List<SearchType> suntype) {
		this.suntype = suntype;
	}
	
	

}
