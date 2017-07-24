package com.nf.app.rest.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.pojo.APP_KH;
import com.nf.app.bean.pojo.QueryCondition;
import com.nf.app.kh.KhService;
import com.nf.app.rest.KhRestService;

/**
 * 客户CXF接口
 * 
 * @author Tancr
 * 
 */
@Path("/Kh/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Component
public class KhRestServiceImpl implements KhRestService {

	private static final Logger log = LoggerFactory.getLogger(KhRestServiceImpl.class);
	@Autowired
	private KhService service;

	public KhRestServiceImpl() {

	}

	public KhService getService() {
		return service;
	}

	public void setService(KhService service) {
		this.service = service;
	}

	/**
	 * 查询新客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryXkh")
	public List<APP_KH> queryXkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryXkh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryXkh," + kh.getTjrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("tableName", "MPAS_KH_XZKH");
		map.put("db", condition.getDb());
		List<APP_KH> khList = service.getCustomers(map,
				(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryXkh, "
				+ condition.getPageSize() + " completed ********");

		return khList;
	}

	/**
	 * 查询变化客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryBhkh")
	public List<APP_KH> queryBhkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryBhkh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryBhkh," + kh.getTjrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("tableName", "MPAS_KH_BHKH");
		map.put("db", condition.getDb());
		List<APP_KH> khList = service.getCustomers(map,
				(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryBhkh, "
				+ condition.getPageSize() + " completed ********");

		return khList;
	}

	/**
	 * 查询存款到期客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryCkdqkh")
	public List<APP_KH> queryCkdqkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryCkdqkh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryCkdqkh," + kh.getTjrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("tableName", "MPAS_KH_CKDQKH");
		map.put("db", condition.getDb());
		List<APP_KH> khList = service.getCustomers(map,
				(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryCkdqkh, "
				+ condition.getPageSize() + " completed ********");

		return khList;
	}

	/**
	 * 查询贷款到期客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryDkdqkh")
	public List<APP_KH> queryDkdqkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryDkdqkh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryDkdqkh," + kh.getTjrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("tableName", "MPAS_KH_DKDQKH");
		map.put("db", condition.getDb());
		List<APP_KH> khList = service.getCustomers(map,
				(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryDkdqkh, "
				+ condition.getPageSize() + " completed ********");

		return khList;
	}

	/**
	 * 查询存款大客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryCkdkh")
	public List<APP_KH> queryCkdkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryCkdkh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryCkdkh," + kh.getTjrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("tableName", "MPAS_KH_CKDKH");
		map.put("db", condition.getDb());
		List<APP_KH> khList = service.getCustomers(map,
				(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryCkdkh, "
				+ condition.getPageSize() + " completed ********");

		return khList;
	}

	/**
	 * 查询贷款大客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryDkdkh")
	public List<APP_KH> queryDkdkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryDkdkh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryDkdkh," + kh.getTjrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("tableName", "MPAS_KH_DKDKH");
		map.put("db", condition.getDb());
		List<APP_KH> khList = service.getCustomers(map,
				(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryDkdkh, "
				+ condition.getPageSize() + " completed ********");

		return khList;
	}

	/**
	 * 查询逾期贷款大客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryYqdkdkh")
	public List<APP_KH> queryYqdkdkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryYqdkdkh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryYqdkdkh," + kh.getTjrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("tableName", "MPAS_KH_YQDKDKH");
		map.put("db", condition.getDb());
		List<APP_KH> khList = service.getCustomers(map,
				(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryYqdkdkh, "
				+ condition.getPageSize() + " completed ********");

		return khList;
	}

	/**
	 * 查询不良贷款大客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryBldkdkh")
	public List<APP_KH> queryBldkdkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryBldkdkh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryBldkdkh," + kh.getTjrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("tableName", "MPAS_KH_BLDKDKH");
		map.put("db", condition.getDb());
		List<APP_KH> khList = service.getCustomers(map,
				(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryBldkdkh, "
				+ condition.getPageSize() + " completed ********");

		return khList;
	}

	/**
	 * 查询关注客户
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryGzkh")
	public List<APP_KH> queryGzkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryGzkh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryGzkh," + kh.getTjrq()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("db", condition.getDb());
		List<APP_KH> khList = service.getGzCustomers(map,
				(int) condition.getStartRow(), condition.getPageSize());
//		KhCommon.getAppGzZhInfoByKhh(khList, service, map);

		log.info("****on server side,invoking queryGzkh, "
				+ condition.getPageSize() + " completed ********");

		return khList;
	}

	/**
	 * 添加关注客户(取消/关注)
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/addGzkh")
	public Response addGzkh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking addGzkh,"
				+ condition.getStartRow() + " start ********");
		Map map = new HashMap();
		APP_KH kh = condition.getCondition();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("khh", kh.getKhh());
		map.put("khmc", kh.getKhmc());
		map.put("db", condition.getDb());
		String gzzt = kh.getSfgz();
		map.put("gzzt", gzzt);
		if (gzzt.equals("0")) {
			// 取消关注
			service.updateGzkhStates(map);
		} else {
			// 添加关注
			map.put("tableName", kh.getTableName().toUpperCase());
			Integer count = service.getGzkhCount(map);
			if (count > 0) {
				service.deleteGzkh(map);
				service.updateGzzhxx(map);
				service.addGzkh(map);
			} else {
				service.addGzkh(map);
				service.addGzzhxx(map);
			}
		}
		log.info("****on server side,invoking addGzkh, "
				+ condition.getPageSize() + " completed ********");

		return Response.ok().build();
	}

	/**
	 * 根据客户号查询账户数据
	 * @param khh
	 * @return
	 */
	@POST
	@Path("/queryZhByKhh")
	public List<APP_KH> queryZhByKhh(QueryCondition<APP_KH> condition) {
		log.info("****on server side,invoking queryZhByKhh,"
				+ condition.getStartRow() + " start ********");
		APP_KH kh = (APP_KH) condition.getCondition();
		log.info("****on server side,invoking queryZhByKhh," + kh.getKhh()
				+ " start ********");
		Map map = new HashMap();
		map.put("tjrq", kh.getTjrq());
		map.put("khdxdh", kh.getKhdxdh());
		map.put("khh",kh.getKhh());
		map.put("tableName", kh.getTableName());
		map.put("db",condition.getDb());
		List<APP_KH> zhInfos=service.getZhInfo(map);//查出所有的账户数据

		log.info("****on server side,invoking queryCkdkh, zhInfos"
				+zhInfos.size() + " completed ********");

		return zhInfos;
	}
}
