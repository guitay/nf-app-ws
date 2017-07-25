package com.nf.app.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.nf.app.bean.pojo.APP_KH;
import com.nf.app.bean.pojo.QueryCondition;

/**
 * 客户CXF接口
 * 
 * @author Tancr
 * 
 */
@Path("/Kh/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Service
public interface KhRestService{

	

	/**
	 * 查询新客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryXkh")
	public List<APP_KH> queryXkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 查询变化客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryBhkh")
	public List<APP_KH> queryBhkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 查询存款到期客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryCkdqkh")
	public List<APP_KH> queryCkdqkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 查询贷款到期客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryDkdqkh")
	public List<APP_KH> queryDkdqkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 查询存款大客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryCkdkh")
	public List<APP_KH> queryCkdkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 查询贷款大客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryDkdkh")
	public List<APP_KH> queryDkdkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 查询逾期贷款大客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryYqdkdkh")
	public List<APP_KH> queryYqdkdkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 查询不良贷款大客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryBldkdkh")
	public List<APP_KH> queryBldkdkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 查询关注客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryGzkh")
	public List<APP_KH> queryGzkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 添加关注客户(取消/关注)
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/addGzkh")
	public Response addGzkh(QueryCondition<APP_KH> condition) ;

	/**
	 * 根据客户号查询账户数据
	 * @param khh
	 * @return
	 */
	@POST
	@Path("/queryZhByKhh")
	public List<APP_KH> queryZhByKhh(QueryCondition<APP_KH> condition) ;
}
