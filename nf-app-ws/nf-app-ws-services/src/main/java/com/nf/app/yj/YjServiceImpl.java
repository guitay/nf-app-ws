package com.nf.app.yj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.yj.Zbxq;
import com.tiancom.pas.common.framework.ibatis.IBaseDAO;

/**
 * 业绩
 * @author zhouyan
 *
 */
@SuppressWarnings("unchecked")
@Component
public class YjServiceImpl implements YjService {
	@Autowired
	private IBaseDAO ibaseDAO;
	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}
	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	public List<Zbxq> getJgKhzb(Map<String, Object> map, Integer startRows,
			Integer rows) {
	    return ibaseDAO.selectPageInfoByPara("app_yj_getJgKhzbs", map, startRows, rows);
	}
	
	public List<Zbxq> getMxInfoByKhzbdh(Map<String, Object> map) {
		return ibaseDAO.selectInfoByPara("app_yj_getMxInfoByKhzbdh", map);
	}
	
	public List<Zbxq> getKhGrzb(Map<String, Object> map, Integer startRows,
			Integer rows) {
		return ibaseDAO.selectPageInfoByPara("app_yj_getKhGrzbs", map, startRows, rows);
	}
	
	public List<Map> getXnhyyjzb(Map<String, Object> map, Integer startRows,
			Integer rows) {
		return ibaseDAO.selectPageInfoByPara("app_yj_getXnhyzbs", map, startRows, rows);
	}
	
	public List<Zbxq> getQhKhzb(Map<String, Object> map, Integer startRows,
			Integer rows) {
		// TODO Auto-generated method stub
		return ibaseDAO.selectPageInfoByPara("app_yj_getQhKhzbs", map, startRows, rows);
	}
	
	public Zbxq getJgZbInfo(Map map) {
		//wzj 对应机构指标详情页面的第一部分
		return  (Zbxq)ibaseDAO.selectByPrimaryKey("app_yj_getJgZbInfo", map);
		
	}
	
	
	public Zbxq getJgZbInfoInQh(Map map){
		return  (Zbxq)ibaseDAO.selectByPrimaryKey("app_yj_getJgZbInfoInQh", map);
	}
	
	public Map getPreTjrq(String tjrq) {
		// 获取上月末 上季末 上年末的日期
		return  (HashMap)ibaseDAO.selectByPrimaryKey("app_yj_getPreTjrq", tjrq);
	}
	
	public Zbxq getPreJgZbInfo(Map map) {
		return (Zbxq)ibaseDAO.selectByPrimaryKey("app_yj_getPreJgZbInfo", map);
	}
	
	public Zbxq getGrzbInfo(Map map) {
		return (Zbxq)ibaseDAO.selectByPrimaryKey("app_yj_getGrzbInfo", map);
	}
	
	public Zbxq getPreGrZbInfo(Map map) {
		return (Zbxq)ibaseDAO.selectByPrimaryKey("app_yj_getPreGrZbInfo", map);
	}
	
	public Zbxq getPreJgZbInfoInQh(Map map) {
		return (Zbxq)ibaseDAO.selectByPrimaryKey("app_yj_getPreJgZbInfoInQh", map);
	}
	
	
}
