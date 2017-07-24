package com.nf.app.rest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nf.app.ckyy.Ckyy;

@Path("/yjyy/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public interface CkyyRestService { 

	/*
	 * 查询预约类型 wzj
	 */
	@POST
	@Path("/queryyylx")
	public List<Map> queryYylx(Ckyy ckyy) ;

	/*
	 * 查询所有预约 wzj
	 */
	@POST
	@Path("/querysyyy")
	@Consumes("application/x-www-form-urlencoded")
	public List<Ckyy> queryYy(@FormParam("khdxdh") int khdxdh, @FormParam("yylx") String yylx, String dbSchema) ;

	/*
	 * 查看预约的详情 wzj
	 */
	@POST
	@Path("/queryyyxq")
	@Consumes("application/x-www-form-urlencoded")
	public Ckyy loadYyBylsh(@FormParam("lsh") double lsh, @FormParam("khdxdh") int khdxdh, String dbSchame);

	@POST
	@Path("/saveyy")
	@Consumes("application/x-www-form-urlencoded")
	public String saveYy(@FormParam("lsh") long lsh, @FormParam("khdxdh") int khdxdh,
			@FormParam("jgkhdxdh") int jgkhdxdh, @FormParam("jgmc") String jgmc, @FormParam("khlx") int khlx,
			@FormParam("zjlb") String zjlb, @FormParam("zjhm") String zjhm, @FormParam("yjje") BigDecimal yjje,
			@FormParam("blrq") int blrq, @FormParam("yyqsrq") int yyqsrq, @FormParam("khmc") String khmc,
			@FormParam("yyjsrq") int yyjsrq, @FormParam("bz") String bz, @FormParam("ppbz") String ppbz,
			@FormParam("yylx") String yylx, String dbSchema) ;

	@POST
	@Path("/deleteyy")
	@Consumes("application/x-www-form-urlencoded")
	public void deleteYyByLsh(@FormParam("khdxdh") int khdxdh, @FormParam("lsh") long lsh, String dbSchema) ;

	@POST
	@Path("/queryzzlb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Map> loadZzlb(@FormParam("dbSchema") String dbSchema) ;


}
