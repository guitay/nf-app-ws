package com.nf.app.bean.pojo;

import com.nf.app.bean.base.Model;

//实体类 用于将SJBC 指标值 和指标名称 读取出来
public class M_FSNR  extends Model{
	private String hydh;//行员代号
	private String khzbmc;//考核指标名称
	private String zbz;//指标值
	private String yjdz;//邮件地址
	private String tjrq;//统计日期
	private String yhbs; //银行标识
	
	
	
	public String getYhbs() {
		return yhbs;
	}
	public void setYhbs(String yhbs) {
		this.yhbs = yhbs;
	}
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public String getYjdz() {
		return yjdz;
	}
	public void setYjdz(String yjdz) {
		this.yjdz = yjdz;
	}
	public String getHydh() {
		return hydh;
	}
	public void setHydh(String hydh) {
		this.hydh = hydh;
	}
	public String getKhzbmc() {
		return khzbmc;
	}
	public void setKhzbmc(String khzbmc) {
		this.khzbmc = khzbmc;
	}
	public String getZbz() {
		return zbz;
	}
	public void setZbz(String zbz) {
		this.zbz = zbz;
	}
	
	
}
