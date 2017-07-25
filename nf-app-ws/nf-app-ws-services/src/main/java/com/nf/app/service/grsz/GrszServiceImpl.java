package com.nf.app.service.grsz;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.activemq.bean.MPasMessage;
import com.nf.app.bean.grsz.FaInfo;
import com.nf.app.bean.grsz.PfHyList;
import com.nf.app.bean.grsz.PfInfo;
import com.nf.app.bean.grsz.Txsz;
import com.nf.app.bean.grsz.Xxts;
import com.nf.app.dao.grsz.GrszDao;



/**
 * 我
 * @author tancr
 *
 */
@SuppressWarnings("unchecked")
@Component
public class GrszServiceImpl implements GrszService {
	@Autowired
	private GrszDao dao;
	
//	
//	@Autowired
//	private MQProducer mq;
	
	//-------------------------new-------------------------
	
	//加载消息列表
	public List<Xxts> selectXxList(Xxts xx){
		return dao.selectXxList(xx);
	}
	
	//添加推送消息
	public void insertXxts(Xxts xx){
		dao.insertXxts(xx);
	}
	
	//修改消息状态
	public void updateXxzt(Xxts xx) {
		dao.updateXxzt(xx);
	}
	
	//加载提醒设置
	public List<Txsz> selectTxsz(Txsz sz){
		return dao.selectTxsz(sz);
	}
	
	//修改提醒设置
	public void updateTxsz(Txsz sz){
		dao.updateTxsz(sz);
	}
	
	//-------------------------new-------------------------
	public void insertYhfk(Map map) {
		dao.insertYhfk(map);
	}

	public List<PfHyList> getZxpf(Map<String, Object> map,int beginRow,int pageSize) {
		return dao.getZxpf(map, beginRow, pageSize);
	}
	
	public List<PfInfo> getPfInfo(Map map) {
		return dao.getPfInfo(map);
	}
	
	public List<FaInfo> getPfSelect(Map map) {
		return dao.getPfSelect(map);
	}
	
	public void updatePfInfo(Map map) {
		dao.updatePfInfo(map);
	}
	public void updatePy(Map map) {
		dao.updatePy(map);
	}
}
