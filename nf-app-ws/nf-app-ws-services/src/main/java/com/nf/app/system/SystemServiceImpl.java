package com.nf.app.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nf.pojo.Dmms;
import com.nf.pojo.Hylb;
import com.nf.pojo.Jg;
import com.nf.pojo.MPAS_HY;
import com.nf.pojo.M_YH;
import com.nf.pojo.Menu;
import com.nf.pojo.XTCS;
import com.tiancom.mpas.config.MPasConfig;
import com.tiancom.pas.common.framework.ibatis.IBaseDAO;

/**
 * 登陆处理接口实现类
 * 
 * @author luoxt
 *
 */
@SuppressWarnings("unchecked")
@Component
@Qualifier("SystemServiceBean")
public class SystemServiceImpl implements SystemService {
	
	private static Logger log = LoggerFactory.getLogger(SystemServiceImpl.class);

	@Autowired
	private IBaseDAO ibaseDAO;
	

	@Autowired
	private MPasConfig mpasConfig;

	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}

	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}

	public MPasConfig getMpasConfig() {
		return mpasConfig;
	}

	public void setMpasConfig(MPasConfig mpasConfig) {
		this.mpasConfig = mpasConfig;
	}

	/*-------------以下为MPAS云端登陆部分------------------------- */
	public M_YH selectMpasYH(String dlmc, String dlmm) {
		Map map = new HashMap();
		map.put("dlmc", dlmc);
		map.put("dlmm", dlmm);
		return (M_YH) ibaseDAO.selectByPrimaryKey("mpas_selectMpasYH", map);
	}

	public XTCS selectXtcs(String csmc, String yhbs) {
		Map map = new HashMap();
		map.put("yhbs", yhbs);
		map.put("csmc", csmc);
		XTCS xtcs = (XTCS) ibaseDAO.selectByPrimaryKey("mpas_selectXtcs", map);
		return xtcs;
	}

	public void updateScdl(String yhid) {
		Map map = new HashMap();
		map.put("yhid", yhid);
		ibaseDAO.updateByPrimaryKey("mpas_updateSfscdl", map);

	}

	public MPAS_HY selectByDlmc(String dlmc) {
		return (MPAS_HY) ibaseDAO.selectByPrimaryKey("mpas_selectByDlmc", dlmc);

	}
	/*-------------以下为MPASWebApp登陆部分------------------------- */

	/**
	 * 根据登陆名称查询行员
	 * 
	 * @param dlmc
	 * @param dlmm
	 * @return
	 */
	public MPAS_HY selectMpasHYByDlmc(String dlmc,String db) {
		Map map = new HashMap();
		map.put("dlmc", dlmc);
		map.put("db", db);
//		boolean mycatEnable = Boolean.valueOf(mpasConfig.getMYCAT_ENABLE()).booleanValue();
//		String[] dbNodes = mpasConfig.getMYCAT_DATANODE().split(",");
		MPAS_HY hy = null;
//		for(String db:dbNodes){
//			log.info("db--------------------------->"+db);
//			if(mycatEnable){
//				map.put("db", db);
//			}
			Object userObj = null;
			try{
				userObj= ibaseDAO.selectByPrimaryKey("mpaswebapp_selectMpasHYByDlmc", map);
			}catch(Exception e){
				e.printStackTrace();
			}
			if(null!=userObj){
				hy = (MPAS_HY)userObj;
				hy.setDb(db);
				return hy;
			}
//		}
		return null;
	}

	/**
	 * 根据登陆名称查询类别
	 */
	public List<Hylb> selectHylb(Map map) {
		List<Hylb> list=ibaseDAO.selectListByPara("mpasapp_selectHylb", map);
		log.info("------select hylb-----------");
		return list;
	}

	/**
	 * 读取PAS系统参数，例如系统状态判断是否在跑数
	 * 
	 * @return
	 */
	public XTCS selectMpasXtcs(String csmc, String dbSchema) {
		Map map = new HashMap();
		map.put("csmc", csmc);
		map.put("db", dbSchema);
		XTCS xtcs = (XTCS) ibaseDAO.selectByPrimaryKey("mpaswebapp_selectMpasXtcs", map);
		return xtcs;
	}

	/**
	 * 读取PAS系统参数，例如系统状态判断是否在跑数
	 * 
	 * @return
	 */
	public List<Dmms> selectMpasDmms(String dmmc, String dbSchema) {
		Map map = new HashMap();
		map.put("dmmc", dmmc);
		map.put("db", dbSchema);
		List<Dmms> list = (List<Dmms>) ibaseDAO.selectListByPara("mpaswebapp_selectMpasDmms", map);
		return list;

	}

	public List<Menu> selectHydycd(Map map) {

		return ibaseDAO.selectListByPara("mpasapp_selectHydycd", map);
	}

	/**
	 * 查询最新公告
	 */
	public String selectZxgg(Map map) {
		map.put("csmc", "SYGG");
		return (String)ibaseDAO.selectByPrimaryKey("mpaswebapp_selectZxgg", map);
	}



	/**
	 * 查询任务
	 */
	public List selectRw(Map map) {
		return ibaseDAO.selectListByPara("mpaswebapp_selectRw", map);
	}

	/**
	 * 查询个人菜单
	 */
	public List<Menu> selectCd(Map map) {
		return ibaseDAO.selectListByPara("mpaswebapp_selectCd", map);
	}

	// 以下是机构相关/////////////////////////

	public Jg getRootJg(String dbSchema) {
		Map map=new HashMap();
		map.put("db", dbSchema);
		Jg jg = (Jg) ibaseDAO.selectByPrimaryKey("jgTree_selectRootJg", map);

		return jg;
	}

	public Jg getJgByKhdxdh(Integer jgkhdxdh, String dbSchema) {
		Map map = new HashMap();
		map.put("khdxdh", jgkhdxdh);
		map.put("db", dbSchema);
		Jg jg = (Jg) ibaseDAO.selectByPrimaryKey("jgTree_selectJgByKhdxdh", map);

		return jg;
	}

	public Jg getParentJg(Integer jgkhdxdh, String dbSchema) {
		Map map = new HashMap();
		map.put("khdxdh", jgkhdxdh);
		map.put("db", dbSchema);

		Object parentObj = ibaseDAO.selectByPrimaryKey("jgTree_selectParentJg", map);
		Jg parent = parentObj == null ? null : (Jg) parentObj;
		
		return parent;
	}
	

	public List<Jg> getJgChildren(Integer jgkhdxdh, String dbSchema) {
		Map map = new HashMap();
		map.put("jgkhdxdh", jgkhdxdh);
		map.put("db", dbSchema);
		
		Object childrenObj = ibaseDAO.selectListByPara("jgTree_selectJgChildren", map);
		List<Jg> jgChildren = childrenObj!=null? (List<Jg>)childrenObj:null;
		return jgChildren;
	}


}
