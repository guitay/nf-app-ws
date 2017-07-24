package com.nf.app.ckyy;

import java.util.List;
import java.util.Map;


/**
 * 存款预约Service
 * @author NongFei
 *
 */
public interface CkyyService {
  
	final static String KEY = "ckyy.CkyyService";
	
	public List<Ckyy> query(Map map);
	

	public Ckyy load(Map map);
	

	/**
	 * 保存，并返回：	
	 * Map<String,String>={
		<
		Flag=处理标志(1or0),
		Msg=处理信息
		>
		}
	 * @param yy
	 * @return
	 */
	public String save(Ckyy yy);
	

	/**
	 * 删除，并返回：	
	 * Map<String,String>={
		<
		Flag=处理标志(1or0),
		Msg=处理信息
		>
		}
	 * @param yy
	 * @return
	 */
	public Map<String,String> delete(Map map);

	public List<Map> loadKhlx();

	public List<Map> loadZjlb(String dbSchema);
	
	/**
	 * 加载预约天数
	 */
	public Integer loadyysxts();

	/**
	 * 同步Pas端和MPas端数据
	 * @param yy 预约信息
	 * @param type 操作类型：0=insert,1=update,2=delete
	 */
	public void SynchronizePasAndMPas(Ckyy yy,int type);
	public List<Map> queryYylx(String dbSchema);//查询预约类型
	
	
	
}
