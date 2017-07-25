package com.nf.app.service.zdwd;

import java.util.List;

import com.nf.app.bean.zdwd.Zdwd;


/**
 * 制度文档Service
 * @author Wangql
 *
 */
public interface ZdwdService {
  
	final static String KEY = "zdwd.ZdwdService";
	
	public List<Zdwd> query(String db);
	

}
