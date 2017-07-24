package com.nf.app.jj;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.jj.Jj;
import com.tiancom.pas.common.framework.ibatis.IBaseDAO;

/**
 * 计价
 * 
 *
 */
@SuppressWarnings("unchecked")
@Component
public class JjServiceImpl implements JjService{
	@Autowired
	private IBaseDAO ibaseDAO;
	
	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}
	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}

	public List<Jj> getCustomers(Map<String, Object> map, int beginRow,
			int pageSize) {
		return ibaseDAO.selectPageInfoByPara("app_jj_getCustomers", map, beginRow, pageSize);
	}
	
}
