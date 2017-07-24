package com.nf.app.bean.grsz;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PfHyList")
public class PfHyList {

	private String tjrq;
	private String khdxdh;
	private String hymc;
	private String jgmc;
	private String lbmc;
	private String khdx;
	private String fabh;
	private String khqs;
	private List<PfInfo> infoList;
	private String pfksrq;
	private String pfjsrq;
	private String famc;
	private String khzq;
	private String dh; 
	private String khdxmc;
	
	
	
	public String getKhdxmc() {
		return khdxmc;
	}
	public void setKhdxmc(String khdxmc) {
		this.khdxmc = khdxmc;
	}
	
	public List<PfInfo> getInfoList() {
		return infoList;
	}
	public void setInfoList(List<PfInfo> infoList) {
		this.infoList = infoList;
	}
	public String getPfksrq() {
		return pfksrq;
	}
	public void setPfksrq(String pfksrq) {
		this.pfksrq = pfksrq;
	}
	public String getPfjsrq() {
		return pfjsrq;
	}
	public void setPfjsrq(String pfjsrq) {
		this.pfjsrq = pfjsrq;
	}
	public String getFamc() {
		return famc;
	}
	public void setFamc(String famc) {
		this.famc = famc;
	}
	public String getKhzq() {
		return khzq;
	}
	public void setKhzq(String khzq) {
		this.khzq = khzq;
	}
	public String getDh() {
		return dh;
	}
	public void setDh(String dh) {
		this.dh = dh;
	}
	public String getKhqs() {
		return khqs;
	}
	public void setKhqs(String khqs) {
		this.khqs = khqs;
	}
	public String getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(String khdxdh) {
		this.khdxdh = khdxdh;
	}
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public String getHymc() {
		return hymc;
	}
	public void setHymc(String hymc) {
		this.hymc = hymc;
	}
	public String getJgmc() {
		return jgmc;
	}
	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}
	public String getLbmc() {
		return lbmc;
	}
	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}

	public void setKhdx(String khdx) {
		this.khdx = khdx;
	}
	public String getKhdx() {
		return khdx;
	}
	public String getFabh() {
		return fabh;
	}
	public void setFabh(String fabh) {
		this.fabh = fabh;
	}
	
	
	
}
