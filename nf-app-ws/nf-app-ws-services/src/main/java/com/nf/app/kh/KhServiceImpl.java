package com.nf.app.kh;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.pojo.APP_KH;
import com.tiancom.pas.common.framework.ibatis.IBaseDAO;

/**
 * 大客户
 * @author zhouyan
 *
 */
@SuppressWarnings("unchecked")
@Component
public class KhServiceImpl implements KhService {
	@Autowired
	private IBaseDAO ibaseDAO;
	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}
	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	public List<APP_KH> getCustomers(Map<String, Object> map,int beginRow,int pageSize) {
		return ibaseDAO.selectPageInfoByPara("app_kh_getCustomers", map, beginRow, pageSize);
	}

	public List<APP_KH> getZhInfo(Map map) {
		return ibaseDAO.selectInfoByPara("app_kh_getZhInfo", map);
	}

	public void updateGzkhStates(Map map) {
		ibaseDAO.updateByPrimaryKey("app_kh_updateGzkhStates", map);
	}

	public void addGzkh(Map map) {
		ibaseDAO.insert("app_kh_addGzkh", map);
		
	}

	public void addGzzhxx(Map map){
		ibaseDAO.insert("app_kh_addGzkhZhxx", map);
	}

	public void deleteGzkh(Map map) {
		ibaseDAO.deleteByPrimaryKey("app_kh_deleteGzkh", map);
	}

	public void deleteGzzhxx(Map map) {
		ibaseDAO.deleteByPrimaryKey("app_kh_deleteGzkhZhxx", map);
	}

	public Integer getGzkhCount(Map map) {
		return ibaseDAO.selectCountRows("app_kh_selectGzkh", map);
	}


	public List<APP_KH> getGzCustomers(Map<String, Object> map, Integer startRows,
			Integer rows) {
		return ibaseDAO.selectPageInfoByPara("app_kh_getGzCustomers", map, startRows, rows);
	}

	public List<APP_KH> getGzZhInfo(Map<String, Object> map) {
		return  ibaseDAO.selectInfoByPara("app_kh_getGzZhInfo", map);
	}

	public void updateGzzhxx(Map map) {
		ibaseDAO.updateByPrimaryKey("app_kh_updateGzzhxx", map);
	}
	
}
