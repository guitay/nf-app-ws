package com.nf.pojo;

import java.util.List;

public class DTDataPojo {
	  public String sEcho;
	  public int iTotalRecords;
	  public int iTotalDisplayRecords;
	  public List<Object> aaData;
	public String getsEcho() {
		return sEcho;
	}
	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}
	public int getiTotalRecords() {
		return iTotalRecords;
	}
	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}
	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}
	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}
	public List<Object> getAaData() {
		return aaData;
	}
	public void setAaData(List<Object> aaData) {
		this.aaData = aaData;
	}
}
