package com.nf.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "QueryCondition")
public class QueryCondition<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6844294080123073470L;

	public final static int DEFAULT_PAGE_SIZE = 50;
	/**
	 * 每页条数
	 */
	private int pageSize = DEFAULT_PAGE_SIZE;
	/**
	 * 开始行
	 */
	private long startRow;
	/**
	 * 查询条件类
	 */
	private T condition;
	
	private String db;

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getStartRow() {
		return startRow;
	}

	public void setStartRow(long startRow) {
		this.startRow = startRow;
	}

	public T getCondition() {
		return condition;
	}

	public void setCondition(T condition) {
		this.condition = condition;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static int getDefaultPageSize() {
		return DEFAULT_PAGE_SIZE;
	}

}
