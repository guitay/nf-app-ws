package com.nf.app.bean.jx;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="APP_JXMX")
public class APP_JXMX {
	private String tjrq;//统计日期
	private String yf;//月份
	private Integer khdxdh;//考核对象代号
	private Integer hykhdxdh;//行员考核对象代号
	private Integer gzxbh;//工资项编号
	private String gzxmc;//工资项名称
	private BigDecimal gzxz;//工资项值
	private Integer pm;//排名
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
	public Integer getGzxbh() {
		return gzxbh;
	}
	public void setGzxbh(Integer gzxbh) {
		this.gzxbh = gzxbh;
	}
	public String getGzxmc() {
		return gzxmc;
	}
	public void setGzxmc(String gzxmc) {
		this.gzxmc = gzxmc;
	}
	public BigDecimal getGzxz() {
		return gzxz;
	}
	public void setGzxz(BigDecimal gzxz) {
		this.gzxz = gzxz;
	}
	public Integer getPm() {
		return pm;
	}
	public void setPm(Integer pm) {
		this.pm = pm;
	}
	
}
