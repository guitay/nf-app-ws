package com.nf.app.kh;

import java.util.List;
import java.util.Map;

import com.nf.app.bean.pojo.APP_KH;


/**
 * 大客户Service
 * @author zhouyan
 *
 */
@SuppressWarnings("unchecked")
public interface KhService {
  
	final static String KEY = "Kh.KhService";
	
	/**
	 * 查询客户信息
	 * @param map
	 * @return
	 */
	public List<APP_KH> getCustomers(Map<String, Object> map,int beginRow,int pageSize);
	/**
	 * 根据客户信息获取其账户信息
	 * @param map
	 * @return
	 */
	public List<APP_KH> getZhInfo(Map map);
	
	/**
	 * 修改关注客户的状态
	 * @param map
	 */
	public void updateGzkhStates(Map map);
	
	/**
	 * 添加关注客户
	 * @param map
	 */
	public void addGzkh(Map map);
	/**
	 * 添加关注账户
	 * @param map
	 */
	public void addGzzhxx(Map map);
	
	/**
	 * 查询关注客户信息是否存在
	 * @param map
	 * @return
	 */
	public Integer getGzkhCount(Map map);
	
	/**
	 * 删除关注客户
	 * @param map
	 */
	public void deleteGzkh(Map map);
	
	/**
	 * 删除关注账户信息
	 * @param map
	 */
	public void deleteGzzhxx(Map map);
	

	
	/**
	 * 查询关注客户信息
	 * @param map
	 * @param startRows
	 * @param rows
	 * @return
	 */
	public List<APP_KH> getGzCustomers(Map<String, Object> map, Integer startRows,
			Integer rows);
	
	/**
	 * 查询关注客户的账户信息
	 * @param map
	 * @return
	 */
	public List<APP_KH> getGzZhInfo(Map<String, Object> map);
	/**
	 * 修改关注客户的账户信息
	 * @param map
	 */
	public void updateGzzhxx(Map map);
	
	
}
