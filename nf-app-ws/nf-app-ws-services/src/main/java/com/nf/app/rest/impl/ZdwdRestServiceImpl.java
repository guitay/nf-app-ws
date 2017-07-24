package com.nf.app.rest.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.pojo.QueryCondition;
import com.nf.app.bean.zdwd.Zdwd;
import com.nf.app.rest.ZdwdRestService;
import com.nf.app.zdwd.ZdwdService;

@Path("/zdwd/")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Component
public class ZdwdRestServiceImpl implements ZdwdRestService {
	private int defaultRowStart = 0;
	private int defaultPageSize = 50;
	private Log log = LogFactory.getLog(this.getClass());
	@Autowired
	private ZdwdService service;

	public ZdwdRestServiceImpl() {

	}

	public ZdwdService getService() {
		return service;
	}

	public void setService(ZdwdService service) {
		this.service = service;
	}

	/*
	 * 查询所有文档
	 */
	@POST
	@Path("/query")
	public List<Zdwd> query(QueryCondition<Zdwd> condition) {

		List<Zdwd> list = service.query(condition.getDb());
		return list;

	}
	
	/*
	 * 加载文档内容
	 */
	@POST
	@Path("/load")
	@Consumes("application/x-www-form-urlencoded")
	public String load(@FormParam("wdmc") String wdmc) {

		try {  
//			if(wdmc.indexOf(".docx")!=-1){
//				Docx2Html docx = new Docx2Html();
//				docx.doGenerateSysOut(wdmc);
//				wdmc = wdmc.replaceAll("docx","jsp");
//			}else if(wdmc.indexOf(".doc")!=-1){
//				Doc2Html doc = new Doc2Html();
//				doc.getWordAndStyle(wdmc); 
//				wdmc = wdmc.replaceAll("doc","jsp");
//			}else if(wdmc.indexOf(".pdf")!=-1){
//				Pdf2Html pdf = new Pdf2Html();
//				pdf.transform(wdmc); 
//				wdmc = wdmc.replaceAll("pdf","jsp");
//			}
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		return wdmc;

	}


}
