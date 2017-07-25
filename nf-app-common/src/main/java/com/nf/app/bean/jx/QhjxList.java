package com.nf.app.bean.jx;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

/**
 * 全行绩效列表
 * @author 王启灵
 *
 */
@XmlRootElement(name="QhjxList")
public class QhjxList extends Model{

	private Integer hykhdxdh; //行员考核对象代号
	private String jgmc; //机构名称
	private String hymc; //行员名称
	private String lbdh; //类别代号
	private String lbmc; //类别名称
	private Double jxhz; //绩效汇总
	private Integer qhpm; //全行排名
	private Integer pm1; //数量排名(顺序)
	private Integer pm2; //数量排名(倒序)
	private Double bsyjx; //比上月绩效
	private Integer jxbl; //绩效比例
	
	public Integer getHykhdxdh() {
		return hykhdxdh;
	}
	public void setHykhdxdh(Integer hykhdxdh) {
		this.hykhdxdh = hykhdxdh;
	}
	public String getJgmc() {
		return jgmc;
	}
	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}
	public String getHymc() {
		return hymc;
	}
	public void setHymc(String hymc) {
		this.hymc = hymc;
	}
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
	public Double getJxhz() {
		return jxhz;
	}
	public void setJxhz(Double jxhz) {
		this.jxhz = jxhz;
	}
	public Integer getQhpm() {
		return qhpm;
	}
	public void setQhpm(Integer qhpm) {
		this.qhpm = qhpm;
	}
	public Integer getPm1() {
		return pm1;
	}
	public void setPm1(Integer pm1) {
		this.pm1 = pm1;
	}
	public Integer getPm2() {
		return pm2;
	}
	public void setPm2(Integer pm2) {
		this.pm2 = pm2;
	}
	public Double getBsyjx() {
		return bsyjx;
	}
	public void setBsyjx(Double bsyjx) {
		this.bsyjx = bsyjx;
	}
	public Integer getJxbl() {
		return jxbl;
	}
	public void setJxbl(Integer jxbl) {
		this.jxbl = jxbl;
	}
	
}
