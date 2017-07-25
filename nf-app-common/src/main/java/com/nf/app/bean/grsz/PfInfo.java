package com.nf.app.bean.grsz;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

/**
 * 在线评分详情
 * @author 王启灵
 *
 */
@XmlRootElement(name="PfInfo")
public class PfInfo  extends Model{
	
	private Integer hykhdxdh; //行员考核对象代号
	private String wdmc; //维度名称
	private String xmmc; //项目名称
	private String khnr; //考核内容
	private Integer fabh; //方案编号
	private Integer khqs; //考核期数
	private Integer xmbh; //项目编号
	private Double xmdfsx; //项目得分上限
	private Double xmdfxx; //项目得分下限
	private String khdx; //考核对象
	
	public Integer getHykhdxdh() {
		return hykhdxdh;
	}
	public void setHykhdxdh(Integer hykhdxdh) {
		this.hykhdxdh = hykhdxdh;
	}
	public String getWdmc() {
		return wdmc;
	}
	public void setWdmc(String wdmc) {
		this.wdmc = wdmc;
	}
	public String getXmmc() {
		return xmmc;
	}
	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}
	public String getKhnr() {
		return khnr;
	}
	public void setKhnr(String khnr) {
		this.khnr = khnr;
	}
	public Integer getFabh() {
		return fabh;
	}
	public void setFabh(Integer fabh) {
		this.fabh = fabh;
	}
	public Integer getKhqs() {
		return khqs;
	}
	public void setKhqs(Integer khqs) {
		this.khqs = khqs;
	}
	public Integer getXmbh() {
		return xmbh;
	}
	public void setXmbh(Integer xmbh) {
		this.xmbh = xmbh;
	}
	public Double getXmdfsx() {
		return xmdfsx;
	}
	public void setXmdfsx(Double xmdfsx) {
		this.xmdfsx = xmdfsx;
	}
	public Double getXmdfxx() {
		return xmdfxx;
	}
	public void setXmdfxx(Double xmdfxx) {
		this.xmdfxx = xmdfxx;
	}
	public String getKhdx() {
		return khdx;
	}
	public void setKhdx(String khdx) {
		this.khdx = khdx;
	}
	
}
