package com.nf.app.bean.kh;

import com.nf.app.bean.base.Model;

/**
 * 客户子菜单初始化界面信息实体类
 * @author zhouyan
 *
 */
public class KhcdPojo  extends Model{
	/**
	 * 统计日期
	 */
	private Integer tjrq;
	/**
	 * 考核对象代号
	 */
	private Integer khdxdh;
	/**
	 * 菜单编号
	 */
	private Integer cdbh;
	/**
	 * 菜单名称
	 */
	private String cdmc;
	/**
	 * 菜单描述
	 */
	private String cdms;
	/**
	 * 菜单维度 01-客户 ，02-业绩， 03-绩效
	 */
	private String cdwd;
	/**
	 * 菜单对应表
	 */
	private String cddyb;
	public Integer getTjrq() {
		return tjrq;
	}
	public void setTjrq(Integer tjrq) {
		this.tjrq = tjrq;
	}
	public Integer getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}
	public Integer getCdbh() {
		return cdbh;
	}
	public void setCdbh(Integer cdbh) {
		this.cdbh = cdbh;
	}
	public String getCdmc() {
		return cdmc;
	}
	public void setCdmc(String cdmc) {
		this.cdmc = cdmc;
	}
	public String getCdms() {
		return cdms;
	}
	public void setCdms(String cdms) {
		this.cdms = cdms;
	}
	public String getCdwd() {
		return cdwd;
	}
	public void setCdwd(String cdwd) {
		this.cdwd = cdwd;
	}
	public String getCddyb() {
		return cddyb;
	}
	public void setCddyb(String cddyb) {
		this.cddyb = cddyb;
	}
	
}
