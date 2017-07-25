package com.nf.app.bean.jx;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

@XmlRootElement(name="KhpmList")
public class KhpmList extends Model {
	
	private Integer tjrq;     //统计日期
	private Integer khdxdh;   //考核对象代号
    private String pmlx;      //排名类型
    private Integer xlbh;     //类型编号
    private String xlmc;      //类型名称
    private String lbdh;      //行员类型
    private String lbmc;      //行员岗位
    private BigDecimal khdf;  //考核得分
    private String szjgpm;   //所在机构排名
    private String qxpm;     //全辖排名 
    private String jgmc;     //机构名称
    private String hymc;     //行员名称
	public Integer getTjrq() {
		return tjrq;
	}
	public void setTjrq(Integer tjrq) {
		this.tjrq = tjrq;
	}
	public Integer getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}
	public String getPmlx() {
		return pmlx;
	}
	public void setPmlx(String pmlx) {
		this.pmlx = pmlx;
	}
	public Integer getXlbh() {
		return xlbh;
	}
	public void setXlbh(Integer xlbh) {
		this.xlbh = xlbh;
	}
	public String getXlmc() {
		return xlmc;
	}
	public void setXlmc(String xlmc) {
		this.xlmc = xlmc;
	}
	public String getLbdh() {
		return lbdh;
	}
	public void setLbdh(String lbdh) {
		this.lbdh = lbdh;
	}
	public String getLbmc() {
		return lbmc;
	}
	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}
	public BigDecimal getKhdf() {
		return khdf;
	}
	public void setKhdf(BigDecimal khdf) {
		this.khdf = khdf;
	}
	public String getSzjgpm() {
		return szjgpm;
	}
	public void setSzjgpm(String szjgpm) {
		this.szjgpm = szjgpm;
	}
	public String getQxpm() {
		return qxpm;
	}
	public void setQxpm(String qxpm) {
		this.qxpm = qxpm;
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
    
    
}
