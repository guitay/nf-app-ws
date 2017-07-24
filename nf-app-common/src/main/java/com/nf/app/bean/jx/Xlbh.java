package com.nf.app.bean.jx;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Xlbh")
public class Xlbh {
    private String xlbh;   //序列编号
    private String xlmc;   //序列名称
	public String getXlbh() {
		return xlbh;
	}
	public void setXlbh(String xlbh) {
		this.xlbh = xlbh;
	}
	public String getXlmc() {
		return xlmc;
	}
	public void setXlmc(String xlmc) {
		this.xlmc = xlmc;
	}
    
    
}
