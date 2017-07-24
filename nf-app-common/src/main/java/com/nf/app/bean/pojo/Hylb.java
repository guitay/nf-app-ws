package com.nf.app.bean.pojo;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

@XmlRootElement(name = "Hylb")
public class Hylb extends Model {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String lbdh;
	private String lbmc;

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

}
