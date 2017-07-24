package com.nf.app.bean.grsz;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

/**
 * 提醒设置
 * @author 王启灵
 *
 */
@XmlRootElement(name="Txsz")
public class Txsz extends Model{

	private Integer khdxdh;
	private String cslx;
	private String csz;
	private String sfqy;
	
	public Integer getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}
	public String getCslx() {
		return cslx;
	}
	public void setCslx(String cslx) {
		this.cslx = cslx;
	}
	public String getCsz() {
		return csz;
	}
	public void setCsz(String csz) {
		this.csz = csz;
	}
	public String getSfqy() {
		return sfqy;
	}
	public void setSfqy(String sfqy) {
		this.sfqy = sfqy;
	}

}
