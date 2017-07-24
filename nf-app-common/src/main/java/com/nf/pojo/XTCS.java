package com.nf.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Xtcs")
public class XTCS {

	private String csmc;
	private String csz;
	private String csms;
	private String bzsm;
	private String zdbz;
	
	
	public String getCsmc() {
		return csmc;
	}
	public void setCsmc(String csmc) {
		this.csmc = csmc;
	}
	public String getCsz() {
		return csz;
	}
	public void setCsz(String csz) {
		this.csz = csz;
	}
	public String getCsms() {
		return csms;
	}
	public void setCsms(String csms) {
		this.csms = csms;
	}
	public String getBzsm() {
		return bzsm;
	}
	public void setBzsm(String bzsm) {
		this.bzsm = bzsm;
	}
	public String getZdbz() {
		return zdbz;
	}
	public void setZdbz(String zdbz) {
		this.zdbz = zdbz;
	}
	
	
}
