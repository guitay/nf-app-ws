package com.nf.app.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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

/**
 * 绩效工资CXF接口
 * 
 * @author Tancr
 * 
 */
@Path("/jx/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public interface JxRestService {

	/**
	 * 查询绩效工资
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJxgz")
	public APP_JXGZ queryJxgz(QueryCondition<APP_JXGZ> condition) ;

	/**
	 * 查询绩效月K
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJxyk")
	public List<APP_JXGZ> queryJxyk(QueryCondition<APP_JXGZ> condition) ;

	/**
	 * 查询绩效月K
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJxrk")
	public List<APP_JXGZ> queryJxrk(QueryCondition<APP_JXGZ> condition) ;

	/**
	 * 查询绩效月K
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryJxmx")
	public List<APP_JXGZ> queryJxmx(QueryCondition<APP_JXGZ> condition);

	/**
	 * 查询点赞数
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryGoods")
	public APP_ZAN queryGoods(QueryCondition<APP_ZAN> condition);

	/**
	 * 查询评论
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryPl")
	public List<APP_PL> queryPl(QueryCondition<APP_PL> condition) ;

	/**
	 * 查询评论
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/queryHf")
	public List<APP_HF> queryHf(QueryCondition<APP_HF> condition) ;

	/**
	 * 添加评论
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/addPl")
	public Response addPl(QueryCondition<APP_PL> condition) ;

	/**
	 * 删除评论
	 * @param condition
	 * 
	 * @return
	 */
	@GET
	@Path("/deletePl/{plbh}/{dbSchema}")
	public Response deletePl(@PathParam("plbh") String plbh, @PathParam("dbSchema") String dbSchema) ;

	@GET
	@Path("/deleteHf/{hfbh}/{dbSchema}")
	public Response deleteHf(@PathParam("hfbh") String hfbh, @PathParam("dbSchema") String dbSchema) ;

	@POST
	@Path("/addHf")
	public Response addHf(QueryCondition<APP_HF> condition) ;

	// 查询行员全行绩效列表
	@POST
	@Path("/selectQhjxPhb")
	@Consumes("application/x-www-form-urlencoded")
	public List<QhjxList> selectQhjxPhb(@FormParam("khdxdh") String khdxdh,
			@FormParam("tjrq") String tjrq, @FormParam("pm") String pm,
			@FormParam("hylb") String hylb, @FormParam("dbSchema") String dbSchema) ;

	// 查询行员全行绩效列表
	@POST
	@Path("/selectHyqhjxphb")
	@Consumes("application/x-www-form-urlencoded")
	public List<QhjxList> selectHyqhjxphb(@FormParam("khdxdh") String khdxdh,
			@FormParam("tjrq") String tjrq,
			@FormParam("ck_flag") String ck_flag, @FormParam("hylb") String hylb, @FormParam("dbSchema") String dbSchema) ;

	
	// 查询全行绩效明细
	@POST
	@Path("/selectQhjxmx")
	@Consumes("application/x-www-form-urlencoded")
	public List<QhjxMx> selectQhjxmx(@FormParam("khdxdh") String khdxdh,
			@FormParam("tjrq") String tjrq,
			@FormParam("hykhdxdh") String hykhdxdh, @FormParam("dbSchema") String dbSchema) ;

	// 查询全行绩效趋势
	@POST
	@Path("/selectQhjxqs")
	@Consumes("application/x-www-form-urlencoded")
	public List<QhjxMx> selectQhjxqs(@FormParam("khdxdh") String khdxdh,
			@FormParam("hykhdxdh") String hykhdxdh,
			@FormParam("tjrq") String tjrq, @FormParam("ckflag") String ckflag, @FormParam("dbSchema") String dbSchema) ;

	// 查询行员类别
	@POST
	@Path("/loadHylb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Hylb> loadHylb(@FormParam("tableName") String tableName, @FormParam("dbSchema") String dbSchema) ;

	// 更新点赞状态
	@POST
	@Path("/clickGood")
	@Consumes("application/x-www-form-urlencoded")
	public String clickGood(@FormParam("czzt") String czzt,
			@FormParam("hykhdxdh") String hykhdxdh,
			@FormParam("tjrq") String tjrq, @FormParam("khdxdh") String khdxdh, @FormParam("dbSchema") String dbSchema) ;

	/**
	 * 添加系统消息
	 * 
	 * @return
	 */
	@POST
	@Path("/addXtxx")
	public Response addXtxx(QueryCondition<APP_XTXX> condition) ;
	/**
	 * 查询绩效报告
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/selectJxbgByKhdxdh")
	@Consumes("application/x-www-form-urlencoded")
	public List<APP_JXHZ> selectJxbgByKhdxdh(@FormParam("sysdate") String sysdate,@FormParam("khdxdh") String khdxdh,@FormParam("khdxdh") String db) ;
	
	/**
	 * 查询绩效组成
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/selectJxzcByKhdxdh")
	@Consumes("application/x-www-form-urlencoded")
	public List<APP_JXZC> selectJxzcByKhdxdh(@FormParam("sysdate") String sysdate,@FormParam("khdxdh") String khdxdh,@FormParam("khdxdh") String db) ;

	/**
	 * 查询绩效明细
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/selectJxmxByKhdxdh")
	@Consumes("application/x-www-form-urlencoded")
	public List<APP_JXMX> selectJxmxByKhdxdh(@FormParam("sysdate") String sysdate,@FormParam("khdxdh") String khdxdh,@FormParam("khdxdh") String db) ;
	
	/**
	 * 查询客户情况
	 * 
	 * @param condition
	 * @return
	 */
	@POST
	@Path("/selectKhqkByKhdxdh")
	@Consumes("application/x-www-form-urlencoded")
	public List<APP_KHQK> selectKhqkByKhdxdh(@FormParam("sysdate") String sysdate,@FormParam("khdxdh") String khdxdh,@FormParam("khdxdh") String db) ;


}
