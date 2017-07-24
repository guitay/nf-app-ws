package com.nf.app.jx;

import java.util.List;
import java.util.Map;

import com.nf.app.bean.jx.APP_HF;
import com.nf.app.bean.jx.APP_JXGZ;
import com.nf.app.bean.jx.APP_JXHZ;
import com.nf.app.bean.jx.APP_JXMX;
import com.nf.app.bean.jx.APP_JXZC;
import com.nf.app.bean.jx.APP_KHQK;
import com.nf.app.bean.jx.APP_PL;
import com.nf.app.bean.jx.APP_XTXX;
import com.nf.app.bean.jx.APP_ZAN;


/**
 * 绩效Service
 * @author tancr
 *
 */
@SuppressWarnings("unchecked")
public interface JxService {
  
	final static String KEY = "jx.jxService";
	
	
	public APP_JXGZ selectGrjxBykey(Map<String, Object> map);
	
	public List<APP_JXGZ> selectJxqsBykey(Map<String, Object> map);
	
	public  List<APP_JXGZ> selectGrjxmxList(Map<String, Object> map);
	
	public APP_ZAN selectGoods(Map<String, Object> map);
	
	public Integer selectCntByZan(Map<String, Object> map);
	
	
	public void insertGoodHy(Map<String, Object> map);
	
	public void deleteGoodHy(Map<String, Object> map);
	
	
	public List getHylbList(Map map);
	
	public List<APP_PL> selectXxplList(Map map);
	public List<APP_HF> selectXxhfList(Map map);
	
	public void insertXxpl(Map map);
	public void insertXxhf(Map map);
	
	public void deleteXxpl(Map map);
	public void deleteXxhf(Map map);
	
	public List selectQhjxList(Map map);
	public List selectJgjxList(Map map);
	
	
	public List<APP_JXGZ> selectQhjxqsBykey(Map<String, Object> map);
	public List<APP_JXGZ> selectQhjxmxBykey(Map<String, Object> map);
	
	public List selectHyqhjxList(Map map);
	
	
	public void insertXtxx(APP_XTXX xtxx );
	
	public void deleteXtxx(APP_XTXX xtxx);
	
	public List<APP_JXHZ> selectJxbgByKhdxdh(Map map);
	
	public List<APP_JXZC> selectJxzcByKhdxdh(Map map);
	
	public List<APP_JXMX> selectJxmxByKhdxdh(Map map);
	
	public List<APP_KHQK> selectKhqkByKhdxdh(Map map);
}
