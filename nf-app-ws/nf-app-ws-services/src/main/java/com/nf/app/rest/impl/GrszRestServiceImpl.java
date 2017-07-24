
package com.nf.app.rest.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.grsz.FaInfo;
import com.nf.app.grsz.GrszService;
import com.nf.app.grsz.PfHyList;
import com.nf.app.grsz.PfInfo;
import com.nf.app.grsz.Txsz;
import com.nf.app.grsz.Xxts;
import com.nf.app.grsz.Yhfk;
import com.nf.app.grsz.ZxpfCs;
import com.nf.app.grsz.ZxpfPojo;
import com.nf.app.rest.GrszRestService;
import com.nf.pojo.QueryCondition;

/**
 * 系统参数CXF接口
 * @author NongFei
 *
 */
@Path("/grsz/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML })
@Component
public class GrszRestServiceImpl implements GrszRestService {

	private static final Logger log = LoggerFactory.getLogger(GrszRestServiceImpl.class);
	@Autowired
	private GrszService service;

	public GrszRestServiceImpl() {

	} 

	
	public GrszService getService() {
		return service;
	}


	public void setService(GrszService service) {
		this.service = service;
	}

	//-------------------------new----------------------------
	@POST
	@Path("/loadXxList")
	public List<Xxts> selectXxList(Xxts xx) {
		log.info("****on server side,invoking loadXxList,"+xx.getTshy()+" start ********");
		
		List<Xxts> ztList = service.selectXxList(xx);
		
		log.info("****on server side,invoking loadXxList, "+xx.getTshy()+" completed ********");
		
		return ztList;
	}
	
	@POST
	@Path("/insertXxts")
	public Response insertXxts(Xxts ts) {
		log.info("****on server side,invoking insertXxts," + ts.getTshy() +",start ********");
		
		service.insertXxts(ts);

		log.info("****on server side,invoking insertXxts, " + ts.getTshy() +",completed ********");
		
		return Response.ok().build();
	}
	
	@POST
	@Path("/updateXxzt")
	public Response updateXxzt(Xxts ts) {
		log.info("****on server side,invoking updateXxzt,"+ts.getTshy()+" start ********");
		
		service.updateXxzt(ts);
		
		log.info("****on server side,invoking updateXxzt, "+ts.getTshy()+" completed********");
		return Response.ok().build();
	}
	
	@POST
	@Path("/loadTxsz")
	public List<Txsz> selectTxsz(Txsz sz) {
		log.info("****on server side,invoking loadTxsz,"+sz.getKhdxdh()+" start ********");

		List<Txsz> ztList = service.selectTxsz(sz);
		
		log.info("****on server side,invoking loadTxsz, "+sz.getKhdxdh()+" completed ********");
		
		return ztList;
	}
	
	@POST
	@Path("/updateTxsz")
	public Response updateTxsz(Txsz sz) {
		log.info("****on server side,invoking updateTxsz,"+sz.getKhdxdh()+" start ********");
		
		service.updateTxsz(sz);
		
		log.info("****on server side,invoking updateTxsz, "+sz.getKhdxdh()+" completed********");
		return Response.ok().build();
	}
	
	//-------------------------new----------------------------
	@POST
	@Path("/loadZxpf")
	public List<PfHyList> loadZxpf(QueryCondition<ZxpfCs> condition) {
		ZxpfCs cs=condition.getCondition();
		log.info("****on server side,invoking loadZxpf,"+cs.getKhdxdh()+" start ********");
		if(StringUtils.isNotBlank(cs.getCdbh())){}
			//根据菜单编号查询菜单相关信息；
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("cdbh",cs.getCdbh());
			map.put("khdxdh", cs.getKhdxdh());
			map.put("tjrq", cs.getTjrq());
			map.put("db", condition.getDb());
			if(StringUtils.isBlank(cs.getTableName())){
				return null;
			}
			
			map.put("tableName", cs.getTableName());
			//查询评分信息（按0-未评分/1-已评分）
			List<PfHyList> pfList=null;
			if(StringUtils.isNotBlank("pfzt")){
				map.put("pfzt", cs.getPfzt());
			}
			pfList=service.getZxpf(map,(int)condition.getStartRow(), condition.getPageSize());
			getPfByHy(pfList,service,map);
		
		log.info("****on server side,invoking loadZxpf, "+map+" completed********");
		return pfList;
	}
	
	//获取在线评分选项详情
	private void getPfByHy(List<PfHyList> pfList,GrszService service,Map map) {
		List<PfInfo> zhInfos=service.getPfInfo(map);//查出所有的评分项数据
		Map<String,List<PfInfo>> pfinfo=new HashMap<String, List<PfInfo>>();//按行员和方案编号保存对应的多条账户信息
		for (int i = 0; i < zhInfos.size(); i++) {
			PfInfo zhInfoMap=zhInfos.get(i);
			String khdxdh=zhInfoMap.getHykhdxdh().toString()+"-"+zhInfoMap.getFabh().toString()+"-"+zhInfoMap.getKhqs().toString();//该账户信息的khdxdh
			if(pfinfo.containsKey(khdxdh)){
				List<PfInfo> zhMap=pfinfo.get(khdxdh);
				zhMap.add(zhInfoMap);
			}else{
				List<PfInfo> zhMap=new ArrayList<PfInfo>();
				zhMap.add(zhInfoMap);
				pfinfo.put(khdxdh, zhMap);
			}
					
		}
		for (int i = 0; i < pfList.size(); i++) {
			PfHyList cus=pfList.get(i);
			String string = cus.getKhdxdh()+"-"+cus.getFabh()+"-"+cus.getKhqs();
			cus.setInfoList(pfinfo.get(string));
		}
	}
	
	//查询方案选项详情
	@POST
	@Path("/loadZxpfSelect")
	@Consumes("application/x-www-form-urlencoded")
	public List<FaInfo> loadZxpfSelect(@FormParam("fabh") String fabh,
										@FormParam("xmbh") String xmbh, @FormParam("dbSchema")String dbSchema) {
		log.info("****on server side,invoking selectXttzWdxx,"+fabh+"/"+xmbh+" start ********");
		Map map=new HashMap();
		map.put("fabh", fabh);
		map.put("xmbh", xmbh);
		List<FaInfo> ztList= service.getPfSelect(map);
		log.info("****on server side,invoking selectXttzWdxx, "+map+" completed********");
		return ztList;
	}
	
	@POST
	@Path("/updatePfInfo")
	public Response updatePfInfo(ZxpfPojo zxpf) {
		log.info("****on server side,invoking updatePfInfo, khdxdh: " + zxpf.getKhdxdh()+",start ********");
		Map map = new HashMap();
		map.put("khdxdh", zxpf.getKhdxdh());
		map.put("hykhdxdh", zxpf.getHykhdxdh());
		map.put("khfabh", zxpf.getKhfabh());
		map.put("khqs", zxpf.getKhqs());
		map.put("xmbh", zxpf.getXmbh());
		map.put("df", zxpf.getDf());
		map.put("tjrq", zxpf.getTjrq());
		map.put("db", zxpf.getDb());
		service.updatePfInfo(map);

		log.info("****on server side,invoking updatePfInfo, map: " + map+",completed ********");
		
		return Response.ok().build();
	}
	
	@POST
	@Path("/updatePy")
	public Response updatePy(ZxpfPojo zxpf) {
		log.info("****on server side,invoking updatePy, khdxdh: " + zxpf.getKhdxdh()+",start ********");
		Map map = new HashMap();
		map.put("yhbs", zxpf.getYhbs());
		map.put("dfzkhdxdh", zxpf.getKhdxdh());
		map.put("hykhdxdh", zxpf.getHykhdxdh());
		map.put("khfabh", zxpf.getKhfabh());
		map.put("khqs", zxpf.getKhqs()); 
		map.put("py", zxpf.getPy()); 
		map.put("db", zxpf.getDb());
		service.updatePy(map);//保存评语
		
		log.info("****on server side,invoking updatePy, map: " + map+",completed ********");
		
		return Response.ok().build();
	} 
	
	@POST
	@Path("/saveyjfk")
	public Response saveYjfk(Yhfk fk) {
		log.info("****on server side,invoking saveYjfk, fk email: " + fk.getEmail()+",start ********");
		Map map=new HashMap();
		map.put("khdxdh", fk.getKhdxdh());
		map.put("tjrq", fk.getTjrq());
		map.put("lynr", fk.getLynr());
		map.put("email", fk.getEmail());
		map.put("phone", fk.getPhone());
		map.put("txrq", fk.getTxrq());
		map.put("db", fk.getDb());
		service.insertYhfk(map);

		log.info("****on server side,invoking saveYjfk, fk email: " + fk.getEmail()+",completed ********");
		
		return Response.ok().build();
	}


	
	
}
