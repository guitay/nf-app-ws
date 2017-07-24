package com.nf.app.dao.kh;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.nf.app.bean.pojo.APP_KH;

/**
 * 大客户
 * 
 * @author zhouyan
 *
 */
@Component
public class KhDao {

	private final SqlSession ibaseDAO;

	public KhDao(SqlSession ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}

	public List<APP_KH> getCustomers(Map<String, Object> map, int beginRow, int pageSize) {
		return ibaseDAO.selectList("app_kh_getCustomers", map, new RowBounds(beginRow, pageSize));
	}

	public List<APP_KH> getZhInfo(Map map) {
		return ibaseDAO.selectList("app_kh_getZhInfo", map);
	}

	public void updateGzkhStates(Map map) {
		ibaseDAO.update("app_kh_updateGzkhStates", map);
	}

	public void addGzkh(Map map) {
		ibaseDAO.insert("app_kh_addGzkh", map);

	}

	public void addGzzhxx(Map map) {
		ibaseDAO.insert("app_kh_addGzkhZhxx", map);
	}

	public void deleteGzkh(Map map) {
		ibaseDAO.delete("app_kh_deleteGzkh", map);
	}

	public void deleteGzzhxx(Map map) {
		ibaseDAO.delete("app_kh_deleteGzkhZhxx", map);
	}

	public Integer getGzkhCount(Map map) {
		return ibaseDAO.selectOne("app_kh_selectGzkh", map);
	}

	public List<APP_KH> getGzCustomers(Map<String, Object> map, Integer startRows, Integer rows) {
		return ibaseDAO.selectList("app_kh_getGzCustomers", map, new RowBounds(startRows, rows));
	}

	public List<APP_KH> getGzZhInfo(Map<String, Object> map) {
		return ibaseDAO.selectList("app_kh_getGzZhInfo", map);
	}

	public void updateGzzhxx(Map map) {
		ibaseDAO.update("app_kh_updateGzzhxx", map);
	}

}
