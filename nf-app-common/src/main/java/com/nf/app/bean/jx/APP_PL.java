package com.nf.app.bean.jx;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="APP_PL")
public class APP_PL {

	private String tjrq;//统计日期
	private String plr;//评论人名称
	private String plrkhdxdh; //评论人khdxdh
	private String bplrkhdxdh;//被评论人 hykhdxdh
	private String cdbh;//菜单编号
	private String plbh;//评论编号
	private String pl;//评论
	private String plsj;//评论时间
	private String hfcnt;//回复条数
	
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public String getPlr() {
		return plr;
	}
	public void setPlr(String plr) {
		this.plr = plr;
	}
	public String getPlrkhdxdh() {
		return plrkhdxdh;
	}
	public void setPlrkhdxdh(String plrkhdxdh) {
		this.plrkhdxdh = plrkhdxdh;
	}
	public String getBplrkhdxdh() {
		return bplrkhdxdh;
	}
	public void setBplrkhdxdh(String bplrkhdxdh) {
		this.bplrkhdxdh = bplrkhdxdh;
	}
	public String getCdbh() {
		return cdbh;
	}
	public void setCdbh(String cdbh) {
		this.cdbh = cdbh;
	}
	public String getPlbh() {
		return plbh;
	}
	public void setPlbh(String plbh) {
		this.plbh = plbh;
	}
	public String getPl() {
		return pl;
	}
	public void setPl(String pl) {
		this.pl = pl;
	}
	public String getPlsj() {
		return plsj;
	}
	public void setPlsj(String plsj) {
		this.plsj = plsj;
	}
	public String getHfcnt() {
		return hfcnt;
	}
	public void setHfcnt(String hfcnt) {
		this.hfcnt = hfcnt;
	}
	
}
