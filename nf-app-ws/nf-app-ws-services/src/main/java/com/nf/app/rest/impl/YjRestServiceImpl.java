package com.nf.app.rest.impl;

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

import com.nf.app.bean.yj.Zbxq;
import com.nf.app.rest.YjRestService;
import com.nf.app.yj.YjService;

@Path("/yj/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Component
public class YjRestServiceImpl implements YjRestService {

	private static final Logger log = LoggerFactory.getLogger(YjRestServiceImpl.class);
	private int defaultRowStart = 0;
	
	private int defaultPageSize = 50;
	@Autowired
	private YjService service;

	public YjRestServiceImpl() {

	}

	public YjService getService() {
		return service;
	}

	public void setService(YjService service) {
		this.service = service;
	}

	/*
	 * 查询当前登录行员的所有指标 wzj
	 */
	@POST
	@Path("/gryj/qureysyzb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Zbxq> loadGrYj(@FormParam("tjrq") int tjrq, @FormParam("khdxdh") int khdxdh,
			@FormParam("ywlb") String ywlb, @FormParam("khzq") int khzq, @FormParam("startRow") int startRow,
			@FormParam("pageSize") int pageSize,  @FormParam("dbSchema") String dbSchema) {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("tjrq", tjrq);
		map.put("khdxdh", khdxdh);
		setYwlb(map, ywlb);
		map.put("khzq", khzq);
		map.put("db", dbSchema);

		List<Zbxq> khList = null;
		startRow = (startRow != 0) ? startRow : defaultRowStart;
		pageSize = (pageSize != 0) ? pageSize : defaultPageSize;
		khList = service.getKhGrzb(map, startRow, pageSize);
		return khList;

	}

	/*
	 * 查询个人业绩某条指标的详情 wzj
	 */
	@POST
	@Path("/gryj/qureyzbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadGrFixedBlock(@FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh,
			 @FormParam("tjrq") int tjrq, @FormParam("khdxdh") int khdxdh,  @FormParam("dbSchema") String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("khzq", khzq);
		map.put("khzbdh", khzbdh);
		map.put("tjrq", tjrq);
		map.put("khdxdh", khdxdh);
		map.put("db", dbSchema);

		Zbxq zbxq = service.getGrzbInfo(map);
		return zbxq;
	}

	/*
	 * 获取指标的历史详情 wzj
	 */
	@POST
	@Path("/gryj/qureylszbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadGrChangingBlock( @FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh,  @FormParam("dbSchema") String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("khdxdh", khdxdh);
		map.put("tjrq", tjrq);
		map.put("khzq", khzq);
		map.put("khzbdh", khzbdh);
		map.put("db", dbSchema);

		Zbxq zbxq = service.getGrzbInfo(map);

		Map rqMap = service.getPreTjrq(String.valueOf(tjrq));

		System.out.println("查询当前记录的条件" + map.toString());

		if (khzq == 1) {
			map.put("tjrq", rqMap.get("SYM"));
		} else if (khzq == 2) {
			map.put("tjrq", rqMap.get("SJM"));
		} else if (khzq == 3) {
			map.put("tjrq", rqMap.get("SNM"));
		} else {
			System.out.println("考核周期没有被赋值");
		}

		Zbxq zbxq_pre = service.getPreGrZbInfo(map);// 指标的历史信息查询

		if (zbxq_pre != null) {
			zbxq.setDF_PRE(zbxq_pre.getDF_PRE());
			zbxq.setJHZ_PRE(zbxq_pre.getJHZ_PRE());
			zbxq.setQHPM_PRE(zbxq_pre.getQHPM_PRE());
			zbxq.setJGNPM_PRE(zbxq_pre.getJGNPM_PRE());
			zbxq.setKHZBZ_PRE(zbxq_pre.getKHZBZ_PRE());
		}

		return zbxq;

	}

	@POST
	@Path("/jgyj/qureysyzb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Zbxq> loadJgYj(@FormParam("khzq") int khzq, @FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("ywlb") String ywlb, @FormParam("startRow") int startRow,
			@FormParam("pageSize") int pageSize,  @FormParam("dbSchema") String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("khzq", khzq);
		map.put("khdxdh", khdxdh);
		map.put("tjrq", tjrq);
		map.put("db", dbSchema);
		setYwlb(map, ywlb);

		startRow = (startRow != 0) ? startRow : defaultRowStart;
		pageSize = (pageSize != 0) ? pageSize : defaultPageSize;

		List<Zbxq> list = service.getJgKhzb(map, startRow, pageSize);
		return list;
	}

	@POST
	@Path("/jgyj/qureyzbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadJgFixedBlock(@FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh,  @FormParam("dbSchema") String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("khdxdh", khdxdh);
		map.put("tjrq", tjrq);
		map.put("khzq", khzq);
		map.put("khzbdh", khzbdh);
		map.put("db", dbSchema);

		Zbxq zbxq = service.getJgZbInfo(map);
		return zbxq;

	}

	@POST
	@Path("/jgyj/qureylszbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadJgChangingBlock( @FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh,  @FormParam("dbSchema") String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", khdxdh);
		map.put("tjrq", tjrq);
		map.put("khzq", khzq);
		map.put("khzbdh", khzbdh);
		map.put("db", dbSchema);
		Zbxq zbxq = service.getJgZbInfo(map);

		Map rqMap = service.getPreTjrq(String.valueOf(tjrq));

		if (khzq == 1) {
			map.put("tjrq", rqMap.get("SYM"));
		} else if (khzq == 2) {
			map.put("tjrq", rqMap.get("SJM"));
		} else if (khzq == 3) {
			map.put("tjrq", rqMap.get("SNM"));
		} else {
			System.out.println("考核周期没有被赋值");
		}

		Zbxq zbxq_pre = service.getPreJgZbInfoInQh(map);

		if (zbxq_pre != null) {
			zbxq.setDF_PRE(zbxq_pre.getDF_PRE());
			zbxq.setJHZ_PRE(zbxq_pre.getJHZ_PRE());
			zbxq.setQHPM_PRE(zbxq_pre.getQHPM_PRE());
			zbxq.setKHZBZ_PRE(zbxq_pre.getKHZBZ_PRE());

		}

		return zbxq;

	}

	@POST
	@Path("/qhyj/qureysyzb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Zbxq> loadQhYj(@FormParam("khzq") int khzq, @FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("ywlb") String ywlb, @FormParam("startRow") int startRow,
			@FormParam("pageSize") int pageSize,  @FormParam("dbSchema") String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("khzq", khzq);
		map.put("khdxdh", khdxdh);
		map.put("tjrq", tjrq);
		map.put("db", dbSchema);
		setYwlb(map, ywlb);

		startRow = (startRow != 0) ? startRow : defaultRowStart;
		pageSize = (pageSize != 0) ? pageSize : defaultPageSize;
		List<Zbxq> list = service.getQhKhzb(map, startRow, pageSize);

		return list;
	}

	@POST
	@Path("/qhyj/qureyjgxq")
	@Consumes("application/x-www-form-urlencoded")
	public List<Zbxq> loadJgxqByZb(@FormParam("khzbdh") int khzbdh, @FormParam("khzq") int khzq,
			@FormParam("tjrq") int tjrq,  @FormParam("dbSchema") String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khzbdh", khzbdh);
		map.put("khzq", khzq);
		map.put("tjrq", tjrq);
		map.put("db", dbSchema);
		List<Zbxq> list = service.getMxInfoByKhzbdh(map);
		return list;

	}

	@POST
	@Path("/qhyj/qureyjgzbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadJgFixedBlockInQh( @FormParam("tjrq") int tjrq,
			@FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh, @FormParam("jgdh") String jgdh,  @FormParam("dbSchema") String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tjrq", tjrq);
		map.put("khzq", khzq);
		map.put("khzbdh", khzbdh);
		map.put("jgdh", jgdh);
		map.put("db", dbSchema);

		Zbxq zbxq = service.getJgZbInfoInQh(map);

		return zbxq;
	}

	@POST
	@Path("/qhyj/qureyjglszbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadJgChangingBlockInQh( @FormParam("tjrq") int tjrq,
			@FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh, @FormParam("jgdh") String jgdh,  @FormParam("dbSchema") String dbSchema) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tjrq", tjrq);
		map.put("khzq", khzq);
		map.put("khzbdh", khzbdh);
		map.put("jgdh", jgdh);
		map.put("db", dbSchema);

		Zbxq zbxq = service.getJgZbInfoInQh(map);
		// 获取上月的信息

		// writer.write(gson.toJson(res));
		// 要返回本月的实际值 上个季度的实际值 本月排名 上个时期排名

		Map rqMap = service.getPreTjrq(String.valueOf(tjrq));

		if (khzq == 1) {
			map.put("tjrq", rqMap.get("SYM"));
		} else if (khzq == 2) {
			map.put("tjrq", rqMap.get("SJM"));
		} else if (khzq == 3) {
			map.put("tjrq", rqMap.get("SNM"));
		} else {
			System.out.println("考核周期没有被赋值");
		}

		Zbxq zbxq_pre = service.getPreJgZbInfo(map);

		if (zbxq_pre != null) {
			zbxq.setDF_PRE(zbxq_pre.getDF_PRE());
			zbxq.setJHZ_PRE(zbxq_pre.getJHZ_PRE());
			zbxq.setQHPM_PRE(zbxq_pre.getQHPM_PRE());
			zbxq.setKHZBZ_PRE(zbxq_pre.getKHZBZ_PRE());

		}

		return zbxq;
	}

	/*
	 * 工具方法
	 */
	public Map setYwlb(Map map, String ywlb) {
		if (null != ywlb && ywlb.equals("ck")) {
			map.put("ywlb", "01");
		} else if (null != ywlb && ywlb.equals("dk")) {
			map.put("ywlb", "02");
		} else if (null != ywlb && ywlb.equals("zjyw")) {
			map.put("ywlb", "03");
		} else if (null != ywlb && ywlb.equals("qtyw")) {
			map.put("ywlb", "04");
		}

		return map;
	}

}
