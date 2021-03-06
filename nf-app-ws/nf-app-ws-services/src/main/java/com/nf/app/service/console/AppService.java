package com.nf.app.service.console;

import java.util.Map;

import com.nf.app.bean.console.CdPojo;


/**
 * 核心Service
 * @author zhouyan
 *
 */
public interface AppService {
	/**
	 * 查询子菜单明细信息
	 * @param map
	 * @return
	 */
	public CdPojo getKhcdPojoByPrimary(Map map);
	
	/**
	 * 更新客户菜单查看提醒
	 * @param map
	 * @return
	 */
	public int updateCustomerMenu(Map map);
	
	public void insertCzrz(Map map);
	
	public Integer isScdlBykhdxdh(Map map);
}
