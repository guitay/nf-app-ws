package com.nf.app.dao.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.nf.app.bean.pojo.Dmms;
import com.nf.app.bean.pojo.Hylb;
import com.nf.app.bean.pojo.Jg;
import com.nf.app.bean.pojo.MPAS_HY;
import com.nf.app.bean.pojo.M_YH;
import com.nf.app.bean.pojo.Menu;
import com.nf.app.bean.pojo.XTCS;

/**
 * 登陆处理接口实现类
 * 
 * @author luoxt
 *
 */
@Component
public class SystemDao {
	

	private final SqlSession ibaseDAO;

	public SystemDao(SqlSession ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	/*-------------以下为MPAS云端登陆部分------------------------- */
	public M_YH selectMpasYH(String dlmc, String dlmm) {
		Map map = new HashMap();
		map.put("dlmc", dlmc);
		map.put("dlmm", dlmm);
		return (M_YH) ibaseDAO.selectOne("mpas_selectMpasYH", map);
	}

	public XTCS selectXtcs(String csmc, String yhbs) {
		Map map = new HashMap();
		map.put("yhbs", yhbs);
		map.put("csmc", csmc);
		XTCS xtcs = (XTCS) ibaseDAO.selectOne("mpas_selectXtcs", map);
		return xtcs;
	}

	public void updateScdl(String yhid) {
		Map map = new HashMap();
		map.put("yhid", yhid);
		ibaseDAO.update("mpas_updateSfscdl", map);

	}

	public MPAS_HY selectByDlmc(String dlmc) {
		return (MPAS_HY) ibaseDAO.selectOne("mpas_selectByDlmc", dlmc);

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
				userObj= ibaseDAO.selectOne("mpaswebapp_selectMpasHYByDlmc", map);
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
		List<Hylb> list=ibaseDAO.selectList("mpasapp_selectHylb", map);
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
		XTCS xtcs = (XTCS) ibaseDAO.selectOne("mpaswebapp_selectMpasXtcs", map);
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
		List<Dmms> list = ibaseDAO.selectList("mpaswebapp_selectMpasDmms", map);
		return list;

	}

	public List<Menu> selectHydycd(Map map) {

		return ibaseDAO.selectList("mpasapp_selectHydycd", map);
	}

	/**
	 * 查询最新公告
	 */
	public String selectZxgg(Map map) {
		map.put("csmc", "SYGG");
		return (String)ibaseDAO.selectOne("mpaswebapp_selectZxgg", map);
	}



	/**
	 * 查询任务
	 */
	public List selectRw(Map map) {
		return ibaseDAO.selectList("mpaswebapp_selectRw", map);
	}

	/**
	 * 查询个人菜单
	 */
	public List<Menu> selectCd(Map map) {
		return ibaseDAO.selectList("mpaswebapp_selectCd", map);
	}

	// 以下是机构相关/////////////////////////

	public Jg getRootJg(String dbSchema) {
		Map map=new HashMap();
		map.put("db", dbSchema);
		Jg jg = (Jg) ibaseDAO.selectOne("jgTree_selectRootJg", map);

		return jg;
	}

	public Jg getJgByKhdxdh(Integer jgkhdxdh, String dbSchema) {
		Map map = new HashMap();
		map.put("khdxdh", jgkhdxdh);
		map.put("db", dbSchema);
		Jg jg = (Jg) ibaseDAO.selectOne("jgTree_selectJgByKhdxdh", map);

		return jg;
	}

	public Jg getParentJg(Integer jgkhdxdh, String dbSchema) {
		Map map = new HashMap();
		map.put("khdxdh", jgkhdxdh);
		map.put("db", dbSchema);

		Object parentObj = ibaseDAO.selectOne("jgTree_selectParentJg", map);
		Jg parent = parentObj == null ? null : (Jg) parentObj;
		
		return parent;
	}
	

	public List<Jg> getJgChildren(Integer jgkhdxdh, String dbSchema) {
		Map map = new HashMap();
		map.put("jgkhdxdh", jgkhdxdh);
		map.put("db", dbSchema);
		
		Object childrenObj = ibaseDAO.selectList("jgTree_selectJgChildren", map);
		List<Jg> jgChildren = childrenObj!=null? (List<Jg>)childrenObj:null;
		return jgChildren;
	}


}
