package com.tiancom.mpas.app.zdwd;

import java.util.List;

import com.tiancom.mpas.pojo.QueryCondition;

public interface ZdwdCXFService {

	/*
	 * 查询所有文档
	 */
	public List<Zdwd> query(QueryCondition<Zdwd> condition);

	/*
	 * 加载文档内容
	 */
	public String load(String wdmc);

}
