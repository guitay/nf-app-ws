package com.nf.app.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.nf.app.bean.pojo.QueryCondition;
import com.nf.app.bean.zdwd.Zdwd;

import io.swagger.annotations.Api;

@Path("/zdwd/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Api("/zdwd")
@Service
public interface ZdwdRestService {

	/*
	 * 查询所有文档
	 */
	@POST
	@Path("/query")
	public List<Zdwd> query(QueryCondition<Zdwd> condition);

	/*
	 * 加载文档内容
	 */
	@POST
	@Path("/load")
	@Consumes("application/x-www-form-urlencoded")
	public String load(@FormParam("wdmc") String wdmc);

}
