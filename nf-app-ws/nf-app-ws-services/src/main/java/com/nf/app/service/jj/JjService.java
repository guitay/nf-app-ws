package com.nf.app.service.jj;

import java.util.List;
import java.util.Map;

import com.nf.app.bean.jj.Jj;

	/**
	 * 计价Service
	 * @author 
	 *
	 */
public interface JjService {
	/**
	 * 查询计价信息
	 * 
	 */
	public List<Jj> getCustomers(Map<String, Object> map,int beginRow,int pageSize);
}
