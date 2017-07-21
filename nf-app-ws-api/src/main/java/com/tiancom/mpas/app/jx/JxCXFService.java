package com.tiancom.mpas.app.jx;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.tiancom.mpas.pojo.QueryCondition;

/**
 * 绩效工资CXF接口
 * 
 * @author Tancr
 * 
 */
public interface JxCXFService {

	/**
	 * 查询绩效工资
	 * 
	 * @param condition
	 * @return
	 */
	public APP_JXGZ queryJxgz(QueryCondition<APP_JXGZ> condition);

	/**
	 * 查询绩效月K
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_JXGZ> queryJxyk(QueryCondition<APP_JXGZ> condition);

	/**
	 * 查询绩效月K
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_JXGZ> queryJxrk(QueryCondition<APP_JXGZ> condition);

	/**
	 * 查询绩效月K
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_JXGZ> queryJxmx(QueryCondition<APP_JXGZ> condition);

	/**
	 * 查询点赞数
	 * 
	 * @param condition
	 * @return
	 */
	public APP_ZAN queryGoods(QueryCondition<APP_ZAN> condition);

	/**
	 * 查询评论
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_PL> queryPl(QueryCondition<APP_PL> condition);

	/**
	 * 查询评论
	 * 
	 * @param condition
	 * @return
	 */
	public List<APP_HF> queryHf(QueryCondition<APP_HF> condition);

	/**
	 * 添加评论
	 * 
	 * @param condition
	 * @return
	 */
	public Response addPl(QueryCondition<APP_PL> condition);

	/**
	 * 删除评论
	 * @param dbSchema TODO
	 * @param condition
	 * 
	 * @return
	 */
	public Response deletePl(@PathParam("plbh") String plbh, String dbSchema);

	public Response deleteHf(String hfbh, String dbSchema);

	public Response addHf(QueryCondition<APP_HF> condition);

	// 查询行员全行绩效列表
	public List<QhjxList> selectQhjxPhb(String khdxdh, String tjrq, String pm, String hylb, String dbSchema);

	// 查询行员全行绩效列表
	public List<QhjxList> selectHyqhjxphb(String khdxdh, String tjrq, String ck_flag, String hylb, String dbSchema);


	// 查询全行绩效明细
	public List<QhjxMx> selectQhjxmx(String khdxdh, String tjrq, String hykhdxdh, String dbSchema);

	// 查询全行绩效趋势

	public List<QhjxMx> selectQhjxqs(String khdxdh, String hykhdxdh, String tjrq, String ckflag, String dbSchema);

	
	// 查询行员类别

	public List<Hylb> loadHylb(String tableName, String dbSchema);

	// 更新点赞状态

	public String clickGood(String czzt, String hykhdxdh, String tjrq, String khdxdh, String dbSchema);

	/**
	 * 添加系统消息
	 * 
	 * @return
	 */
	public Response addXtxx(QueryCondition<APP_XTXX> condition);
	
	public List<APP_JXHZ> selectJxbgByKhdxdh(String sysdate,String khdxdh,String db);
	
	public List<APP_JXZC> selectJxzcByKhdxdh(String sysdate,String khdxdh,String db);
	
	public List<APP_JXMX> selectJxmxByKhdxdh(String sysdate,String khdxdh,String db);
	
	public List<APP_KHQK> selectKhqkByKhdxdh(String sysdate,String khdxdh,String db);
	

}
