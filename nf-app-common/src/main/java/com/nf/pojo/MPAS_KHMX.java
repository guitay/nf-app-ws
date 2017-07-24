package com.nf.pojo;

//考核明细实体类
public class MPAS_KHMX {
	private Integer tjrq;//统计日期
	private Integer khdxdh;//考核对象代号
	private Integer khzbdh;//考核指标代号
	private String hydh;//行员代号
	private String khzbmc;//考核指标名称
	private String yyjgz;//应用结果值
	public Integer getTjrq() {
		return tjrq;
	}
	public void setTjrq(Integer tjrq) {
		this.tjrq = tjrq;
	}
	public Integer getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}
	public Integer getKhzbdh() {
		return khzbdh;
	}
	public void setKhzbdh(Integer khzbdh) {
		this.khzbdh = khzbdh;
	}
	public String getHydh() {
		return hydh;
	}
	public void setHydh(String hydh) {
		this.hydh = hydh;
	}
	public String getKhzbmc() {
		return khzbmc;
	}
	public void setKhzbmc(String khzbmc) {
		this.khzbmc = khzbmc;
	}
	public String getYyjgz() {
		return yyjgz;
	}
	public void setYyjgz(String yyjgz) {
		this.yyjgz = yyjgz;
	}
	
	
}
