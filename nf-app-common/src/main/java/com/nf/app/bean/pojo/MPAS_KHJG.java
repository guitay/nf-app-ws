package com.nf.app.bean.pojo;
//考核结果实体类
public class MPAS_KHJG {
    private Integer tjrq; //统计日期
    private Integer khdxdh;//考核对象代号
    private String hydh;//行员代号
    private String khjg;//考核结果
    private String symkhjg;//上月末考核结果
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
	public String getHydh() {
		return hydh;
	}
	public void setHydh(String hydh) {
		this.hydh = hydh;
	}
	public String getKhjg() {
		return khjg;
	}
	public void setKhjg(String khjg) {
		this.khjg = khjg;
	}
	public String getSymkhjg() {
		return symkhjg;
	}
	public void setSymkhjg(String symkhjg) {
		this.symkhjg = symkhjg;
	}
    
    
}
