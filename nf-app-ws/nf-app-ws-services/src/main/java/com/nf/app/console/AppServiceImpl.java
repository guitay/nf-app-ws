package com.tiancom.mpas.app.console;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tiancom.pas.common.framework.ibatis.IBaseDAO;

/**
 * 客户ServiceImpl
 * @author zhouyan
 *
 */
@SuppressWarnings("unchecked")
@Component
@Qualifier("AppServiceBean")
public class AppServiceImpl implements AppService {
	@Autowired
	private IBaseDAO ibaseDAO;
	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}
	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	public CdPojo getKhcdPojoByPrimary(Map map) {
		return (CdPojo)ibaseDAO.selectByPrimaryKey("app_kh_hydycd", map);
	}
	
	public int updateCustomerMenu(Map map) {
		return ibaseDAO.updateByPrimaryKey("app_kh_updateCustomerMenu", map);
	}
	
	public void insertCzrz(Map map){
		
		ibaseDAO.insert("app_sz_insertCzrz", map);
	}
	
	public Integer isScdlBykhdxdh(Map map){
		
		Integer cnt=ibaseDAO.selectCountRows("app_sz_selectSfscdl", map);
		if(cnt>0){
			return 0; //不是首次登录
		}else{
			return 1; //首次登录
		}
		
		
	}
	
}
