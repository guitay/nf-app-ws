package com.nf.app.log;


import java.util.List;
import java.util.Map;

import com.nf.app.bean.pojo.M_CSBDmms;
import com.nf.app.bean.pojo.M_KHB;
import com.nf.app.bean.pojo.M_RZB;

@SuppressWarnings("unchecked")
public interface LogService {

	final static String KEY = "mpas.logService";
	
	public void insertLog(M_RZB log);
	/**
	 * 查询记录
	 * 
	 * @param map
	 * @param beginRow
	 * @param pageSize
	 * @return
	 */
	public List<M_RZB> selectKhrzByPara(Map map, int beginRow, int pageSize);

	/**
	 * 查询总条数
	 * 
	 * @param map
	 * @return
	 */
	public Integer selectCountRows(Map map);
	
	/**
	 * 获取银行标识
	 * @return
	 */
	public List<M_KHB> selectYhbs();
	
	/**
	 * 获取代码描述
	 * @param map
	 * @return
	 */
	public List<M_CSBDmms> selectCSBDmms(Map map);

	
}
