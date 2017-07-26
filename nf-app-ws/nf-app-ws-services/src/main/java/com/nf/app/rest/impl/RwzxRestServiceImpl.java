package com.nf.app.rest.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nf.app.bean.pojo.QueryCondition;
import com.nf.app.bean.rwzx.Rwxq;
import com.nf.app.rest.RwzxRestService;
import com.nf.app.service.rwzx.RwzxService;

@Path("/rwzx/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Service
public class RwzxRestServiceImpl implements RwzxRestService {

	private static final Logger log = LoggerFactory.getLogger(RwzxRestServiceImpl.class);
	@Autowired
	private RwzxService service;

	public RwzxRestServiceImpl() {

	}

	public RwzxService getService() {
		return service;
	}

	public void setService(RwzxService service) {
		this.service = service;
	}

	/*
	 * 查询所有已经完成和未完成的任务 wzj
	 */
	@POST
	@Path("/querysyrw")
	//Integer khdxdh,String rwnr, String rwdd, String wcsj,String rwsm, String sfwc,String czsj
	public List<Rwxq> queryRwByPara(QueryCondition<Rwxq> rw) {

		List<Rwxq> list = service.queryTaskByPara(rw.getCondition(), (int)rw.getStartRow(), rw.getPageSize()); 

		return list;
	}
	
	/*
	 * 根据条件查询任务
	 */
	@POST
	@Path("/queryrw")
	//Integer khdxdh,String rwnr, String rwdd, String wcsj,String rwsm, String sfwc,String czsj
	public Rwxq queryRw(QueryCondition<Rwxq> rw) {

		List<Rwxq> list = service.queryTaskByPara(rw.getCondition(),(int)rw.getStartRow(),rw.getPageSize()); 
		Rwxq rwxq=null;
		if(null!=list && list.size()>0){
			rwxq=list.get(0);
		}
		

		return rwxq;
	}

	/*
	 * 获取指标的历史详情 wzj
	 */
	@POST
	@Path("/saverw")
	public void insertRw(QueryCondition<Rwxq> rw) {

		if(null!=rw.getCondition().getRwbh()&&!"".equals(rw.getCondition().getRwbh())){
			Rwxq rw2 = new Rwxq();
			rw2.setDb(rw.getCondition().getDb());
			rw2.setRwbh(rw.getCondition().getRwbh());
			rw2.setKhdxdh(rw.getCondition().getKhdxdh());
			List list = service.queryTaskByPara(rw2,null,null);
			if (list.size()>0) {
				service.updateTaskByPara(rw.getCondition());
			}
			}else {
				service.insertTask(rw.getCondition());
			}

	}

	@POST
	@Path("/deleterw")
	public void deleteTaskByPara(QueryCondition<Rwxq> rw) {
		service.deleteTaskByJldh(rw.getCondition());
	}


}
