package com.tiancom.mpas.app.kh;

import java.util.List;

import javax.ws.rs.core.Response;

import com.tiancom.mpas.pojo.APP_KH;
import com.tiancom.mpas.pojo.QueryCondition;

/**
 * 客户CXF接口
 * 
 * @author Tancr
 * 
 */

public interface KhCXFService {

	/**
	 * 查询新客户
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_KH> queryXkh(QueryCondition<APP_KH> condition);

	/**
	 * 查询变化客户
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_KH> queryBhkh(QueryCondition<APP_KH> condition);

	/**
	 * 查询存款到期客户
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_KH> queryCkdqkh(QueryCondition<APP_KH> condition);

	/**
	 * 查询贷款到期客户
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_KH> queryDkdqkh(QueryCondition<APP_KH> condition);

	/**
	 * 查询存款大客户
	 * 
	 * @param condition
	 * @return
	 */

	public List<APP_KH> queryCkdkh(QueryCondition<APP_KH> condition);

	/**
	 * 查询贷款大客户
	 * 
	 * @param condition
	 * @return
	 */

	public List<APP_KH> queryDkdkh(QueryCondition<APP_KH> condition);

	/**
	 * 查询逾期贷款大客户
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_KH> queryYqdkdkh(QueryCondition<APP_KH> condition);

	/**
	 * 查询不良贷款大客户
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_KH> queryBldkdkh(QueryCondition<APP_KH> condition);

	/**
	 * 查询关注客户
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_KH> queryGzkh(QueryCondition<APP_KH> condition);

	/**
	 * 添加关注客户(取消/关注)
	 * 
	 * @param condition
	 * @return
	 */
	public Response addGzkh(QueryCondition<APP_KH> condition);

}
