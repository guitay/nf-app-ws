package com.nf.app.bean.pojo;

import java.util.List;

public class MPAS_KHZBMC {
	private String khzbmc; //考核指标名称
	private List<MPAS_TDYJ> tdyjList;//团队业绩list
	private Integer listsize;
	public String getKhzbmc() {
		return khzbmc;
	}
	public void setKhzbmc(String khzbmc) {
		this.khzbmc = khzbmc;
	}
	public List<MPAS_TDYJ> getTdyjList() {
		return tdyjList;
	}
	public void setTdyjList(List<MPAS_TDYJ> tdyjList) {
		this.tdyjList = tdyjList;
	}
	public Integer getListsize() {
		return listsize;
	}
	public void setListsize(Integer listsize) {
		this.listsize = listsize;
	}
	
	
}
