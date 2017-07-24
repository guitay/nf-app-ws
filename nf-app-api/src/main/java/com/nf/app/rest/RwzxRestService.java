package com.nf.app.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nf.app.rwzx.Rwxq;
import com.nf.pojo.QueryCondition;

@Path("/rwzx/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public interface RwzxRestService{


	/*
	 * 查询所有已经完成和未完成的任务 wzj
	 */
	@POST
	@Path("/querysyrw")
	//Integer khdxdh,String rwnr, String rwdd, String wcsj,String rwsm, String sfwc,String czsj
	public List<Rwxq> queryRwByPara(QueryCondition<Rwxq> rw) ;
	
	/*
	 * 根据条件查询任务
	 */
	@POST
	@Path("/queryrw")
	//Integer khdxdh,String rwnr, String rwdd, String wcsj,String rwsm, String sfwc,String czsj
	public Rwxq queryRw(QueryCondition<Rwxq> rw) ;

	/*
	 * 获取指标的历史详情 wzj
	 */
	@POST
	@Path("/saverw")
	public void insertRw(QueryCondition<Rwxq> rw) ;

	@POST
	@Path("/deleterw")
	public void deleteTaskByPara(QueryCondition<Rwxq> rw) ;


}
