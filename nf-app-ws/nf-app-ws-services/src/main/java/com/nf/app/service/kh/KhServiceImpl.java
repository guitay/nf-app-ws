package com.nf.app.service.kh;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.pojo.APP_KH;
import com.nf.app.dao.kh.KhDao;

/**
 * 大客户
 * @author zhouyan
 *
 */

@Component
public class KhServiceImpl implements KhService {
	@Autowired
	private KhDao dao;
		
	public List<APP_KH> getCustomers(Map<String, Object> map,int beginRow,int pageSize) {
		return dao.getCustomers(map, beginRow, pageSize);
	}

	public List<APP_KH> getZhInfo(Map map) {
		return dao.getZhInfo(map);
	}

	public void updateGzkhStates(Map map) {
		dao.updateGzkhStates(map);
	}

	public void addGzkh(Map map) {
		dao.addGzkh(map);
	}

	public void addGzzhxx(Map map){
		dao.addGzzhxx(map);
	}

	public void deleteGzkh(Map map) {
		dao.deleteGzkh(map);
	}

	public void deleteGzzhxx(Map map) {
		dao.deleteGzzhxx(map);
	}

	public Integer getGzkhCount(Map map) {
		return dao.getGzkhCount(map);
	}


	public List<APP_KH> getGzCustomers(Map<String, Object> map, Integer startRows,
			Integer rows) {
		return dao.getGzCustomers(map, startRows, rows);
	}

	public List<APP_KH> getGzZhInfo(Map<String, Object> map) {
		return dao.getGzZhInfo(map);
	}

	public void updateGzzhxx(Map map) {
		dao.updateGzzhxx(map);
	}
	
}
