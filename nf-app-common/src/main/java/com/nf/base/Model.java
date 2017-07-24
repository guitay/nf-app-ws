package com.nf.base;

import java.io.Serializable;

public class Model implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String db;

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

}
