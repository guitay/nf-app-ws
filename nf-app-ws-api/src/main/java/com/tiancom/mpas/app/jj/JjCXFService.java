package com.tiancom.mpas.app.jj;

import java.util.List;
import com.tiancom.mpas.pojo.QueryCondition;

/**
 * 计价CXF接口
 * 
 * @author Tancr
 * 
 */

public interface JjCXFService {

	/**
	 * 查询计价信息
	 * 
	 * @param condition
	 * @return
	 */
	public List<Jj> queryJj(QueryCondition<Jj> condition);
	

}
