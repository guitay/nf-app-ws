package com.nf.app.bean.grsz;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author 王启灵
 *
 */
@XmlRootElement(name="ZxpfCs")
public class ZxpfCs {
	private String khdxdh;
	private String cdbh;
	private String tjrq;
	private String pfzt;
	private String tableName;
	public String getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(String khdxdh) {
		this.khdxdh = khdxdh;
	}
	public String getCdbh() {
		return cdbh;
	}
	public void setCdbh(String cdbh) {
		this.cdbh = cdbh;
	}
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public String getPfzt() {
		return pfzt;
	}
	public void setPfzt(String pfzt) {
		this.pfzt = pfzt;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	@Override
	public String toString() {
		return "ZxpfCs [khdxdh=" + khdxdh + ", cdbh=" + cdbh + ", tjrq=" + tjrq
				+ ", pfzt=" + pfzt + ", tableName=" + tableName + "]";
	}
	
}
