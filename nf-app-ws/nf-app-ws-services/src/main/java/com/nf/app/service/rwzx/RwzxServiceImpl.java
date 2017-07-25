package com.nf.app.service.rwzx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.rwzx.Rwxq;
import com.nf.app.dao.rwzx.RwzxDao;
@Component
public class RwzxServiceImpl implements RwzxService{
	@Autowired 
	private RwzxDao dao;
	
	public void insertTask(Rwxq rw) {
		dao.insertTask(rw);
	}
	
	public void deleteTaskByJldh(Rwxq rw) {
		dao.deleteTaskByJldh(rw);
	}
	
	public List<Rwxq> queryTaskByPara(Rwxq rw,Integer row,Integer page){
		return dao.queryTaskByPara(rw, row, page);
	}
	
	public void updateTaskByPara(Rwxq rw) {
		dao.updateTaskByPara(rw);
	}
	
}
