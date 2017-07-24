package com.nf.app.bean.ckyy;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;


@XmlRootElement(name="yjyy")
public class Ckyy extends Model {

	private Long lsh;

	private Integer khdxdh;

	private Integer jgkhdxdh;
	
	private String jgmc;

	private Integer khlx;

	private String khmc;

	private String zjlb;

	private String zjhm;

	private BigDecimal yjje;

	private Integer blrq;

	private Integer yyqsrq;

	private Integer yyjsrq;

	private String bz;

	private String ppbz;
	
	private String yylx;

	public String getJgmc() {
		return jgmc;
	}

	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}

	public Integer getBlrq() {
		return blrq;
	}

	public void setBlrq(Integer blrq) {
		this.blrq = blrq;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public Integer getJgkhdxdh() {
		return jgkhdxdh;
	}

	public void setJgkhdxdh(Integer jgkhdxdh) {
		this.jgkhdxdh = jgkhdxdh;
	}

	public Integer getKhdxdh() {
		return khdxdh;
	}

	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}

	public Integer getKhlx() {
		return khlx;
	}

	public void setKhlx(Integer khlx) {
		this.khlx = khlx;
	}

	public String getKhmc() {
		return khmc;
	}

	public void setKhmc(String khmc) {
		this.khmc = khmc;
	}


	
	public Long getLsh() {
		return lsh;
	}

	public void setLsh(Long lsh) {
		this.lsh = lsh;
	}

	public String getPpbz() {
		return ppbz;
	}

	public void setPpbz(String ppbz) {
		this.ppbz = ppbz;
	}

	public BigDecimal getYjje() {
		return yjje;
	}

	public void setYjje(BigDecimal yjje) {
		this.yjje = yjje;
	}

	public Integer getYyjsrq() {
		return yyjsrq;
	}

	public void setYyjsrq(Integer yyjsrq) {
		this.yyjsrq = yyjsrq;
	}

	public Integer getYyqsrq() {
		return yyqsrq;
	}

	public void setYyqsrq(Integer yyqsrq) {
		this.yyqsrq = yyqsrq;
	}

	public String getZjhm() {
		return zjhm;
	}

	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}

	public String getZjlb() {
		return zjlb;
	}

	public void setZjlb(String zjlb) {
		this.zjlb = zjlb;
	}

	public String getYylx() {
		return yylx;
	}

	public void setYylx(String yylx) {
		this.yylx = yylx;
	}

	

}
