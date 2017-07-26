package com.nf.app.service.system;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nf.app.bean.pojo.Dmms;
import com.nf.app.bean.pojo.Hylb;
import com.nf.app.bean.pojo.Jg;
import com.nf.app.bean.pojo.MPAS_HY;
import com.nf.app.bean.pojo.M_YH;
import com.nf.app.bean.pojo.Menu;
import com.nf.app.bean.pojo.XTCS;
import com.nf.app.dao.system.SystemDao;

/**
 * 登陆处理接口实现类
 * 
 * @author luoxt
 *
 */
@Service
public class SystemServiceImpl implements SystemService {
	
	private static Logger log = LoggerFactory.getLogger(SystemServiceImpl.class);

	@Autowired
	private SystemDao dao;
	

	/*-------------以下为MPAS云端登陆部分------------------------- */
	public M_YH selectMpasYH(String dlmc, String dlmm) {
		return dao.selectMpasYH(dlmc, dlmm);
	}

	public XTCS selectXtcs(String csmc, String yhbs) {
		return dao.selectXtcs(csmc, yhbs);
	}

	public void updateScdl(String yhid) {
		dao.updateScdl(yhid);
	}

	public MPAS_HY selectByDlmc(String dlmc) {
		return dao.selectByDlmc(dlmc);
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
		return dao.selectMpasHYByDlmc(dlmc, db);
	}

	/**
	 * 根据登陆名称查询类别
	 */
	public List<Hylb> selectHylb(Map map) {
		return dao.selectHylb(map);
	}

	/**
	 * 读取PAS系统参数，例如系统状态判断是否在跑数
	 * 
	 * @return
	 */
	public XTCS selectMpasXtcs(String csmc, String dbSchema) {
		return dao.selectMpasXtcs(csmc, dbSchema);
	}

	/**
	 * 读取PAS系统参数，例如系统状态判断是否在跑数
	 * 
	 * @return
	 */
	public List<Dmms> selectMpasDmms(String dmmc, String dbSchema) {
		return dao.selectMpasDmms(dmmc, dbSchema);
	}

	public List<Menu> selectHydycd(Map map) {
		return dao.selectHydycd(map);
	}

	/**
	 * 查询最新公告
	 */
	public String selectZxgg(Map map) {
		return dao.selectZxgg(map);
	}



	/**
	 * 查询任务
	 */
	public List selectRw(Map map) {
		return dao.selectRw(map);
	}

	/**
	 * 查询个人菜单
	 */
	public List<Menu> selectCd(Map map) {
		return dao.selectCd(map);
	}

	// 以下是机构相关/////////////////////////

	public Jg getRootJg(String dbSchema) {
		return dao.getRootJg(dbSchema);
	}

	public Jg getJgByKhdxdh(Integer jgkhdxdh, String dbSchema) {
		return dao.getJgByKhdxdh(jgkhdxdh, dbSchema);
	}

	public Jg getParentJg(Integer jgkhdxdh, String dbSchema) {
		return dao.getParentJg(jgkhdxdh, dbSchema);
	}

	public List<Jg> getJgChildren(Integer jgkhdxdh, String dbSchema) {
		return dao.getJgChildren(jgkhdxdh, dbSchema);
	}

}
