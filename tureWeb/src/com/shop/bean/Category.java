package com.shop.bean;

import java.util.List;

public class Category {
	private Integer cid;
	private String cname;
	// 一级分类中存放二级分类的集合:
	private List<CategorySecond> categorySeconds;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public List<CategorySecond> getCategorySeconds() {
		return categorySeconds;
	}
	public void setCategorySeconds(List<CategorySecond> categorySeconds) {
		this.categorySeconds = categorySeconds;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	
}
