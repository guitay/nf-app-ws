package com.nf.app.service.jx;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.jx.APP_HF;
import com.nf.app.bean.jx.APP_JXGZ;
import com.nf.app.bean.jx.APP_JXHZ;
import com.nf.app.bean.jx.APP_JXMX;
import com.nf.app.bean.jx.APP_JXZC;
import com.nf.app.bean.jx.APP_KHQK;
import com.nf.app.bean.jx.APP_PL;
import com.nf.app.bean.jx.APP_XTXX;
import com.nf.app.bean.jx.APP_ZAN;
import com.nf.app.dao.jx.JxDao;

/**
 * 绩效
 * @author tancr
 *
 */
@Component
public class JxServiceImpl implements JxService {
	@Autowired
	private JxDao dao;
	
	public APP_JXGZ selectGrjxBykey(Map<String, Object> map) {
		return dao.selectGrjxBykey(map);
	}

	public List<APP_JXGZ> selectJxqsBykey(Map<String, Object> map) {
		return dao.selectJxqsBykey(map);
	}

	public List<APP_JXGZ> selectGrjxmxList(Map<String, Object> map) {
		return dao.selectGrjxmxList(map);
	}
	
	public void deleteGoodHy(Map<String, Object> map) {
		dao.deleteGoodHy(map);
	}

	public void insertGoodHy(Map<String, Object> map) {
		dao.insertGoodHy(map);
	}

	public List getHylbList(Map map) {
		return dao.getHylbList(map);
	}
	
	public APP_ZAN selectGoods(Map<String, Object> map) {
		return dao.selectGoods(map);
	}
	
	public Integer selectCntByZan(Map<String, Object> map){
		return dao.selectCntByZan(map);
	}
	

	
	public List<APP_PL> selectXxplList(Map map){
		return dao.selectXxplList(map);
	}
	public List<APP_HF> selectXxhfList(Map map){
		return dao.selectXxhfList(map);
	}
	
	public void insertXxpl(Map map){
		dao.insertXxpl(map);
	}
	public void insertXxhf(Map map){
		dao.insertXxhf(map);
	}
	
	public void deleteXxpl(Map map){
		dao.deleteXxpl(map);
	}
	public void deleteXxhf(Map map){
		dao.deleteXxhf(map);
	}
	
	public List selectQhjxList(Map map){
		return dao.selectQhjxList(map);
	}
	
	public List selectJgjxList(Map map){
		return dao.selectJgjxList(map);
	}
	
	public List<APP_JXGZ> selectQhjxqsBykey(Map map) {
		return dao.selectQhjxqsBykey(map);
	}
	
	public List<APP_JXGZ> selectQhjxmxBykey(Map map) {
		return dao.selectQhjxmxBykey(map);
	}
	
	public List selectHyqhjxList(Map map){
		return dao.selectHyqhjxList(map);
	}
	
	public void insertXtxx(APP_XTXX xtxx){
		dao.insertXtxx(xtxx);
	}
	
	public void deleteXtxx(APP_XTXX xtxx){
		dao.deleteXtxx(xtxx);
	}
	public List<APP_JXHZ> selectJxbgByKhdxdh(Map map) {
		return dao.selectJxbgByKhdxdh(map);
	}
	
	public List<APP_JXZC> selectJxzcByKhdxdh(Map map) {
		return dao.selectJxzcByKhdxdh(map);
	}
	
	public List<APP_JXMX> selectJxmxByKhdxdh(Map map) {
		return dao.selectJxmxByKhdxdh(map);
	}
	
	public List<APP_KHQK> selectKhqkByKhdxdh(Map map) {
		return dao.selectHyqhjxList(map);
	}
}
