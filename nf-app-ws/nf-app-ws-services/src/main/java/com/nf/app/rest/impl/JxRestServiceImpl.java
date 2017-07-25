package com.nf.app.rest.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.jx.APP_HF;
import com.nf.app.bean.jx.APP_JXGZ;
import com.nf.app.bean.jx.APP_JXHZ;
import com.nf.app.bean.jx.APP_JXMX;
import com.nf.app.bean.jx.APP_JXZC;
import com.nf.app.bean.jx.APP_KHQK;
import com.nf.app.bean.jx.APP_PL;
import com.nf.app.bean.jx.APP_XTXX;
import com.nf.app.bean.jx.APP_ZAN;
import com.nf.app.bean.jx.QhjxList;
import com.nf.app.bean.jx.QhjxMx;
import com.nf.app.bean.pojo.Hylb;
import com.nf.app.bean.pojo.QueryCondition;
import com.nf.app.rest.JxRestService;
import com.nf.app.service.jx.JxService;

/**
 * 绩效工资CXF接口
 * 
 * @author Tancr
 * 
 */
@Path("/jx/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Component
public class JxRestServiceImpl implements JxRestService{

	private static final Logger log = LoggerFactory.getLogger(JxRestServiceImpl.class);
	@Autowired
	private JxService service;

	public JxRestServiceImpl() {

	}

	public JxService getService() {
		return service;
	}

	public void setService(JxService service) {
		this.service = service;
	}

	/**
	 * 查询绩效工资
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJxgz")
	public APP_JXGZ queryJxgz(QueryCondition<APP_JXGZ> condition) {
		log.info("****on server side,invoking queryJxgz,"
				+ condition.getStartRow() + " start ********");
		APP_JXGZ app_jxgz = condition.getCondition();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", app_jxgz.getKhdxdh());
		map.put("tjrq", app_jxgz.getTjrq());
		map.put("db", condition.getDb());
		APP_JXGZ jx = service.selectGrjxBykey(map);

		log.info("****on server side,invoking queryJxgz, "
				+ app_jxgz.getKhdxdh().toString() + " completed ********");

		return jx;
	}

	/**
	 * 查询绩效月K
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJxyk")
	public List<APP_JXGZ> queryJxyk(QueryCondition<APP_JXGZ> condition) {
		log.info("****on server side,invoking queryJxyk,"
				+ condition.getStartRow() + " start ********");
		APP_JXGZ app_jxgz = condition.getCondition();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", app_jxgz.getKhdxdh());
		map.put("tjrq", app_jxgz.getTjrq());
		map.put("stjrq", Integer.parseInt(app_jxgz.getTjrq()) - 10000);
		map.put("ckflag", "1");
		map.put("db", condition.getDb());
		List<APP_JXGZ> list = service.selectJxqsBykey(map);

		log.info("****on server side,invoking queryJxyk, "
				+ condition.getPageSize() + " completed ********");

		return list;
	}

	/**
	 * 查询绩效月K
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJxrk")
	public List<APP_JXGZ> queryJxrk(QueryCondition<APP_JXGZ> condition) {
		log.info("****on server side,invoking queryJxrk,"
				+ condition.getStartRow() + " start ********");
		APP_JXGZ app_jxgz = condition.getCondition();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", app_jxgz.getKhdxdh());
		map.put("tjrq", app_jxgz.getTjrq());
		map.put("stjrq", Integer.parseInt(app_jxgz.getTjrq()) - 10000);
		map.put("ckflag", "2");
		map.put("db", condition.getDb());
		List<APP_JXGZ> list = service.selectJxqsBykey(map);

		log.info("****on server side,invoking queryJxrk, "
				+ condition.getPageSize() + " completed ********");

		return list;
	}

	/**
	 * 查询绩效月K
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJxmx")
	public List<APP_JXGZ> queryJxmx(QueryCondition<APP_JXGZ> condition) {
		log.info("****on server side,invoking queryJxmx,"
				+ condition.getStartRow() + " start ********");
		APP_JXGZ app_jxgz = condition.getCondition();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", app_jxgz.getKhdxdh());
		map.put("tjrq", app_jxgz.getTjrq());
		map.put("db", condition.getDb());
		List<APP_JXGZ> list = service.selectGrjxmxList(map);

		log.info("****on server side,invoking queryJxmx, "
				+ condition.getPageSize() + " completed ********");

		return list;
	}

	/**
	 * 查询点赞数
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryGoods")
	public APP_ZAN queryGoods(QueryCondition<APP_ZAN> condition) {
		log.info("****on server side,invoking queryGoods,"
				+ condition.getStartRow() + " start ********");
		APP_ZAN zan = condition.getCondition();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", zan.getKhdxdh());// 给予赞人
		map.put("hykhdxdh", zan.getHykhdxdh());// 被赞人
		map.put("tjrq", zan.getTjrq());
		map.put("db", condition.getDb());
		APP_ZAN zan1 = service.selectGoods(map);

		log.info("****on server side,invoking queryGoods, "
				+ condition.getPageSize() + " completed ********");

		return zan1;
	}

	/**
	 * 查询评论
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryPl")
	public List<APP_PL> queryPl(QueryCondition<APP_PL> condition) {
		log.info("****on server side,invoking queryPl,"
				+ condition.getStartRow() + " start ********");
		APP_PL app_pl = condition.getCondition();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bplrkhdxdh", app_pl.getBplrkhdxdh());
		// map.put("plrkhdxdh", app_pl.getPlrkhdxdh());
		map.put("tjrq", app_pl.getTjrq());
		map.put("db", condition.getDb());
		List<APP_PL> list = service.selectXxplList(map);

		log.info("****on server side,invoking queryPl, "
				+ condition.getPageSize() + " completed ********");

		return list;
	}

	/**
	 * 查询评论
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryHf")
	public List<APP_HF> queryHf(QueryCondition<APP_HF> condition) {
		log.info("****on server side,invoking queryHf,"
				+ condition.getStartRow() + " start ********");
		APP_HF app_hf = condition.getCondition();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("plbh", app_hf.getHfbh());
		map.put("db", condition.getDb());
		List<APP_HF> list = service.selectXxhfList(map);

		log.info("****on server side,invoking queryHf, "
				+ condition.getPageSize() + " completed ********");

		return list;
	}

	/**
	 * 添加评论
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/addPl")
	public Response addPl(QueryCondition<APP_PL> condition) {
		log.info("****on server side,invoking addPl," + condition.getStartRow()
				+ " start ********");
		APP_PL app_pl = condition.getCondition();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bplrkhdxdh", app_pl.getBplrkhdxdh());// 评论人
		map.put("plrkhdxdh", app_pl.getPlrkhdxdh());
		map.put("tjrq", app_pl.getTjrq());
		map.put("cdbh", app_pl.getCdbh());
		map.put("pl", app_pl.getPl());
		map.put("db", condition.getDb());

		service.insertXxpl(map);

		log.info("****on server side,invoking addPl, "
				+ condition.getPageSize() + " completed ********");

		return Response.ok().build();
	}

	/**
	 * 删除评论
	 * @param condition
	 * 
	 * @return
	 */
	@GET
	@Path("/deletePl/{plbh}/{dbSchema}")
	public Response deletePl(@PathParam("plbh") String plbh, @PathParam("dbSchema") String dbSchema) {
		log.info("****on server side,invoking deletePl," + plbh
				+ " start ********");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("plbh", plbh);
		map.put("db", dbSchema);
		service.deleteXxpl(map);
		service.deleteXxhf(map);

		log.info("****on server side,invoking deletePl, " + plbh
				+ " completed ********");

		return Response.ok().build();
	}

	@GET
	@Path("/deleteHf/{hfbh}/{dbSchema}")
	public Response deleteHf(@PathParam("hfbh") String hfbh, @PathParam("dbSchema") String dbSchema) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hfbh", hfbh);
		map.put("db", dbSchema);
		service.deleteXxhf(map);

		return Response.ok().build();
	}

	@POST
	@Path("/addHf")
	public Response addHf(QueryCondition<APP_HF> condition) {

		APP_HF hf = condition.getCondition();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hykhdxdh", hf.getHfrkhdxdh());// 回复人
		map.put("tjrq", hf.getTjrq());
		map.put("plbh", hf.getPlbh());
		map.put("hf", hf);
		map.put("db", condition.getDb());
		service.insertXxhf(map);

		return Response.ok().build();
	}

	// 查询行员全行绩效列表
	@POST
	@Path("/selectQhjxPhb")
	@Consumes("application/x-www-form-urlencoded")
	public List<QhjxList> selectQhjxPhb(@FormParam("khdxdh") String khdxdh,
			@FormParam("tjrq") String tjrq, @FormParam("pm") String pm,
			@FormParam("hylb") String hylb, @FormParam("dbSchema") String dbSchema) {
		log.info("****on server side,invoking selectQhjxPhb," + khdxdh
				+ " start ********");

		Map map = new HashMap();
		map.put("khdxdh", khdxdh);
		map.put("tjrq", tjrq);
		map.put("pm", pm);
		map.put("db", dbSchema);

		if (!"".equals(hylb) && null != hylb) {
			map.put("lbdh", hylb);
		}
		List<QhjxList> ztList = service.selectQhjxList(map);

		log.info("****on server side,invoking selectQhjxPhb, " + ztList
				+ " completed********");

		return ztList;
	}

	// 查询行员全行绩效列表
	@POST
	@Path("/selectHyqhjxphb")
	@Consumes("application/x-www-form-urlencoded")
	public List<QhjxList> selectHyqhjxphb(@FormParam("khdxdh") String khdxdh,
			@FormParam("tjrq") String tjrq,
			@FormParam("ck_flag") String ck_flag, @FormParam("hylb") String hylb, @FormParam("dbSchema") String dbSchema) {
		log.info("****on server side,invoking selectHyqhjxphb," + khdxdh
				+ " start ********");

		Map map = new HashMap();
		map.put("khdxdh", khdxdh);
		map.put("tjrq", tjrq);
		map.put("flag", ck_flag);
		map.put("db", dbSchema);

		if (!"".equals(hylb) && null != hylb) {
			map.put("lbdh", hylb);
		}
		List<QhjxList> ztList = service.selectHyqhjxList(map);

		log.info("****on server side,invoking selectHyqhjxphb, " + ztList
				+ " completed********");

		return ztList;
	}

	
	// 查询全行绩效明细
	@POST
	@Path("/selectQhjxmx")
	@Consumes("application/x-www-form-urlencoded")
	public List<QhjxMx> selectQhjxmx(@FormParam("khdxdh") String khdxdh,
			@FormParam("tjrq") String tjrq,
			@FormParam("hykhdxdh") String hykhdxdh, @FormParam("dbSchema") String dbSchema) {
		log.info("****on server side,invoking selectQhjxmx," + khdxdh
				+ " start ********");

		Map map = new HashMap();
		map.put("khdxdh", khdxdh);
		map.put("tjrq", tjrq);
		map.put("hykhdxdh", hykhdxdh);
		map.put("db", dbSchema);

		List ztList = service.selectQhjxmxBykey(map);

		log.info("****on server side,invoking selectQhjxmx, " + ztList
				+ " completed********");

		return ztList;
	}

	// 查询全行绩效趋势
	@POST
	@Path("/selectQhjxqs")
	@Consumes("application/x-www-form-urlencoded")
	public List<QhjxMx> selectQhjxqs(@FormParam("khdxdh") String khdxdh,
			@FormParam("hykhdxdh") String hykhdxdh,
			@FormParam("tjrq") String tjrq, @FormParam("ckflag") String ckflag, @FormParam("dbSchema") String dbSchema) {
		log.info("****on server side,invoking selectQhjxqs," + khdxdh
				+ " start ********");

		Map map = new HashMap();
		map.put("khdxdh", khdxdh);
		map.put("hykhdxdh", hykhdxdh);
		map.put("tjrq", tjrq);
		map.put("stjrq", Integer.parseInt(tjrq) - 10000);
		map.put("ckflag", ckflag);
		map.put("db", dbSchema);

		List ztList = service.selectQhjxqsBykey(map);

		log.info("****on server side,invoking selectQhjxqs, " + ztList
				+ " completed********");

		return ztList;
	}

	// 查询行员类别
	@POST
	@Path("/loadHylb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Hylb> loadHylb(@FormParam("tableName") String tableName, @FormParam("dbSchema") String dbSchema) {
		log.info("****on server side,invoking loadHylb," + tableName
				+ " start ********");

		Map map = new HashMap();
		map.put("tableName", tableName);
		map.put("db", dbSchema);

		List<Hylb> ztList = service.getHylbList(map);

		log.info("****on server side,invoking loadHylb, " + ztList
				+ " completed********");

		return ztList;
	}

	// 更新点赞状态
	@POST
	@Path("/clickGood")
	@Consumes("application/x-www-form-urlencoded")
	public String clickGood(@FormParam("czzt") String czzt,
			@FormParam("hykhdxdh") String hykhdxdh,
			@FormParam("tjrq") String tjrq, @FormParam("khdxdh") String khdxdh, @FormParam("dbSchema") String dbSchema) {
		log.info("****on server side,invoking clickGood," + khdxdh
				+ " start ********");

		Map map = new HashMap();
		map.put("hykhdxdh", hykhdxdh);
		map.put("khdxdh", khdxdh);
		map.put("tjrq", tjrq);
		map.put("cdbh", 0);
		map.put("db", dbSchema);

		if (czzt.equals("0")) {
			service.insertGoodHy(map);
		} else {
			service.deleteGoodHy(map);
		}
		log.info("****on server side,invoking clickGood, " + map
				+ " completed********");
		return "更新成功";
	}

	/**
	 * 添加系统消息
	 * 
	 * @return
	 */
	@POST
	@Path("/addXtxx")
	public Response addXtxx(QueryCondition<APP_XTXX> condition) {
		APP_XTXX xtxx = condition.getCondition();
		log.info("****on server side,invoking addXtxx," + xtxx.getKhdxdh()
				+ " start ********");
		String czlx = xtxx.getCzlx();
		if (czlx.equals("1")) {

			service.insertXtxx(xtxx);
		} else {
			service.deleteXtxx(xtxx);
		}
		log.info("****on server side,invoking addXtxx, " + xtxx.getTjrq()
				+ " completed********");
		return Response.ok().build();
	}
	/**
	 * 查询绩效报告
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/selectJxbgByKhdxdh")
	@Consumes("application/x-www-form-urlencoded")
	public List<APP_JXHZ> selectJxbgByKhdxdh(@FormParam("sysdate") String sysdate,@FormParam("khdxdh") String khdxdh,@FormParam("khdxdh") String db) {
		log.info("****on server side,invoking selectJxbgByKhdxdh start ********");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", khdxdh);
		map.put("tjrq", sysdate);
		map.put("db", db);
		List<APP_JXHZ> jx = service.selectJxbgByKhdxdh(map);

		log.info("****on server side,invoking selectJxbgByKhdxdh completed ********");

		return jx;
	}
	
	/**
	 * 查询绩效组成
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/selectJxzcByKhdxdh")
	@Consumes("application/x-www-form-urlencoded")
	public List<APP_JXZC> selectJxzcByKhdxdh(@FormParam("sysdate") String sysdate,@FormParam("khdxdh") String khdxdh,@FormParam("khdxdh") String db) {
		log.info("****on server side,invoking selectJxzcByKhdxdh  start ********");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", khdxdh);
		map.put("tjrq", sysdate);
		map.put("db", db);
		List<APP_JXZC> jx = service.selectJxzcByKhdxdh(map);

		log.info("****on server side,invoking selectJxzcByKhdxdh completed ********");

		return jx;
	}

	/**
	 * 查询绩效明细
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/selectJxmxByKhdxdh")
	@Consumes("application/x-www-form-urlencoded")
	public List<APP_JXMX> selectJxmxByKhdxdh(@FormParam("sysdate") String sysdate,@FormParam("khdxdh") String khdxdh,@FormParam("khdxdh") String db) {
		log.info("****on server side,invoking selectJxmxByKhdxdh  start ********");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", khdxdh);
		map.put("tjrq", sysdate);
		map.put("db", db);
		List<APP_JXMX> jx = service.selectJxmxByKhdxdh(map);

		log.info("****on server side,invoking selectJxmxByKhdxdh completed ********");

		return jx;
	}
	
	/**
	 * 查询客户情况
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/selectKhqkByKhdxdh")
	@Consumes("application/x-www-form-urlencoded")
	public List<APP_KHQK> selectKhqkByKhdxdh(@FormParam("sysdate") String sysdate,@FormParam("khdxdh") String khdxdh,@FormParam("khdxdh") String db) {
		log.info("****on server side,invoking selectKhqkByKhdxdh start ********");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khdxdh", khdxdh);
		map.put("tjrq", sysdate);
		map.put("db", db);
		List<APP_KHQK> jx = service.selectKhqkByKhdxdh(map);

		log.info("****on server side,invoking selectKhqkByKhdxdh  completed ********");

		return jx;
	}


}
