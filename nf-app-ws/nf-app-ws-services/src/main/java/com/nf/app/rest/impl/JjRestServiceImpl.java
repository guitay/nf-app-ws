package com.nf.app.rest.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nf.app.bean.jj.Jj;
import com.nf.app.bean.pojo.QueryCondition;
import com.nf.app.rest.JjRestService;
import com.nf.app.service.jj.JjService;

/**
 * 计价CXF接口
 * 
 * 
 */
@Path("/Jj/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Service
public class JjRestServiceImpl implements JjRestService {
	private static final Logger log = LoggerFactory.getLogger(JjRestServiceImpl.class);
	@Autowired
	private JjService jjService;

	public JjService getJjService() {
		return jjService;
	}

	public void setJjService(JjService jjService) {
		this.jjService = jjService;
	}
	
	/**
	 * 查询计价信息
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJj")
	public List<Jj> queryJj(QueryCondition<Jj> condition) {
		log.info("****on server side,invoking queryJj,"
				+ condition.getStartRow() + " start ********");
		Jj jj = (Jj) condition.getCondition();
		log.info("****on server side,invoking queryJj," + jj.getQsrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("hylb", jj.getHylb());
		map.put("tjrq",jj.getTjrq());
		List<Jj> jjList = jjService.getCustomers(map,(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryJj, "
				+ condition.getPageSize() + " completed ********");
		return jjList;
	}
}
