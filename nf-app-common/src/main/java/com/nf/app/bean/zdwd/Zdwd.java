package com.nf.app.bean.zdwd;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="Zdwd")
public class Zdwd {

	private Integer tjrq;
	private Integer wdbh;
	private Integer scr;
	private Integer scrq;
	private String pxbz;
	private String wdmc;
	private String scrmc;
	
	public Integer getTjrq() {
		return tjrq;
	}
	public void setTjrq(Integer tjrq) {
		this.tjrq = tjrq;
	}
	public Integer getWdbh() {
		return wdbh;
	}
	public void setWdbh(Integer wdbh) {
		this.wdbh = wdbh;
	}
	public Integer getScr() {
		return scr;
	}
	public void setScr(Integer scr) {
		this.scr = scr;
	}
	public Integer getScrq() {
		return scrq;
	}
	public void setScrq(Integer scrq) {
		this.scrq = scrq;
	}
	public String getPxbz() {
		return pxbz;
	}
	public void setPxbz(String pxbz) {
		this.pxbz = pxbz;
	}
	public String getWdmc() {
		return wdmc;
	}
	public void setWdmc(String wdmc) {
		this.wdmc = wdmc;
	}
	public String getScrmc() {
		return scrmc;
	}
	public void setScrmc(String scrmc) {
		this.scrmc = scrmc;
	}
	
}
