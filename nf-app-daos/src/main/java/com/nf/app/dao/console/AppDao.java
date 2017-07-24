package com.nf.app.dao.console;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.nf.app.bean.console.CdPojo;


@Component
public class AppDao {
	private final SqlSession ibaseDAO;

	public AppDao(SqlSession ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}

	public CdPojo getKhcdPojoByPrimary(Map map) {
		return (CdPojo) ibaseDAO.selectOne("app_kh_hydycd", map);
	}

	public int updateCustomerMenu(Map map) {
		return ibaseDAO.update("app_kh_updateCustomerMenu", map);
	}

	public void insertCzrz(Map map) {

		ibaseDAO.insert("app_sz_insertCzrz", map);
	}

	public Integer isScdlBykhdxdh(Map map) {
		Integer cnt = ibaseDAO.selectOne("app_sz_selectSfscdl", map);
		if (cnt > 0) {
			return 0; // 不是首次登录
		} else {
			return 1; // 首次登录
		}

	}

}
