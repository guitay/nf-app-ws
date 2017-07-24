package com.nf.app.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tiancom.pas.common.framework.ibatis.IBaseDAO;

/**
 * 业绩
 * @author zhouyan
 *
 */
@SuppressWarnings("unchecked")
@Component
public class ProductServiceImpl implements ProductService {
	@Autowired
	private IBaseDAO ibaseDAO;
	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}
	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
}
