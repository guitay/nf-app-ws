package com.nf.app.jx;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="APP_JXZC")
public class APP_JXZC {
	private String tjrq;//统计日期
	private String yf;//月份
	private Integer khdxdh;//考核对象代号
	private Integer hykhdxdh;//行员考核对象代号
	private String gzlb;//工资类别
	private BigDecimal gz;//工资
	private String gwlbmc;//岗位类别名称
	
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public String getYf() {
		return yf;
	}
	public void setYf(String yf) {
		this.yf = yf;
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
	public String getGzlb() {
		return gzlb;
	}
	public void setGzlb(String gzlb) {
		this.gzlb = gzlb;
	}
	public BigDecimal getGz() {
		return gz;
	}
	public void setGz(BigDecimal gz) {
		this.gz = gz;
	}
	public String getGwlbmc() {
		return gwlbmc;
	}
	public void setGwlbmc(String gwlbmc) {
		this.gwlbmc = gwlbmc;
	}
	
	
}
