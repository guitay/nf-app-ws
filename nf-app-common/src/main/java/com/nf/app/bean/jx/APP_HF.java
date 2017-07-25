package com.nf.app.bean.jx;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

@XmlRootElement(name="APP_HF")
public class APP_HF  extends Model{

	private String tjrq; //统计日期
	private String plr;//评论人名称
	private String plrkhdxdh;//评论人考核对象代号
	private String bplrkhdxdh;//被评论人考核对象代号
	private String cdbh;//菜单编号
	private String plbh;//评论编号
	private String pl;//评论
	private String plsj;//评论时间
	private Integer hfbh;//回复编号
	private Integer hfrkhdxdh;//回复人考核对象代号
	private String hfr;//回复人名称
	private String hf;//回复内容
	private String hfsj;//回复时间
	
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public String getPlr() {
		return plr;
	}
	public void setPlr(String plr) {
		this.plr = plr;
	}
	public String getPlrkhdxdh() {
		return plrkhdxdh;
	}
	public void setPlrkhdxdh(String plrkhdxdh) {
		this.plrkhdxdh = plrkhdxdh;
	}
	public String getBplrkhdxdh() {
		return bplrkhdxdh;
	}
	public void setBplrkhdxdh(String bplrkhdxdh) {
		this.bplrkhdxdh = bplrkhdxdh;
	}
	public String getCdbh() {
		return cdbh;
	}
	public void setCdbh(String cdbh) {
		this.cdbh = cdbh;
	}
	public String getPlbh() {
		return plbh;
	}
	public void setPlbh(String plbh) {
		this.plbh = plbh;
	}
	public String getPl() {
		return pl;
	}
	public void setPl(String pl) {
		this.pl = pl;
	}
	public String getPlsj() {
		return plsj;
	}
	public void setPlsj(String plsj) {
		this.plsj = plsj;
	}
	public Integer getHfbh() {
		return hfbh;
	}
	public void setHfbh(Integer hfbh) {
		this.hfbh = hfbh;
	}
	public Integer getHfrkhdxdh() {
		return hfrkhdxdh;
	}
	public void setHfrkhdxdh(Integer hfrkhdxdh) {
		this.hfrkhdxdh = hfrkhdxdh;
	}
	public String getHfr() {
		return hfr;
	}
	public void setHfr(String hfr) {
		this.hfr = hfr;
	}
	public String getHf() {
		return hf;
	}
	public void setHf(String hf) {
		this.hf = hf;
	}
	public String getHfsj() {
		return hfsj;
	}
	public void setHfsj(String hfsj) {
		this.hfsj = hfsj;
	}
		
}
