package com.nf.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Menu")
public class Menu {
	private Integer cdbh;
	private String cdmc;
	private String cdms;
	private String cddz;
	private String cdwd;
	private String cdtb;
	private Integer cdpx;

	public Integer getCdbh() {
		return cdbh;
	}

	public void setCdbh(Integer cdbh) {
		this.cdbh = cdbh;
	}

	public String getCdmc() {
		return cdmc;
	}

	public void setCdmc(String cdmc) {
		this.cdmc = cdmc;
	}

	public String getCdms() {
		return cdms;
	}

	public void setCdms(String cdms) {
		this.cdms = cdms;
	}

	public String getCddz() {
		return cddz;
	}

	public void setCddz(String cddz) {
		this.cddz = cddz;
	}

	public String getCdwd() {
		return cdwd;
	}

	public void setCdwd(String cdwd) {
		this.cdwd = cdwd;
	}

	public String getCdtb() {
		return cdtb;
	}

	public void setCdtb(String cdtb) {
		this.cdtb = cdtb;
	}

	public Integer getCdpx() {
		return cdpx;
	}

	public void setCdpx(Integer cdpx) {
		this.cdpx = cdpx;
	}

}
