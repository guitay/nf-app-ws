package com.nf.app.jx;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 行员类别
 * @author 王启灵
 *
 */
@XmlRootElement(name="Hylb")
public class Hylb {

	private String hymc; //行员名称
	private String hylb; //行员类别
	
	public String getHymc() {
		return hymc;
	}
	public void setHymc(String hymc) {
		this.hymc = hymc;
	}
	public String getHylb() {
		return hylb;
	}
	public void setHylb(String hylb) {
		this.hylb = hylb;
	}
	
}
