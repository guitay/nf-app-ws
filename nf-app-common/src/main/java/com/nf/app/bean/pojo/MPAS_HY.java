package com.nf.app.bean.pojo;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

/**
 * 登陆行员
 * 
 * @author
 *
 */
@XmlRootElement(name = "MPAS_HY")
public class MPAS_HY extends Model {
	
	
	
	private Integer khdxdh;// 考核对象代号

	private String dlmc; // 登陆名称
	private String dlmm; // 登陆密码

	private String hydh; // 行员代号
	private String hymc; // 行员名称

	private Integer jgkhdxdh; // 机构考核对象代号
	private String jgdh;// 机构代号
	private String jgmc;// 机构名称

	private String lbdh;// 类别代号
	private String lbmc;// 类别名称

	private String xtrq;// 系统日期

	public String getDlmm() {
		return dlmm;
	}

	public void setDlmm(String dlmm) {
		this.dlmm = dlmm;
	}

	public String getDlmc() {
		return dlmc;
	}

	public void setDlmc(String dlmc) {
		this.dlmc = dlmc;
	}

	public String getHydh() {
		return hydh;
	}

	public void setHydh(String hydh) {
		this.hydh = hydh;
	}

	public String getHymc() {
		return hymc;
	}

	public void setHymc(String hymc) {
		this.hymc = hymc;
	}

	public String getJgdh() {
		return jgdh;
	}

	public void setJgdh(String jgdh) {
		this.jgdh = jgdh;
	}

	public String getJgmc() {
		return jgmc;
	}

	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}

	public String getLbdh() {
		return lbdh;
	}

	public void setLbdh(String lbdh) {
		this.lbdh = lbdh;
	}

	public String getLbmc() {
		return lbmc;
	}

	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}

	public Integer getKhdxdh() {
		return khdxdh;
	}

	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}

	public Integer getJgkhdxdh() {
		return jgkhdxdh;
	}

	public void setJgkhdxdh(Integer jgkhdxdh) {
		this.jgkhdxdh = jgkhdxdh;
	}

	public String getXtrq() {
		return xtrq;
	}

	public void setXtrq(String xtrq) {
		this.xtrq = xtrq;
	}

}
