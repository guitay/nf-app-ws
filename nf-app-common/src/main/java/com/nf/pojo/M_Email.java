package com.nf.pojo;

//数据库M_邮件_待发送 和 数据库M_邮件_已发送 的实体类
public class M_Email {
	//行员信息相关 HYXX_YHBS表
	private String hydh;//行员代号
	private String hymc;//行员名称
	private String jgdh;//机构代号
	private String jgmc;//机构名称
	private String lbdh;//类别代号
	private String lbmc;//类别名称
	private String yhbs;//银行标识
	private String yjdz;//邮件地址
	
	//考核指标相关XXPZ_YHBS表
	private String tjrq;//统计日期
	private String zbfl;//指标分类
	private String zbmc;//指标名称
	private String zbz;//指标值
	
	//邮件相关 M_YJ_DFS M_YJ_YFS表
	private String yjid;//邮件id		
	private String yjnr;//邮件内容
	private String scfssj;//生成或者发送时间 待发送生成时间/已发送发送时间
	//其他
	private String zt;//状态
	
	public String getHymc() {
		return hymc;
	}
	public void setHymc(String hymc) {
		this.hymc = hymc;
	}

	public String getZbz() {
		return zbz;
	}
	public String getZbfl() {
		return zbfl;
	}
	public void setZbfl(String zbfl) {
		this.zbfl = zbfl;
	}
	public String getZbmc() {
		return zbmc;
	}
	public void setZbmc(String zbmc) {
		this.zbmc = zbmc;
	}
	public void setZbz(String zbz) {
		this.zbz = zbz;
	}
	public String getJgdh() {
		return jgdh;
	}
	public void setJgdh(String jgdh) {
		this.jgdh = jgdh;
	}
	public String getJgmc() {
		return jgmc;
	}
	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}
	public String getLbdh() {
		return lbdh;
	}
	public void setLbdh(String lbdh) {
		this.lbdh = lbdh;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public String getTjrq() {
		return tjrq;
	}
	public void setTjrq(String tjrq) {
		this.tjrq = tjrq;
	}
	public String getYhbs() {
		return yhbs;
	}
	public void setYhbs(String yhbs) {
		this.yhbs = yhbs;
	}
	public String getHydh() {
		return hydh;
	}
	public void setHydh(String hydh) {
		this.hydh = hydh;
	}
	public String getYjdz() {
		return yjdz;
	}
	public void setYjdz(String yjdz) {
		this.yjdz = yjdz;
	}
	public String getYjnr() {
		return yjnr;
	}
	public void setYjnr(String yjnr) {
		this.yjnr = yjnr;
	}
	public String getYjid() {
		return yjid;
	}
	public void setYjid(String yjid) {
		this.yjid = yjid;
	}
	public String getScfssj() {
		return scfssj;
	}
	public void setScfssj(String scfssj) {
		this.scfssj = scfssj;
	}
	public String getLbmc() {
		return lbmc;
	}
	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}
	

}
