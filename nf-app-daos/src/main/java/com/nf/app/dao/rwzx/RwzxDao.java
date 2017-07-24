package com.nf.app.dao.rwzx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.nf.app.bean.rwzx.Rwxq;
@Component
public class RwzxDao {

	private final SqlSession ibaseDAO;

	public RwzxDao(SqlSession ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	public void insertTask(Rwxq rw) {
		this.ibaseDAO.insert("rwzx_insertTask", rw);		
	}
	
	public void deleteTaskByJldh(Rwxq rw) {
		this.ibaseDAO.delete("rwzx_deleteTaskByJldh", rw);
	}
	
	public List<Rwxq> queryTaskByPara(Rwxq rw,Integer row,Integer page){
		Map map = new HashMap();
		map.put("db", rw.getDb());
		if(null!=rw.getKhdxdh()&&!"".equals(rw.getKhdxdh())){
			map.put("khdxdh", rw.getKhdxdh());
		}
		if(null!=rw.getRwbh()&&!"".equals(rw.getRwbh())){
			map.put("rwbh", rw.getRwbh());
		}
		if(null!=rw.getCzsj()&&!"".equals(rw.getCzsj())){
			map.put("czsj",rw.getCzsj());
		}
		if(null!=rw.getLxdh()&&!"".equals(rw.getLxdh())){
			map.put("lxdh",rw.getLxdh());
		}
		if(null!=rw.getRwdd()&&!"".equals(rw.getRwdd())){
			map.put("rwdd",rw.getRwdd());
		}
		if(null!=rw.getRwnr()&&!"".equals(rw.getRwnr())){
			map.put("rwnr",rw.getRwnr());
		}
		if(null!=rw.getRwsm()&&!"".equals(rw.getRwsm())){
			map.put("rwsm",rw.getRwsm());
		}
		if(null!=rw.getSfwc()&&!"".equals(rw.getSfwc())){
			map.put("sfwc",rw.getSfwc());
		}
		if(null!=rw.getWcsj()&&!"".equals(rw.getWcsj())){
			map.put("wcsj",rw.getWcsj());
		}
		
		if(null!=row){
			return this.ibaseDAO.selectList("rwzx_queryTaskByPara",map, new RowBounds(row, page));
		}else{
			return this.ibaseDAO.selectList("rwzx_queryTaskByPara",map);
		}
		
	}
	
	public void updateTaskByPara(Rwxq rw) {
		 this.ibaseDAO.update("rwzx_updateTaskByPara", rw);
	}
	
}
