package com.nf.app.service.yj;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.yj.Zbxq;
import com.nf.app.dao.yj.YjDao;

/**
 * 业绩
 * 
 * @author zhouyan
 *
 */
@Component
public class YjServiceImpl implements YjService {
	@Autowired
	private YjDao dao;

	public List<Zbxq> getJgKhzb(Map<String, Object> map, Integer startRows, Integer rows) {
		return dao.getJgKhzb(map, startRows, rows);
	}

	public List<Zbxq> getMxInfoByKhzbdh(Map<String, Object> map) {
		return dao.getMxInfoByKhzbdh(map);
	}

	public List<Zbxq> getKhGrzb(Map<String, Object> map, Integer startRows, Integer rows) {
		return dao.getKhGrzb(map, startRows, rows);
	}

	public List<Map> getXnhyyjzb(Map<String, Object> map, Integer startRows, Integer rows) {
		return dao.getXnhyyjzb(map, startRows, rows);
	}

	public List<Zbxq> getQhKhzb(Map<String, Object> map, Integer startRows, Integer rows) {
		return dao.getQhKhzb(map, startRows, rows);
	}

	public Zbxq getJgZbInfo(Map map) {
		return dao.getJgZbInfo(map);
	}

	public Zbxq getJgZbInfoInQh(Map map) {
		return dao.getJgZbInfoInQh(map);
	}

	public Map getPreTjrq(String tjrq) {
		return dao.getPreTjrq(tjrq);
	}

	public Zbxq getPreJgZbInfo(Map map) {
		return dao.getPreJgZbInfo(map);
	}

	public Zbxq getGrzbInfo(Map map) {
		return dao.getGrzbInfo(map);
	}

	public Zbxq getPreGrZbInfo(Map map) {
		return dao.getPreGrZbInfo(map);
	}

	public Zbxq getPreJgZbInfoInQh(Map map) {
		return dao.getPreJgZbInfoInQh(map);
	}

}
