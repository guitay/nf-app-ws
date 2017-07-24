package com.nf.app.dao.zdwd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.nf.app.bean.zdwd.Zdwd;

@Component
public class ZdwdDao {

	private final SqlSession ibaseDAO;

	public ZdwdDao(SqlSession ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	public List<Zdwd> query(String db) {
		Map map = new HashMap();
		map.put("db", db);
		List<Zdwd> lst = ibaseDAO.selectList("zdwd_load", map);
		return lst;
	}
	
}
