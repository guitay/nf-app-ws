package com.nf.app.bean.jx;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="APP_JXHZ")
public class APP_JXHZ {
	
	private String tjrq;//统计日期
	private Integer khdxdh;//考核对象代号
	private Integer hykhdxdh;//行员考核对象代号
	private String gwlbmc;//岗位类别名称
	private BigDecimal gzhz;//工资汇总
	private Integer tgwpm;//同岗位排名
	private Integer qhpm;//全行排名
	private BigDecimal bsy;//比上月
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
	public String getGwlbmc() {
		return gwlbmc;
	}
	public void setGwlbmc(String gwlbmc) {
		this.gwlbmc = gwlbmc;
	}
	public BigDecimal getGzhz() {
		return gzhz;
	}
	public void setGzhz(BigDecimal gzhz) {
		this.gzhz = gzhz;
	}
	public Integer getTgwpm() {
		return tgwpm;
	}
	public void setTgwpm(Integer tgwpm) {
		this.tgwpm = tgwpm;
	}
	public Integer getQhpm() {
		return qhpm;
	}
	public void setQhpm(Integer qhpm) {
		this.qhpm = qhpm;
	}
	public BigDecimal getBsy() {
		return bsy;
	}
	public void setBsy(BigDecimal bsy) {
		this.bsy = bsy;
	}
	
	
}
