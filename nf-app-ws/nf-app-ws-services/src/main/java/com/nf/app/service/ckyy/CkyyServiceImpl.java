package com.nf.app.service.ckyy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.ckyy.Ckyy;
import com.nf.app.dao.ckyy.CkyyDao;

@Component
public class CkyyServiceImpl implements CkyyService {
	@Autowired
	private CkyyDao dao;

	public Map<String, String> delete(Map map) {
		Map ret = new HashMap();
		/*
		 * ret.put("Flag", 1); ret.put("Msg", "删除成功");
		 * 
		 * Map map = new HashMap(); map.put("lsh", lsh);
		 */
		// ibaseDAO.deleteByPrimaryKey("ckyy_deleteByPk", map);
		dao.delete(map);

		return ret;
	}

	public Ckyy load(Map map) {
		Ckyy yy = dao.load(map);// (Ckyy)ibaseDAO.selectByPrimaryKey("ckyy_loadByPk", map);

		return yy;
	}

	public List<Ckyy> query(Map map) {
		/*
		 * Map map = new HashMap(); map.put("khdxdh", khdxdh);
		 */

		List<Ckyy> yyList = dao.query(map);// (List<Ckyy>)ibaseDAO.selectListByPara("ckyy_queryList", map);

		return yyList;
	}

	public String save(Ckyy yy) {
		return dao.save(yy);
	}

	public List<Map> loadKhlx() {
		List<Map> lst = dao.loadKhlx();
		return lst;
	}

	public List<Map> loadZjlb(String dbSchema) {
		List<Map> lst = dao.loadZjlb(dbSchema);
		return lst;
	}

	public Integer loadyysxts() {
		return dao.loadyysxts();
	}

	public List<Map> queryYylx(String dbSchema) {
		return dao.queryYylx(dbSchema);
	}

	public void SynchronizePasAndMPas(Ckyy yy, int type) {
		// TODO Auto-generated method stub
		
	}
}
