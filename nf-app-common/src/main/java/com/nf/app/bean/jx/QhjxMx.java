package com.nf.app.bean.jx;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 全行绩效明细
 * @author 王启灵
 *
 */
@XmlRootElement(name="QhjxMx")
public class QhjxMx {

	private Integer tjrq; //统计日期
	private Integer hykhdxdh; //行员考核对象代号
	private String jgmc; //机构名称
	private String hymc; //行员名称
	private String lbmc; //类别名称
	private Double jx; //绩效
	private Integer jxzb; //绩效指标
	
	public Integer getTjrq() {
		return tjrq;
	}
	public void setTjrq(Integer tjrq) {
		this.tjrq = tjrq;
	}
	public Integer getHykhdxdh() {
		return hykhdxdh;
	}
	public void setHykhdxdh(Integer hykhdxdh) {
		this.hykhdxdh = hykhdxdh;
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
	public String getLbmc() {
		return lbmc;
	}
	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}
	public Double getJx() {
		return jx;
	}
	public void setJx(Double jx) {
		this.jx = jx;
	}
	public Integer getJxzb() {
		return jxzb;
	}
	public void setJxzb(Integer jxzb) {
		this.jxzb = jxzb;
	}
	
}
