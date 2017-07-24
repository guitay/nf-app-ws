package com.nf.app.yj;

import java.util.List;
import java.util.Map;


/**
 * 业绩Service
 * @author zhouyan
 *
 */
@SuppressWarnings("unchecked")
public interface YjService {
  
	final static String KEY = "Yj.YjService";
	/**
	 * 获取个人业绩信息
	 * @param map
	 * @param startRows
	 * @param rows
	 * @return
	 */
	public List<Zbxq> getKhGrzb(Map<String, Object> map, Integer startRows,
			Integer rows);
	/**
	 * 获取机构考核指标
	 * @param map
	 * @param startRows
	 * @param rows
	 * @return
	 */
	public List<Zbxq> getJgKhzb(Map<String, Object> map, Integer startRows,
			Integer rows);
	
	/**
	 * 获取全行考核指标
	 * @param map
	 * @param startRows
	 * @param rows
	 * @return
	 */
	public List<Zbxq> getQhKhzb(Map<String, Object> map, Integer startRows,
			Integer rows);
	
	/**
	 * 根据考核指标获取明细信息
	 * @param map
	 * @return
	 */
	public List<Zbxq> getMxInfoByKhzbdh(Map<String, Object> map);
	
	/**
	 * 获取虚拟行员业绩指标
	 * @param map
	 * @param startRows
	 * @param rows
	 * @return
	 */
	public List<Map> getXnhyyjzb(Map<String, Object> map, Integer startRows,
			Integer rows);
	
	public Zbxq getJgZbInfo(Map map);
	public Zbxq getJgZbInfoInQh(Map map);
	public Map  getPreTjrq(String tjrq);
	public Zbxq getPreJgZbInfo(Map map);
	public Zbxq getGrzbInfo(Map map);
	public Zbxq getPreGrZbInfo(Map map);
	public Zbxq getPreJgZbInfoInQh(Map map);
	
	/*public Zbxq getJglszbByKhdxdh(Map map);
	public Zbxq getJglszbByJgdh(Map map);*/
	
}
