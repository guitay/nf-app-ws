package com.nf.app.bean.kh;

import java.util.List;
import java.util.Map;

/**
 * 客户信息
 * @author zhouyan
 *
 */
@SuppressWarnings("unchecked")
public class Customer {
	/**
	 * 考核对象代号
	 */
	private Integer khdxdh;
	/**
	 * 统计日期
	 */
	private Integer tjrq;
	/**
	 * 客户号
	 */
	private String khh;
	/**
	 * 客户名称
	 */
	private String khmc;
	/**
	 * 客户余额
	 */
	private double khye;
	/**
	 * 账户标识(1-对公 2-个人)
	 */
	private String zhbs;
	/**
	 * 是否关注
	 */
	private String sfgz;
	
	private double bhje;
	
	/**
	 * 账户信息集合
	 */
	private List<Map> zhList;
	
	public List<Map> getZhList() {
		return zhList;
	}
	public void setZhList(List<Map> zhList) {
		this.zhList = zhList;
	}
	public Integer getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}
	public Integer getTjrq() {
		return tjrq;
	}
	public void setTjrq(Integer tjrq) {
		this.tjrq = tjrq;
	}
	public String getKhh() {
		return khh;
	}
	public void setKhh(String khh) {
		this.khh = khh;
	}
	public String getKhmc() {
		return khmc;
	}
	public void setKhmc(String khmc) {
		this.khmc = khmc;
	}
	public double getKhye() {
		return khye;
	}
	public void setKhye(double khye) {
		this.khye = khye;
	}
	public String getZhbs() {
		return zhbs;
	}
	public void setZhbs(String zhbs) {
		this.zhbs = zhbs;
	}
	public String getSfgz() {
		return sfgz;
	}
	public void setSfgz(String sfgz) {
		this.sfgz = sfgz;
	}
	public double getBhje() {
		return bhje;
	}
	public void setBhje(double bhje) {
		this.bhje = bhje;
	}
	
}
