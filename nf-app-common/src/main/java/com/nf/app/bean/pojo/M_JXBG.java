package com.nf.app.bean.pojo;

import java.util.HashMap;
import java.util.List;

/**
 * 绩效报告，用于转json
 * @author luoxt
 *
 */
public class M_JXBG {

	private String openid;
	private String wxh;
	private String wxmc;
	private String yhbs;
	private String hydh;
	private String scgz;
	
	//绑定的银行名称
	private String yhmc;
	//绑定的银行 机构名称
	private String jgmc;
	//绑定的行员名称
	private String hymc;
	//绑定银行的数据日期
	private String sjrq;
	
	List<HashMap<String,String>> data;

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getWxh() {
		return wxh;
	}

	public void setWxh(String wxh) {
		this.wxh = wxh;
	}

	public String getWxmc() {
		return wxmc;
	}

	public void setWxmc(String wxmc) {
		this.wxmc = wxmc;
	}

	public String getYhbs() {
		return yhbs;
	}

	public void setYhbs(String yhbs) {
		this.yhbs = yhbs;
	}

	public String getHydh() {
		return hydh;
	}

	public void setHydh(String hydh) {
		this.hydh = hydh;
	}

	public String getScgz() {
		return scgz;
	}

	public void setScgz(String scgz) {
		this.scgz = scgz;
	}

	public String getYhmc() {
		return yhmc;
	}

	public void setYhmc(String yhmc) {
		this.yhmc = yhmc;
	}

	public String getJgmc() {
		return jgmc;
	}

	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}

	public String getHymc() {
		return hymc;
	}

	public void setHymc(String hymc) {
		this.hymc = hymc;
	}

	public String getSjrq() {
		return sjrq;
	}

	public void setSjrq(String sjrq) {
		this.sjrq = sjrq;
	}

	public List<HashMap<String, String>> getData() {
		return data;
	}

	public void setData(List<HashMap<String, String>> data) {
		this.data = data;
	}

}
