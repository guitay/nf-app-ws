package com.nf.app.zdwd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tiancom.pas.common.framework.ibatis.IBaseDAO;

@Component
public class ZdwdServiceImpl implements ZdwdService {
	@Autowired
	private IBaseDAO ibaseDAO;
	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}
	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	public List<Zdwd> query(String db) {
		Map map = new HashMap();
		map.put("db", db);
		List<Zdwd> lst = (List<Zdwd>)ibaseDAO.selectListByPara("zdwd_load", map);
		return lst;
	}
	
}
