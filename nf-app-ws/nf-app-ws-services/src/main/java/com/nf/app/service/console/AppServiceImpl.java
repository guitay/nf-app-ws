package com.nf.app.service.console;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.console.CdPojo;
import com.nf.app.dao.console.AppDao;

/**
 * 客户ServiceImpl
 * 
 * @author zhouyan
 *
 */

@Component
public class AppServiceImpl implements AppService {
	@Autowired
	private AppDao dao;

	public CdPojo getKhcdPojoByPrimary(Map map) {
		return dao.getKhcdPojoByPrimary(map);
	}

	public int updateCustomerMenu(Map map) {
		return dao.updateCustomerMenu(map);
	}

	public void insertCzrz(Map map) {
		dao.insertCzrz(map);
	}

	public Integer isScdlBykhdxdh(Map map) {
		return dao.isScdlBykhdxdh(map);
	}

}
