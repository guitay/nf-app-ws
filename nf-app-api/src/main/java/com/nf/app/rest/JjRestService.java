package com.nf.app.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nf.app.jj.Jj;
import com.nf.pojo.QueryCondition;

/**
 * 计价CXF接口
 * 
 * 
 */
@Path("/Jj/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public interface JjRestService {

	/**
	 * 查询计价信息
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJj")
	public List<Jj> queryJj(QueryCondition<Jj> condition) ;
}
