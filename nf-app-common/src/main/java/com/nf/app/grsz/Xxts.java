package com.nf.app.grsz;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.base.Model;

/**
 * 消息推送
 * @author 王启灵
 *
 */
@XmlRootElement(name="Xxts")
public class Xxts extends Model {

	private Integer bh;		//编号
	private String xxlx;	//消息类型
	private String xxlj;	//消息链接
	private String tsnr;	//推送内容
	private String xxsj;	//消息时间
	private Integer tshy;	//推送行员
	private String zt;		//状态
	private String otsnr;	//原推送内容
	private Integer row;	//从第几行开始
	private Integer page;	//一页多少行
	private String cxsl;	//是否查询数量
	private String czxt;	//操作系统
	private String hydh;	//行员代号
	
	public String getHydh() {
		return hydh;
	}
	public void setHydh(String hydh) {
		this.hydh = hydh;
	}
	public String getCzxt() {
		return czxt;
	}
	public void setCzxt(String czxt) {
		this.czxt = czxt;
	}
	public String getCxsl() {
		return cxsl;
	}
	public void setCxsl(String cxsl) {
		this.cxsl = cxsl;
	}
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getOtsnr() {
		return otsnr;
	}
	public void setOtsnr(String otsnr) {
		this.otsnr = otsnr;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public Integer getBh() {
		return bh;
	}
	public void setBh(Integer bh) {
		this.bh = bh;
	}
	public String getXxlx() {
		return xxlx;
	}
	public void setXxlx(String xxlx) {
		this.xxlx = xxlx;
	}
	public String getXxlj() {
		return xxlj;
	}
	public void setXxlj(String xxlj) {
		this.xxlj = xxlj;
	}
	public String getTsnr() {
		return tsnr;
	}
	public void setTsnr(String tsnr) {
		this.tsnr = tsnr;
	}
	public String getXxsj() {
		return xxsj;
	}
	public void setXxsj(String xxsj) {
		this.xxsj = xxsj;
	}
	public Integer getTshy() {
		return tshy;
	}
	public void setTshy(Integer tshy) {
		this.tshy = tshy;
	}
	@Override
	public String toString() {
		return "Xxts [bh=" + bh + ", xxlx=" + xxlx + ", xxlj=" + xxlj
				+ ", tsnr=" + tsnr + ", xxsj=" + xxsj + ", tshy=" + tshy + "]";
	}
	
	
}
