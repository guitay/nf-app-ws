package com.nf.app.zdwd;

import java.util.List;


/**
 * 制度文档Service
 * @author Wangql
 *
 */
public interface ZdwdService {
  
	final static String KEY = "zdwd.ZdwdService";
	
	public List<Zdwd> query(String db);
	

}
