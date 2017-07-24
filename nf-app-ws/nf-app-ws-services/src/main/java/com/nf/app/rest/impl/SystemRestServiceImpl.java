
package com.nf.app.rest.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nf.app.console.AppService;
import com.nf.app.rest.SystemRestService;
import com.nf.app.system.SystemService;
import com.nf.pojo.Dmms;
import com.nf.pojo.Hylb;
import com.nf.pojo.Jg;
import com.nf.pojo.MPAS_HY;
import com.nf.pojo.Menu;
import com.nf.pojo.XTCS;

import io.swagger.annotations.Api;

@Api("/system")
@Service
public class SystemRestServiceImpl implements SystemRestService {
	private static final Logger log = LoggerFactory.getLogger(SystemRestServiceImpl.class);

	@Resource
	@Qualifier("SystemServiceBean")
	private SystemService service;
	@Resource
	@Qualifier("AppServiceBean")
	private AppService appservice;

	public SystemRestServiceImpl() {

	}

	public SystemService getService() {
		return service;
	}

	public void setService(SystemService service) {
		this.service = service;
	}

	public AppService getAppservice() {
		return appservice;
	}

	public void setAppservice(AppService appservice) {
		this.appservice = appservice;
	}

	public XTCS getXtcs(String csmc, String dbSchema) {
		log.info("****on server side,invoking getXtcs, csmc = " + csmc + ",start ********");
		XTCS cs = service.selectMpasXtcs(csmc, dbSchema);

		log.info("****on server side,invoking getXtcs, csmc = " + csmc + ",completed ********");

		return cs;
	}

	public List<Dmms> getdmms(String dmmc, String dbSchema) {
		log.info("****on server side,invoking getdmms, " + dmmc + ",start ********");
		List<Dmms> list = service.selectMpasDmms(dmmc, dbSchema);
		log.info("****on server side,invoking getdmms, " + dmmc + ",completed ********");

		return list;
	}

	public MPAS_HY getLoginUser(String dlmc, String db) {
		log.info("****on server side,invoking getLoginUser, " + dlmc + ",start ********");
		MPAS_HY hy = service.selectMpasHYByDlmc(dlmc,db);
		log.info("****on server side,invoking getLoginUser, " + dlmc + ",completed ********");

		return hy;
	}

	public Jg getRootJg(String dbSchema) {
		log.info("****on server side,invoking getRootJg,start********");
		Jg jg = service.getRootJg(dbSchema);
		log.info("****on server side,invoking getRootJg,completed ********");
		return jg;
	}

	public Jg getJgByKhdxdh(Integer khdxdh, String dbSchema) {
		log.info("****on server side,invoking getJgByKhdxdh,start khdxdh=" + khdxdh + "********");
		Jg jg = service.getJgByKhdxdh(khdxdh, dbSchema);
		log.info("****on server side,invoking getJgByKhdxdh,completed ********");
		return jg;
	}

	public List<Jg> getJgChildren(Integer khdxdh, String dbSchema) {
		log.info("****on server side,invoking getJgChildren,start khdxdh=" + khdxdh + "********");
		List<Jg> list = service.getJgChildren(khdxdh, dbSchema);

		log.info("****on server side,invoking getJgChildren,completed ********");
		return list;
	}

	public Jg getParentJg(Integer khdxdh, String dbSchema) {
		log.info("****on server side,invoking getParentJg,start khdxdh=" + khdxdh + "********");
		Jg jg = service.getParentJg(khdxdh, dbSchema);
		log.info("****on server side,invoking getParentJg,completed ********");
		return jg;
	}

	public List<Menu> getHyMenus(Integer tjrq, Integer khdxdh, String dbSchema) {
		log.info("****on server side,invoking getHyMenus,start ********");

		Map map = new HashMap();
		map.put("tjrq", tjrq);
		map.put("khdxdh", khdxdh);
		map.put("db", dbSchema);
		List<Menu> list = (List<Menu>) service.selectHydycd(map);

		log.info("****on server side,invoking getHyMenus,completed ********");
		return list;
	}

	public List<Menu> getHyIndexMenus(String tjrq, Integer khdxdh, String lbdh, String dbSchema) {
		log.info("****on server side,invoking getParentJg,start ********");
		Map map = new HashMap();
		map.put("tjrq", tjrq);
		map.put("khdxdh", khdxdh);
		map.put("lbdh", lbdh);
		map.put("db", dbSchema);
		List<Menu> list = (List<Menu>) service.selectCd(map);
		// log.info("-------------------------------->"+list.get(0).getCdms());
		log.info("****on server side,invoking getParentJg,completed ********");
		return list;
	}

	public List<Hylb> getHylbByKhdxdh(Integer tjrq, Integer khdxdh, String dbSchema) {
		Map map = new HashMap();
		map.put("tjrq", tjrq);
		map.put("khdxdh", khdxdh);
		map.put("db", dbSchema);
		List<Hylb> hylbs = service.selectHylb(map);
		return hylbs;
	}

	public String getZxgg(Integer khdxdh, String dbSchema) {
		Map map = new HashMap();
		map.put("khdxdh", khdxdh);
		map.put("db", dbSchema);
		String list = service.selectZxgg(map);
		return list;
	}

	public List<Map> getRw(Integer khdxdh, String dbSchema) {
		Map map = new HashMap();
		map.put("khdxdh", khdxdh);
		map.put("db", dbSchema);
		List<Map> list = service.selectRw(map);
		return list;
	}

	public Response insertCzrz(String cdbh, String cdmc, String tjrq, Integer dlkhdxdh, String czsj, String dbSchema) {
		Map map = new HashMap();
		map.put("cdbh", cdbh);
		map.put("cdmc", cdmc);
		map.put("tjrq", tjrq);
		map.put("dlkhdxdh", dlkhdxdh);
		map.put("czsj", czsj);
		map.put("db", dbSchema);
		Integer sfscdl = appservice.isScdlBykhdxdh(map);
		map.put("sfscdl", sfscdl);
		appservice.insertCzrz(map);

		return Response.ok().build();
	}

}
