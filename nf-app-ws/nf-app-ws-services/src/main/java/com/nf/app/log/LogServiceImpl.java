package com.nf.app.log;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.pojo.M_CSBDmms;
import com.nf.app.bean.pojo.M_KHB;
import com.nf.app.bean.pojo.M_RZB;
import com.tiancom.pas.common.framework.ibatis.IBaseDAO;
@SuppressWarnings("unchecked")
@Component
public class LogServiceImpl implements LogService {
	@Autowired
	private IBaseDAO ibaseDAO;

	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}

	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}

	public void insertLog(M_RZB log) {
		ibaseDAO.insert("MPAS_LOG_insertLog", log);
	}

	
	public List<M_RZB> selectKhrzByPara(Map map, int beginRow, int pageSize) {
		String sqlKey = "mpas_selectKhrzByPara";
		map.put("beginRow", beginRow);//分页时，传递起始行
		return ibaseDAO.selectPageInfoByPara(sqlKey, map, beginRow, pageSize);
	}

	public Integer selectCountRows(Map map) {
		String sqlKey = "mpas_selectCountKhrzByPara";
		return ibaseDAO.selectCountRows(sqlKey, map);
	}
	
	public List<M_KHB> selectYhbs(){
		String sqlKey="mpas_selectAllYhbs";
		return ibaseDAO.selectInfoByPara(sqlKey,null);
	}
	
	public List<M_CSBDmms> selectCSBDmms(Map map){
		String sqlKey="mpas_selectDMMSByDmmc";
		return ibaseDAO.selectInfoByPara(sqlKey,map);
	}

}
