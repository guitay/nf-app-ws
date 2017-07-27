
package com.nf.app.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.nf.app.bean.grsz.FaInfo;
import com.nf.app.bean.grsz.PfHyList;
import com.nf.app.bean.grsz.Txsz;
import com.nf.app.bean.grsz.Xxts;
import com.nf.app.bean.grsz.Yhfk;
import com.nf.app.bean.grsz.ZxpfCs;
import com.nf.app.bean.grsz.ZxpfPojo;
import com.nf.app.bean.pojo.QueryCondition;

import io.swagger.annotations.Api;



/**
 * 系统参数CXF接口
 * @author NongFei
 *
 */
@Path("/grsz/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
@Api("/grsz")
@Service
public interface GrszRestService {

	@POST
	@Path("/loadXxList")
	public List<Xxts> selectXxList(Xxts xx) ;
	
	@POST
	@Path("/insertXxts")
	public Response insertXxts(Xxts ts) ;
	
	@POST
	@Path("/updateXxzt")
	public Response updateXxzt(Xxts ts) ;
	
	@POST
	@Path("/loadTxsz")
	public List<Txsz> selectTxsz(Txsz sz) ;
	
	@POST
	@Path("/updateTxsz")
	public Response updateTxsz(Txsz sz) ;
	
	//-------------------------new----------------------------
	@POST
	@Path("/loadZxpf")
	public List<PfHyList> loadZxpf(QueryCondition<ZxpfCs> condition) ;
	

	
	//查询方案选项详情
	@POST
	@Path("/loadZxpfSelect")
	@Consumes("application/x-www-form-urlencoded")
	public List<FaInfo> loadZxpfSelect(@FormParam("fabh") String fabh,
										@FormParam("xmbh") String xmbh, @FormParam("dbSchema")String dbSchema) ;
	
	@POST
	@Path("/updatePfInfo")
	public Response updatePfInfo(ZxpfPojo zxpf) ;
	
	@POST
	@Path("/updatePy")
	public Response updatePy(ZxpfPojo zxpf) ;
	
	@POST
	@Path("/saveyjfk")
	public Response saveYjfk(Yhfk fk) ;


	
	
}
