package com.nf.app.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.nf.app.bean.yj.Zbxq;

@Path("/yj/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Service
public interface YjRestService {

	/*
	 * 查询当前登录行员的所有指标 wzj
	 */
	@POST
	@Path("/gryj/qureysyzb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Zbxq> loadGrYj(@FormParam("tjrq") int tjrq, @FormParam("khdxdh") int khdxdh,
			@FormParam("ywlb") String ywlb, @FormParam("khzq") int khzq, @FormParam("startRow") int startRow,
			@FormParam("pageSize") int pageSize,  @FormParam("dbSchema") String dbSchema) ;

	/*
	 * 查询个人业绩某条指标的详情 wzj
	 */
	@POST
	@Path("/gryj/qureyzbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadGrFixedBlock(@FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh,
			 @FormParam("tjrq") int tjrq, @FormParam("khdxdh") int khdxdh,  @FormParam("dbSchema") String dbSchema) ;

	/*
	 * 获取指标的历史详情 wzj
	 */
	@POST
	@Path("/gryj/qureylszbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadGrChangingBlock( @FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh,  @FormParam("dbSchema") String dbSchema) ;

	@POST
	@Path("/jgyj/qureysyzb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Zbxq> loadJgYj(@FormParam("khzq") int khzq, @FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("ywlb") String ywlb, @FormParam("startRow") int startRow,
			@FormParam("pageSize") int pageSize,  @FormParam("dbSchema") String dbSchema) ;

	@POST
	@Path("/jgyj/qureyzbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadJgFixedBlock(@FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh,  @FormParam("dbSchema") String dbSchema) ;

	@POST
	@Path("/jgyj/qureylszbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadJgChangingBlock( @FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh,  @FormParam("dbSchema") String dbSchema) ;

	@POST
	@Path("/qhyj/qureysyzb")
	@Consumes("application/x-www-form-urlencoded")
	public List<Zbxq> loadQhYj(@FormParam("khzq") int khzq, @FormParam("khdxdh") int khdxdh,
			@FormParam("tjrq") int tjrq, @FormParam("ywlb") String ywlb, @FormParam("startRow") int startRow,
			@FormParam("pageSize") int pageSize,  @FormParam("dbSchema") String dbSchema) ;

	@POST
	@Path("/qhyj/qureyjgxq")
	@Consumes("application/x-www-form-urlencoded")
	public List<Zbxq> loadJgxqByZb(@FormParam("khzbdh") int khzbdh, @FormParam("khzq") int khzq,
			@FormParam("tjrq") int tjrq,  @FormParam("dbSchema") String dbSchema) ;

	@POST
	@Path("/qhyj/qureyjgzbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadJgFixedBlockInQh( @FormParam("tjrq") int tjrq,
			@FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh, @FormParam("jgdh") String jgdh,  @FormParam("dbSchema") String dbSchema) ;

	@POST
	@Path("/qhyj/qureyjglszbxq")
	@Consumes("application/x-www-form-urlencoded")
	public Zbxq loadJgChangingBlockInQh( @FormParam("tjrq") int tjrq,
			@FormParam("khzq") int khzq, @FormParam("khzbdh") int khzbdh, @FormParam("jgdh") String jgdh,  @FormParam("dbSchema") String dbSchema) ;


}
