package com.nf.app.dao.log;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.nf.app.bean.pojo.M_CSBDmms;
import com.nf.app.bean.pojo.M_KHB;
import com.nf.app.bean.pojo.M_RZB;
@SuppressWarnings("unchecked")
@Component
public class LogDao {

	private final SqlSession ibaseDAO;

	public LogDao(SqlSession ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}

	
	public List<M_RZB> selectKhrzByPara(Map map, int beginRow, int pageSize) {
		String sqlKey = "mpas_selectKhrzByPara";
		map.put("beginRow", beginRow);//分页时，传递起始行
		return ibaseDAO.selectList(sqlKey, map, new RowBounds(beginRow, pageSize));
	}

	public Integer selectCountRows(Map map) {
		String sqlKey = "mpas_selectCountKhrzByPara";
		return ibaseDAO.selectOne(sqlKey, map);
	}
	
	public List<M_KHB> selectYhbs(){
		String sqlKey="mpas_selectAllYhbs";
		return ibaseDAO.selectList(sqlKey,null);
	}
	
	public List<M_CSBDmms> selectCSBDmms(Map map){
		String sqlKey="mpas_selectDMMSByDmmc";
		return ibaseDAO.selectList(sqlKey,map);
	}

}
