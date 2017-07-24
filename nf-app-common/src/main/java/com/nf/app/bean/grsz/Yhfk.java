package com.nf.app.bean.grsz;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

@XmlRootElement(name = "Yhfk")
public class Yhfk extends Model {
	private Integer khdxdh;

	private Integer tjrq;

	private String lynr;

	private String email;

	private String phone;

	private String txrq;

	public Integer getKhdxdh() {
		return khdxdh;
	}

	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}

	public Integer getTjrq() {
		return tjrq;
	}

	public void setTjrq(Integer tjrq) {
		this.tjrq = tjrq;
	}

	public String getLynr() {
		return lynr;
	}

	public void setLynr(String lynr) {
		this.lynr = lynr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTxrq() {
		return txrq;
	}

	public void setTxrq(String txrq) {
		this.txrq = txrq;
	}

}
