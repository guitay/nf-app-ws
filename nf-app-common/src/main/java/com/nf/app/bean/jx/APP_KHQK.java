package com.nf.app.bean.jx;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

@XmlRootElement(name="APP_KHQK")
public class APP_KHQK  extends Model{
	private String tjrq;//统计日期
	private String yf;//月份
	private Integer khdxdh;//考核对象代号
	private Integer hykhdxdh;//行员考核对象代号
	private String khfl;//客户分类
	private String khsl;//客户数量
	private String khh;//客户号
	private String khmc;//客户名称
	
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
	public String getKhfl() {
		return khfl;
	}
	public void setKhfl(String khfl) {
		this.khfl = khfl;
	}
	public String getKhsl() {
		return khsl;
	}
	public void setKhsl(String khsl) {
		this.khsl = khsl;
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
	
}
