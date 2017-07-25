package com.nf.app.bean.jx;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

@XmlRootElement(name="APP_XTXX")
public class APP_XTXX  extends Model{

	private String tjrq;//统计日期
	private String khdxdh;//考核对象代号
	private String hykhdxdh;//行员考核对象代号
	private String xxbh;//消息编号
	private String xxwd;//消息维度
	private String xxlx;//消息类型
	private String xxzt;//消息状态
	private String xxnr;//消息内容
	private String xxsj;//消息时间
	private String sfck;//是否查看
	private String xxdz;//消息地址
	private String sfzy;//是否重要
	private String bxr;//编写人
	private String czlx;//操作类型
	
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public String getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(String khdxdh) {
		this.khdxdh = khdxdh;
	}
	public String getHykhdxdh() {
		return hykhdxdh;
	}
	public void setHykhdxdh(String hykhdxdh) {
		this.hykhdxdh = hykhdxdh;
	}
	public String getXxbh() {
		return xxbh;
	}
	public void setXxbh(String xxbh) {
		this.xxbh = xxbh;
	}
	public String getXxwd() {
		return xxwd;
	}
	public void setXxwd(String xxwd) {
		this.xxwd = xxwd;
	}
	public String getXxlx() {
		return xxlx;
	}
	public void setXxlx(String xxlx) {
		this.xxlx = xxlx;
	}
	public String getXxzt() {
		return xxzt;
	}
	public void setXxzt(String xxzt) {
		this.xxzt = xxzt;
	}
	public String getXxnr() {
		return xxnr;
	}
	public void setXxnr(String xxnr) {
		this.xxnr = xxnr;
	}
	public String getXxsj() {
		return xxsj;
	}
	public void setXxsj(String xxsj) {
		this.xxsj = xxsj;
	}
	public String getSfck() {
		return sfck;
	}
	public void setSfck(String sfck) {
		this.sfck = sfck;
	}
	public String getXxdz() {
		return xxdz;
	}
	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}
	public String getSfzy() {
		return sfzy;
	}
	public void setSfzy(String sfzy) {
		this.sfzy = sfzy;
	}
	public String getBxr() {
		return bxr;
	}
	public void setBxr(String bxr) {
		this.bxr = bxr;
	}
	public String getCzlx() {
		return czlx;
	}
	public void setCzlx(String czlx) {
		this.czlx = czlx;
	}
	
	
	
	
}
