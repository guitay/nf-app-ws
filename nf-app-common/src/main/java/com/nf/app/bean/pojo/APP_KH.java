package com.nf.app.bean.pojo;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.nf.app.bean.base.Model;

/**
 * 客户实体类
 * @author chaorong
 *
 */
@XmlRootElement(name="APP_KH")
public class APP_KH extends Model{

	private Integer tjrq;//统计日期
	private Integer khdxdh;//登录人考核对象代号
	private Integer hykhdxdh;//行员考核对象代号
	private Integer jxdxdh;//绩效对象代号
	private Integer jxdxlx;//绩效对象类型(1-存款;2-贷款)
	private String zhdh;//账户代号
	private String zhbs;//账户标识
	private String kmmc;//科目名称
	private String khh;//客户号
	private String khmc;//客户名称
	private String khrq;//开户日期
	private Integer dqrq;//到期日期
	private Integer khjg;//开户机构
	private String khjgmc;//开户机构名称
	private BigDecimal zhye;//账户余额
	private String ghxx;//管户信息
	private BigDecimal hyye;//行员余额
	private BigDecimal bhje;//变化金额
	private String dqlx;//到期类型
	private String sfgz;//是否关注
	private String dqkhmark;//到期客户标志
	
	private String ckjxdxlx;
	private String dkjxdxlx;
	private BigDecimal ckzhye;
	private BigDecimal dkzhye;
	private String tableName;
	private String bz;
	
	
	/**
	 * 账户信息集合
	 */
	private List<APP_KH> zhList;
	
	
	
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public List<APP_KH> getZhList() {
		return zhList;
	}
	public void setZhList(List<APP_KH> zhList) {
		this.zhList = zhList;
	}
	public String getSfgz() {
		return sfgz;
	}
	public void setSfgz(String sfgz) {
		this.sfgz = sfgz;
	}
	public Integer getTjrq() {
		return tjrq;
	}
	public void setTjrq(Integer tjrq) {
		this.tjrq = tjrq;
	}
	public Integer getHykhdxdh() {
		return hykhdxdh;
	}
	public void setHykhdxdh(Integer hykhdxdh) {
		this.hykhdxdh = hykhdxdh;
	}
	public Integer getJxdxdh() {
		return jxdxdh;
	}
	public void setJxdxdh(Integer jxdxdh) {
		this.jxdxdh = jxdxdh;
	}
	public Integer getJxdxlx() {
		return jxdxlx;
	}
	public void setJxdxlx(Integer jxdxlx) {
		this.jxdxlx = jxdxlx;
	}
	public String getZhdh() {
		return zhdh;
	}
	public void setZhdh(String zhdh) {
		this.zhdh = zhdh;
	}
	public String getZhbs() {
		return zhbs;
	}
	public void setZhbs(String zhbs) {
		this.zhbs = zhbs;
	}
	public String getKmmc() {
		return kmmc;
	}
	public void setKmmc(String kmmc) {
		this.kmmc = kmmc;
	}
	public String getKhh() {
		return khh;
	}
	public void setKhh(String khh) {
		this.khh = khh;
	}
	public String getKhmc() {
		return khmc;
	}
	public void setKhmc(String khmc) {
		this.khmc = khmc;
	}
	public String getKhrq() {
		return khrq;
	}
	public void setKhrq(String khrq) {
		this.khrq = khrq;
	}
	public Integer getDqrq() {
		return dqrq;
	}
	public void setDqrq(Integer dqrq) {
		this.dqrq = dqrq;
	}
	public Integer getKhjg() {
		return khjg;
	}
	public void setKhjg(Integer khjg) {
		this.khjg = khjg;
	}
	public String getKhjgmc() {
		return khjgmc;
	}
	public void setKhjgmc(String khjgmc) {
		this.khjgmc = khjgmc;
	}
	public Integer getKhdxdh() {
		return khdxdh;
	}
	public void setKhdxdh(Integer khdxdh) {
		this.khdxdh = khdxdh;
	}
	public BigDecimal getZhye() {
		return zhye;
	}
	public void setZhye(BigDecimal zhye) {
		this.zhye = zhye;
	}
	public String getGhxx() {
		return ghxx;
	}
	public void setGhxx(String ghxx) {
		this.ghxx = ghxx;
	}
	public BigDecimal getHyye() {
		return hyye;
	}
	public void setHyye(BigDecimal hyye) {
		this.hyye = hyye;
	}
	public BigDecimal getBhje() {
		return bhje;
	}
	public void setBhje(BigDecimal bhje) {
		this.bhje = bhje;
	}
	public String getDqlx() {
		return dqlx;
	}
	public void setDqlx(String dqlx) {
		this.dqlx = dqlx;
	}
	public String getDqkhmark() {
		return dqkhmark;
	}
	public void setDqkhmark(String dqkhmark) {
		this.dqkhmark = dqkhmark;
	}
	public String getCkjxdxlx() {
		return ckjxdxlx;
	}
	public void setCkjxdxlx(String ckjxdxlx) {
		this.ckjxdxlx = ckjxdxlx;
	}
	public String getDkjxdxlx() {
		return dkjxdxlx;
	}
	public void setDkjxdxlx(String dkjxdxlx) {
		this.dkjxdxlx = dkjxdxlx;
	}
	public BigDecimal getCkzhye() {
		return ckzhye;
	}
	public void setCkzhye(BigDecimal ckzhye) {
		this.ckzhye = ckzhye;
	}
	public BigDecimal getDkzhye() {
		return dkzhye;
	}
	public void setDkzhye(BigDecimal dkzhye) {
		this.dkzhye = dkzhye;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
}
