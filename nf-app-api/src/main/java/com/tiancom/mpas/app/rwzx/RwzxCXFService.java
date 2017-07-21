package com.tiancom.mpas.app.rwzx;

import java.util.List;

import com.tiancom.mpas.pojo.QueryCondition;

public interface RwzxCXFService {

	public List<Rwxq> queryRwByPara(QueryCondition<Rwxq> rw);

	public void insertRw(QueryCondition<Rwxq> rw);

	public void deleteTaskByPara(QueryCondition<Rwxq> rw);

}
