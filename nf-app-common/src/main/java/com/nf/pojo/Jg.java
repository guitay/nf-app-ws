package com.nf.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Jg")
public class Jg {
	private String ywlb; // 业务类别
	private String ms; // 描述
	private String jgdh; // 机构代号
	private String hydh; // 行员代号
	private Integer khdxdh; // 考核对象代号
	private String hymc; // 行员名称
	private Integer jgkhdxdh; // 机构考核对象代号
	private Integer sjkhdxdh; // 上级考核对象代号
	private Integer jgjb; // 机构级别
	private String jgmc; // 机构名称
	private Integer pxbz; // 排序标志
	private Integer zbdh;
	private String zbmc;
	private Integer bz = 0; // 是否选择
	private Integer xn;

	private Jg parent;

	private List<Jg> jgChildren;
	
	private boolean hasChild=true;
	
	
	
	
	public List<Jg> getJgChildren() {
		return jgChildren;
	}

	public void setJgChildren(List<Jg> jgChildren) {
		this.jgChildren = jgChildren;
	}

	public boolean isHasChild() {
		return hasChild;
	}

	public void setHasChild(boolean hasChild) {
		this.hasChild = hasChild;
	}

	public Jg getParent() {
		return parent;
	}

	public void setParent(Jg parent) {
		this.parent = parent;
	}

	public String getYwlb() {
		return ywlb;
	}

	public void setYwlb(String ywlb) {
		this.ywlb = ywlb;
	}

	public String getMs() {
		return ms;
	}

	public void setMs(String ms) {
		this.ms = ms;
	}

	public String getJgdh() {
		return jgdh;
	}

	public void setJgdh(String jgdh) {
		this.jgdh = jgdh;
	}

	public String getHydh() {
		return hydh;
	}

	public void setHydh(String hydh) {
		this.hydh = hydh;
	}

	public Integer getKhdxdh() {
		return khdxdh;
	}

	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}

	public String getHymc() {
		return hymc;
	}

	public void setHymc(String hymc) {
		this.hymc = hymc;
	}

	public Integer getJgkhdxdh() {
		return jgkhdxdh;
	}

	public void setJgkhdxdh(Integer jgkhdxdh) {
		this.jgkhdxdh = jgkhdxdh;
	}

	public Integer getSjkhdxdh() {
		return sjkhdxdh;
	}

	public void setSjkhdxdh(Integer sjkhdxdh) {
		this.sjkhdxdh = sjkhdxdh;
	}

	public Integer getJgjb() {
		return jgjb;
	}

	public void setJgjb(Integer jgjb) {
		this.jgjb = jgjb;
	}

	public String getJgmc() {
		return jgmc;
	}

	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}

	public Integer getPxbz() {
		return pxbz;
	}

	public void setPxbz(Integer pxbz) {
		this.pxbz = pxbz;
	}

	public Integer getZbdh() {
		return zbdh;
	}

	public void setZbdh(Integer zbdh) {
		this.zbdh = zbdh;
	}

	public String getZbmc() {
		return zbmc;
	}

	public void setZbmc(String zbmc) {
		this.zbmc = zbmc;
	}

	public Integer getBz() {
		return bz;
	}

	public void setBz(Integer bz) {
		this.bz = bz;
	}

	public Integer getXn() {
		return xn;
	}

	public void setXn(Integer xn) {
		this.xn = xn;
	}

}
