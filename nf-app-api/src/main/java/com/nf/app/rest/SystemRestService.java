
package com.nf.app.rest;

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

import com.nf.app.bean.pojo.Dmms;
import com.nf.app.bean.pojo.Hylb;
import com.nf.app.bean.pojo.Jg;
import com.nf.app.bean.pojo.MPAS_HY;
import com.nf.app.bean.pojo.Menu;
import com.nf.app.bean.pojo.XTCS;

import io.swagger.annotations.Api;

/**
 * 系统参数CXF接口
 * 
 * @author NongFei
 *
 */
@Path("/system")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Api("/system")
public interface SystemRestService {

	/**
	 * 001M001按参数名称取得系统参数
	 * 
	 * @param fk
	 * 
	 * @return
	 */
	@GET
	@Path("/getxtcs/{csmc}/{dbSchema}")
	public XTCS getXtcs(@PathParam("csmc") String csmc, @PathParam("dbSchema") String dbSchema) ;

	/**
	 * 001M002按代码名称取得代码描述列表
	 * 
	 * @return
	 */
	@GET
	@Path("/getdmms/{dmmc}/{dbSchema}")
	public List<Dmms> getdmms(@PathParam("dmmc") String dmmc, @PathParam("dbSchema") String dbSchema);

	/**
	 * M003 getloginuser 根据登陆名称查询行员
	 * 
	 * @param dlmc
	 * @return
	 */
	@GET
	@Path("/getloginuser/{dlmc}/{db}")
	public MPAS_HY getLoginUser(@PathParam("dlmc") String dlmc,@PathParam("db") String db) ;

	/**
	 * M004 getrootjg 取得根机构
	 * 
	 * @return
	 */
	@GET
	@Path("/getrootjg/{dbSchema}")
	public Jg getRootJg(@PathParam("dbSchema") String dbSchema);

	/**
	 * M005 按机构考核对象代号取得机构
	 * 
	 * @param khdxdh
	 * @return
	 */
	@GET
	@Path("/getjgbykhdxdh/{khdxdh}/{dbSchema}")
	public Jg getJgByKhdxdh(@PathParam("khdxdh") Integer khdxdh, @PathParam("dbSchema") String dbSchema);

	/**
	 * M006 按机构考核对象代号取得机构的子机构
	 * 
	 * @return
	 */
	@GET
	@Path("/getjgchildren/{khdxdh}/{dbSchema}")
	public List<Jg> getJgChildren(@PathParam("khdxdh") Integer khdxdh, @PathParam("dbSchema") String dbSchema);

	/**
	 * M007 按机构考核对象代号取得机构的父机构
	 * 
	 * @param khdxdh
	 * @return
	 */
	@GET
	@Path("/getparentjg/{khdxdh}/{dbSchema}")
	public Jg getParentJg(@PathParam("khdxdh") Integer khdxdh, @PathParam("dbSchema") String dbSchema);

	/**
	 * M008 getHyMenus 按行员考核对象代号取得行员菜单
	 * 
	 * @return
	 */
	@GET
	@Path("/getHyMenus/{tjrq}/{khdxdh}/{dbSchema}")
	public List<Menu> getHyMenus(@PathParam("tjrq") Integer tjrq, @PathParam("khdxdh") Integer khdxdh,
			@PathParam("dbSchema") String dbSchema) ;

	/**
	 * M009 getHyIndexMenus 按行员考核对象代号取得个人首页菜单
	 * 
	 * @param khdxdh
	 * @return
	 */
	@GET
	@Path("/getHyIndexMenus/{tjrq}/{khdxdh}/{lbdh}/{dbSchema}")
	public List<Menu> getHyIndexMenus(@PathParam("tjrq") String tjrq, @PathParam("khdxdh") Integer khdxdh,
			@PathParam("lbdh") String lbdh,@PathParam("dbSchema") String dbSchema);

	/**
	 * M010 getHylbByKhdxdh 按行员考核对象代号取得所有行员类别
	 * 
	 * @param khdxdh
	 * @return
	 */
	@GET
	@Path("/getHylbByKhdxdh/{tjrq}/{khdxdh}/{dbSchema}")
	public List<Hylb> getHylbByKhdxdh(@PathParam("tjrq") Integer tjrq, @PathParam("khdxdh") Integer khdxdh,
			@PathParam("dbSchema") String dbSchema) ;

	/**
	 * M011 getZxgg 按行员考核对象代号取得行员最新公告
	 * 
	 * @param khdxdh
	 * @return
	 */
	@GET
	@Path("/getZxgg/{khdxdh}/{dbSchema}")
	public String getZxgg(@PathParam("khdxdh") Integer khdxdh, @PathParam("dbSchema") String dbSchema);

	/**
	 * M012 getRw 按行员考核对象代号取得行员任务
	 * 
	 * @param khdxdh
	 * @return
	 */
	@GET
	@Path("/getRw/{khdxdh}/{dbSchema}")
	public List<Map> getRw(@PathParam("khdxdh") Integer khdxdh, @PathParam("dbSchema") String dbSchema) ;

	/**
	 * M013 insertCzrz 插入操作日志
	 * 
	 * @param khdxdh
	 * @return
	 */
	@POST
	@Path("/insertCzrz")
	@Consumes("application/x-www-form-urlencoded")
	public Response insertCzrz(@FormParam("cdbh") String cdbh, @FormParam("cdmc") String cdmc,
			@FormParam("tjrq") String tjrq, @FormParam("dlkhdxdh") Integer dlkhdxdh, @FormParam("czsj") String czsj,
			@FormParam("dbSchema") String dbSchema) ;

}
