package com.nf.app.bean.grsz;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

/**
 * 方案选项详情
 * @author 王启灵
 *
 */
@XmlRootElement(name="FaInfo")
public class FaInfo  extends Model{
	
	private Integer pjbh; //评价编号
	private String pjbz; //评价标准
	private Double bzf; //标准分
	public Integer getPjbh() {
		return pjbh;
	}
	public void setPjbh(Integer pjbh) {
		this.pjbh = pjbh;
	}
	public String getPjbz() {
		return pjbz;
	}
	public void setPjbz(String pjbz) {
		this.pjbz = pjbz;
	}
	public Double getBzf() {
		return bzf;
	}
	public void setBzf(Double bzf) {
		this.bzf = bzf;
	}
	
}
