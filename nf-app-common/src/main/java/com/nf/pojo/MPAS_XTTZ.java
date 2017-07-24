package com.nf.pojo;

import java.sql.Timestamp;

//MPAS_系统消息实体类
public class MPAS_XTTZ {
    private Integer xxbh;//消息编号
    private String hydh;//编写人
    private String hymc;//编写人名称
    private String xxzt;//消息主题
    private String xxnr;//消息内容
    private Timestamp xxsj;//消息时间
    private String tshylb;//推送行员类别
    
    private String sfck;//是否查看
    private Integer khdxdh;//考核对象代号
    
	public Integer getXxbh() {
		return xxbh;
	}
	public void setXxbh(Integer xxbh) {
		this.xxbh = xxbh;
	}
	public String getHydh() {
		return hydh;
	}
	public void setHydh(String hydh) {
		this.hydh = hydh;
	}
	public String getHymc() {
		return hymc;
	}
	public void setHymc(String hymc) {
		this.hymc = hymc;
	}
	public String getXxzt() {
		return xxzt;
	}
	public void setXxzt(String xxzt) {
		this.xxzt = xxzt;
	}
	public String getXxnr() {
		return xxnr;
	}
	public void setXxnr(String xxnr) {
		this.xxnr = xxnr;
	}

	public Timestamp getXxsj() {
		return xxsj;
	}
	public void setXxsj(Timestamp xxsj) {
		this.xxsj = xxsj;
	}
	public String getTshylb() {
		return tshylb;
	}
	public void setTshylb(String tshylb) {
		this.tshylb = tshylb;
	}
	public String getSfck() {
		return sfck;
	}
	public void setSfck(String sfck) {
		this.sfck = sfck;
	}
	public Integer getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}
    
}
