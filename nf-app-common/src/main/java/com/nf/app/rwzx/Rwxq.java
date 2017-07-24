package com.nf.app.rwzx;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.base.Model;



@XmlRootElement(name="rwxq")
public class Rwxq extends Model {
	
private Integer khdxdh;
private Integer rwbh;
private String rwnr;
private String rwdd;
private String wcsj;
private String rwsm;
private String sfwc;
private String czsj;
private String lxdh;

public String getLxdh() {
	return lxdh;
}
public void setLxdh(String lxdh) {
	this.lxdh = lxdh;
}
public Integer getKhdxdh() {
	return khdxdh;
}
public void setKhdxdh(Integer khdxdh) {
	this.khdxdh = khdxdh;
}
public Integer getRwbh() {
	return rwbh;
}
public void setRwbh(Integer rwbh) {
	this.rwbh = rwbh;
}
public String getRwnr() {
	return rwnr;
}
public void setRwnr(String rwnr) {
	this.rwnr = rwnr;
}
public String getRwdd() {
	return rwdd;
}
public void setRwdd(String rwdd) {
	this.rwdd = rwdd;
}
public String getWcsj() {
	return wcsj;
}
public void setWcsj(String ts) {
	this.wcsj = ts;
}
public String getRwsm() {
	return rwsm;
}
public void setRwsm(String rwsm) {
	this.rwsm = rwsm;
}
public String getSfwc() {
	return sfwc;
}
public void setSfwc(String sfwc) {
	this.sfwc = sfwc;
}
public String getCzsj() {
	return czsj;
}
public void setCzsj(String czsj) {
	this.czsj = czsj;
}



}
