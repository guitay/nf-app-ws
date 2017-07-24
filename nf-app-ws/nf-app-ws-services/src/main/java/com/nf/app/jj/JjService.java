package com.nf.app.jj;

import java.util.List;
import java.util.Map;

import com.nf.app.bean.jj.Jj;

	/**
	 * 计价Service
	 * @author 
	 *
	 */
@SuppressWarnings("unchecked")
public interface JjService {
	/**
	 * 查询计价信息
	 * 
	 */
	public List<Jj> getCustomers(Map<String, Object> map,int beginRow,int pageSize);
}
