package com.nf.app.dao.yj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.nf.app.bean.yj.Zbxq;

@Component
public class YjDao {

	private final SqlSession ibaseDAO;

	public YjDao(SqlSession ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}

	public List<Zbxq> getJgKhzb(Map<String, Object> map, Integer startRows, Integer rows) {
		return ibaseDAO.selectList("app_yj_getJgKhzbs", map, new RowBounds(startRows, rows));
	}

	public List<Zbxq> getMxInfoByKhzbdh(Map<String, Object> map) {
		return ibaseDAO.selectList("app_yj_getMxInfoByKhzbdh", map);
	}

	public List<Zbxq> getKhGrzb(Map<String, Object> map, Integer startRows, Integer rows) {
		return ibaseDAO.selectList("app_yj_getKhGrzbs", map,  new RowBounds(startRows, rows));
	}

	public List<Map> getXnhyyjzb(Map<String, Object> map, Integer startRows, Integer rows) {
		return ibaseDAO.selectList("app_yj_getXnhyzbs", map,  new RowBounds(startRows, rows));
	}

	public List<Zbxq> getQhKhzb(Map<String, Object> map, Integer startRows, Integer rows) {
		// TODO Auto-generated method stub
		return ibaseDAO.selectList("app_yj_getQhKhzbs", map,  new RowBounds(startRows, rows));
	}

	public Zbxq getJgZbInfo(Map map) {
		// wzj 对应机构指标详情页面的第一部分
		return (Zbxq) ibaseDAO.selectOne("app_yj_getJgZbInfo", map);

	}

	public Zbxq getJgZbInfoInQh(Map map) {
		return (Zbxq) ibaseDAO.selectOne("app_yj_getJgZbInfoInQh", map);
	}

	public Map getPreTjrq(String tjrq) {
		// 获取上月末 上季末 上年末的日期
		return (HashMap) ibaseDAO.selectOne("app_yj_getPreTjrq", tjrq);
	}

	public Zbxq getPreJgZbInfo(Map map) {
		return (Zbxq) ibaseDAO.selectOne("app_yj_getPreJgZbInfo", map);
	}

	public Zbxq getGrzbInfo(Map map) {
		return (Zbxq) ibaseDAO.selectOne("app_yj_getGrzbInfo", map);
	}

	public Zbxq getPreGrZbInfo(Map map) {
		return (Zbxq) ibaseDAO.selectOne("app_yj_getPreGrZbInfo", map);
	}

	public Zbxq getPreJgZbInfoInQh(Map map) {
		return (Zbxq) ibaseDAO.selectOne("app_yj_getPreJgZbInfoInQh", map);
	}

}
