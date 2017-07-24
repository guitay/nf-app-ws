package com.nf.app.bean.jx;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="APP_ZAN")
public class APP_ZAN {

	private String tjrq;//统计日期
	private Integer khdxdh;//考核对象代号（给予赞的人）
	private Integer hykhdxdh;//行员考核对象代号（被赞人）
	private Integer zcnts;//赞总数 
	private String sfz;//是否赞（登录行员对该行员）
	
	
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public Integer getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}
	public Integer getHykhdxdh() {
		return hykhdxdh;
	}
	public void setHykhdxdh(Integer hykhdxdh) {
		this.hykhdxdh = hykhdxdh;
	}
	public Integer getZcnts() {
		return zcnts;
	}
	public void setZcnts(Integer zcnts) {
		this.zcnts = zcnts;
	}
	public String getSfz() {
		return sfz;
	}
	public void setSfz(String sfz) {
		this.sfz = sfz;
	}
	
	
	
}
