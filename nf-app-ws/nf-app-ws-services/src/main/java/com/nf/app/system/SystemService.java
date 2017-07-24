package com.nf.app.system;

import java.util.List;
import java.util.Map;

import com.nf.app.bean.pojo.Dmms;
import com.nf.app.bean.pojo.Hylb;
import com.nf.app.bean.pojo.Jg;
import com.nf.app.bean.pojo.MPAS_HY;
import com.nf.app.bean.pojo.M_YH;
import com.nf.app.bean.pojo.Menu;
import com.nf.app.bean.pojo.XTCS;



/**
 * 登陆处理接口
 * @author 
 *
 */
public interface SystemService {
  
	final static String KEY = "mpas.LoginService";

	/*-------------以下为MPAS云端登陆部分------------------------- */
	/**
	 * 根据登陆名称查询用户
	 * 
	 * @param dlmc
	 * @return
	 */
	public M_YH selectMpasYH(String dlmc,String dlmm);
	
	
	public XTCS selectXtcs(String csmc,String yhbs);
	
	public void updateScdl(String yhid);
	
	/**
	 * 根据登陆名称查询用户
	 * 
	 * @param dlmc
	 * @return
	 */
	public MPAS_HY selectByDlmc(String dlmc);
	
	
	/*-------------以下为MPASWebApp登陆部分------------------------- */
	
	/** 根据登陆名称查询行员
	 * @return
	 */
	public MPAS_HY selectMpasHYByDlmc(String dlmc,String db);
	
	/**
	 * 根据登陆名称查询类别
	 * @param map
	 * @return
	 */
	public List<Hylb> selectHylb(Map map);
	
	/** 读取PAS系统参数，例如系统状态判断是否在跑数
	 * @param dbSchema TODO
	 * @return
	 */
	public XTCS selectMpasXtcs(String csmc, String dbSchema);	
	
	/**
	 * 读取代码描述
	 * @param dbSchema TODO
	 * @return
	 */
	public List<Dmms> selectMpasDmms(String dmmc, String dbSchema);	
	
	
	
	public List<Menu> selectHydycd(Map map);
	
	/**
	 * 根据登录行员查询最新公告
	 * @return
	 */
	public String selectZxgg(Map map);
	/**
	 * 根据登录行员查询任务
	 * @return
	 */
	public List selectRw(Map map);
	/**
	 * 查询个人菜单
	 */
	public List<Menu> selectCd(Map map);
	
	
	///以下是机构相关////////
	public Jg getRootJg(String dbSchema) ;

	public Jg getJgByKhdxdh(Integer jgkhdxdh, String dbSchema);

	public Jg getParentJg(Integer jgkhdxdh, String dbSchema);
	
	public List<Jg> getJgChildren(Integer jgkhdxdh, String dbSchema);
	
}
