package com.nf.app.bean.jx;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

@XmlRootElement(name="APP_JXGZ")
public class APP_JXGZ extends Model {
	private String tjrq;//统计日期
	private Integer khdxdh;//考核对象代号
	private Integer hykhdxdh; //行员考核对象代号
	private BigDecimal jx;//绩效
	private BigDecimal bsrjx;//比上日绩效
	private BigDecimal bsymjx;//比上月末绩效
	private BigDecimal bsrbl;//比上日比例
	private BigDecimal bsymbl;//比上月末比例
	private BigDecimal jxzb;//绩效占比
	private String jxlbmc;//绩效类别名称
	private String hymc;
	private String jgmc;
	private String lbmc;
	

	
	
	
	public String getHymc() {
		return hymc;
	}
	public void setHymc(String hymc) {
		this.hymc = hymc;
	}
	public String getJgmc() {
		return jgmc;
	}
	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}
	public String getLbmc() {
		return lbmc;
	}
	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}
	public String getJxlbmc() {
		return jxlbmc;
	}
	public void setJxlbmc(String jxlbmc) {
		this.jxlbmc = jxlbmc;
	}
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public Integer getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}
	public Integer getHykhdxdh() {
		return hykhdxdh;
	}
	public void setHykhdxdh(Integer hykhdxdh) {
		this.hykhdxdh = hykhdxdh;
	}
	public BigDecimal getJx() {
		return jx;
	}
	public void setJx(BigDecimal jx) {
		this.jx = jx;
	}
	public BigDecimal getBsrjx() {
		return bsrjx;
	}
	public void setBsrjx(BigDecimal bsrjx) {
		this.bsrjx = bsrjx;
	}
	public BigDecimal getBsymjx() {
		return bsymjx;
	}
	public void setBsymjx(BigDecimal bsymjx) {
		this.bsymjx = bsymjx;
	}
	public BigDecimal getBsrbl() {
		return bsrbl;
	}
	public void setBsrbl(BigDecimal bsrbl) {
		this.bsrbl = bsrbl;
	}
	public BigDecimal getBsymbl() {
		return bsymbl;
	}
	public void setBsymbl(BigDecimal bsymbl) {
		this.bsymbl = bsymbl;
	}
	public BigDecimal getJxzb() {
		return jxzb;
	}
	public void setJxzb(BigDecimal jxzb) {
		this.jxzb = jxzb;
	}
	
	
	
}
