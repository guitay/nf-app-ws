package com.nf.app.service.rwzx;

import java.util.List;

import com.nf.app.bean.rwzx.Rwxq;

public interface RwzxService {
	
	public void insertTask(Rwxq rw);
	
	public void deleteTaskByJldh(Rwxq rw);
	
	public List<Rwxq> queryTaskByPara(Rwxq rw,Integer row,Integer page);
	
	public void updateTaskByPara(Rwxq rw);
	
}
