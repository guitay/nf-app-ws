package com.nf.app.rest.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.ckyy.Ckyy;
import com.nf.app.ckyy.CkyyService;
import com.nf.app.rest.CkyyRestService;



@Path("/yjyy/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Component
public class CkyyRestServiceImpl implements CkyyRestService { 

	private static final Logger log = LoggerFactory.getLogger(CkyyRestServiceImpl.class);
	@Autowired
	private CkyyService service;

	public CkyyRestServiceImpl() {

	}


	public CkyyService getService() {
		return service;
	}


	public void setService(CkyyService service) {
		this.service = service;
	}


	/*
	 * 查询预约类型 wzj
	 */
	@POST
	@Path("/queryyylx")
	public List<Map> queryYylx(Ckyy ckyy) {
		List<Map> yylxList = service.queryYylx(ckyy.getDb());
		return yylxList;
	}

	/*
	 * 查询所有预约 wzj
	 */
	@POST
	@Path("/querysyyy")
	@Consumes("application/x-www-form-urlencoded")
	public List<Ckyy> queryYy(@FormParam("khdxdh") int khdxdh, @FormParam("yylx") String yylx, String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", khdxdh);
		map.put("yylx", yylx);
		map.put("db", dbSchema);

		List<Ckyy> list = service.query(map);
		return list;
	}

	/*
	 * 查看预约的详情 wzj
	 */
	@POST
	@Path("/queryyyxq")
	@Consumes("application/x-www-form-urlencoded")
	public Ckyy loadYyBylsh(@FormParam("lsh") double lsh, @FormParam("khdxdh") int khdxdh, String dbSchame) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("lsh", lsh);
		map.put("khdxdh", khdxdh);
		map.put("db", dbSchame);
		Ckyy yy = service.load(map);
		return yy;
	}

	@POST
	@Path("/saveyy")
	@Consumes("application/x-www-form-urlencoded")
	public String saveYy(@FormParam("lsh") long lsh, @FormParam("khdxdh") int khdxdh,
			@FormParam("jgkhdxdh") int jgkhdxdh, @FormParam("jgmc") String jgmc, @FormParam("khlx") int khlx,
			@FormParam("zjlb") String zjlb, @FormParam("zjhm") String zjhm, @FormParam("yjje") BigDecimal yjje,
			@FormParam("blrq") int blrq, @FormParam("yyqsrq") int yyqsrq, @FormParam("khmc") String khmc,
			@FormParam("yyjsrq") int yyjsrq, @FormParam("bz") String bz, @FormParam("ppbz") String ppbz,
			@FormParam("yylx") String yylx, String dbSchema) {
		Ckyy yy = generateYY(lsh, khdxdh, jgkhdxdh, jgmc, khlx, zjlb, zjhm, yjje, blrq, yyqsrq, yyjsrq, bz, ppbz, yylx,
				khmc);
		yy.setDb(dbSchema);
		String mess = service.save(yy);
		return mess;
	}

	@POST
	@Path("/deleteyy")
	@Consumes("application/x-www-form-urlencoded")
	public void deleteYyByLsh(@FormParam("khdxdh") int khdxdh, @FormParam("lsh") long lsh, String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", khdxdh);
		map.put("lsh", lsh);
		map.put("db", dbSchema);

		Map<String, String> retMap = service.delete(map);

	}

	@POST
	@Path("/queryzzlb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Map> loadZzlb(@FormParam("dbSchema") String dbSchema) {
		List<Map> lst = service.loadZjlb(dbSchema);
		return lst;
	}

	private Ckyy generateYY(long lsh, int khdxdh, int jgkhdxdh, String jgmc, int khlx, String zjlb, String zjhm,
			BigDecimal yjje, int blrq, int yyqsrq, int yyjsrq, String bz, String ppbz, String yylx, String khmc) {
		// TODO Auto-generated method stub
		Ckyy yy = new Ckyy();

		yy.setKhdxdh(khdxdh);
		yy.setJgkhdxdh(jgkhdxdh);
		yy.setJgmc(jgmc);
		yy.setKhlx(khlx);
		yy.setLsh(lsh);

		yy.setZjlb(zjlb);
		yy.setZjhm(zjhm);
		yy.setBlrq(blrq);
		yy.setYyqsrq(yyqsrq);

		yy.setKhlx(khlx);
		yy.setYjje(yjje);
		yy.setYyjsrq(yyjsrq);
		yy.setBz(bz);
		yy.setPpbz(ppbz);
		yy.setYylx(yylx);
		yy.setKhmc(khmc);

		return yy;
	}

}
