package com.nf.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Dmms")
public class Dmms {

	private String dmmc;
	private String dmz;
	private String dmms;
	private String dmsm;
	private Integer xh;

	public String getDmmc() {
		return dmmc;
	}

	public void setDmmc(String dmmc) {
		this.dmmc = dmmc;
	}

	public String getDmz() {
		return dmz;
	}

	public void setDmz(String dmz) {
		this.dmz = dmz;
	}

	public String getDmms() {
		return dmms;
	}

	public void setDmms(String dmms) {
		this.dmms = dmms;
	}

	public String getDmsm() {
		return dmsm;
	}

	public void setDmsm(String dmsm) {
		this.dmsm = dmsm;
	}

	public Integer getXh() {
		return xh;
	}

	public void setXh(Integer xh) {
		this.xh = xh;
	}

}