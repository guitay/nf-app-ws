package com.nf.app.dao.jj;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.nf.app.bean.jj.Jj;

/**
 * 计价
 * 
 *
 */
@Component
public class JjDao {

	private final SqlSession ibaseDAO;

	public JjDao(SqlSession ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	public List<Jj> getCustomers(Map<String, Object> map, int beginRow,
			int pageSize) {
		return ibaseDAO.selectList("app_jj_getCustomers", map, new RowBounds(beginRow, pageSize));
	}
	
}
