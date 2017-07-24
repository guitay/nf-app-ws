package com.nf.app.jx;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tiancom.pas.common.framework.ibatis.IBaseDAO;

/**
 * 绩效
 * @author tancr
 *
 */
@SuppressWarnings("unchecked")
@Component
public class JxServiceImpl implements JxService {
	@Autowired
	private IBaseDAO ibaseDAO;
	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}
	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	
	public APP_JXGZ selectGrjxBykey(Map<String, Object> map) {
		
		return (APP_JXGZ)ibaseDAO.selectByPrimaryKey("app_jx_selectJxBykey", map);
	}

	public List<APP_JXGZ> selectJxqsBykey(Map<String, Object> map) {
		List <APP_JXGZ> list=ibaseDAO.selectListByPara("app_jx_selectJxmxList", map);
		return list;
	}

	public List<APP_JXGZ> selectGrjxmxList(Map<String, Object> map) {
		List <APP_JXGZ> list=ibaseDAO.selectListByPara("app_jx_selectJxmxBykey", map);
		return list;
	}
	
	public void deleteGoodHy(Map<String, Object> map) {
		 ibaseDAO.deleteByPrimaryKey("app_jx_deleteGoodHy", map);
		
	}

	public void insertGoodHy(Map<String, Object> map) {
		ibaseDAO.insert("app_jx_insertGoodHy", map);
	}

	public List getHylbList(Map map) {
		return ibaseDAO.selectListByPara("app_jx_getHylb", map);
	}
	
	public APP_ZAN selectGoods(Map<String, Object> map) {
		return (APP_ZAN)ibaseDAO.selectByPrimaryKey("app_jx_selectGoods", map);
	}
	
	public Integer selectCntByZan(Map<String, Object> map){
		
		return ibaseDAO.selectCountRows("app_jx_getCntZan", map);
	}
	

	
	public List<APP_PL> selectXxplList(Map map){
		
		return ibaseDAO.selectListByPara("app_jx_selectPlList", map);
		
	}
	public List<APP_HF> selectXxhfList(Map map){
		
		return ibaseDAO.selectListByPara("app_jx_selectHfList", map);
		
	}
	
	public void insertXxpl(Map map){
		ibaseDAO.insert("app_jx_insertXxpl", map);
	}
	public void insertXxhf(Map map){
		ibaseDAO.insert("app_jx_insertXxhf", map);
	}
	
	public void deleteXxpl(Map map){
		ibaseDAO.deleteByPrimaryKey("app_jx_deleteXxpl", map);
	}
	public void deleteXxhf(Map map){
		ibaseDAO.deleteByPrimaryKey("app_jx_deleteXxhf", map);
	}
	
	public List selectQhjxList(Map map){
		return ibaseDAO.selectListByPara("app_jx_selectQhjxphbList", map);
	}
	
	public List selectJgjxList(Map map){
		return ibaseDAO.selectListByPara("app_jx_selectJgjxphbList", map);
	}
	
	public List<APP_JXGZ> selectQhjxqsBykey(Map map) {
		return ibaseDAO.selectListByPara("app_jx_selectQhjxqsList", map);
	}
	
	public List<APP_JXGZ> selectQhjxmxBykey(Map map) {
		return ibaseDAO.selectListByPara("app_jx_selectqhjxmxBykey", map);
	}
	
	public List selectHyqhjxList(Map map){
		return ibaseDAO.selectListByPara("select_jx_sekectHyqhjxphbList", map);
	}
	
	public void insertXtxx(APP_XTXX xtxx){
		ibaseDAO.insert("insert_jx_insertXtxx", xtxx);
	}
	
	public void deleteXtxx(APP_XTXX xtxx){
		ibaseDAO.deleteByPrimaryKey("delete_jx_deleteXtxx", xtxx);
	}
	public List<APP_JXHZ> selectJxbgByKhdxdh(Map map) {
		return ibaseDAO.selectListByPara("app_jx_selectJxhzByKhdxdh", map);
	}
	
	public List<APP_JXZC> selectJxzcByKhdxdh(Map map) {
		return ibaseDAO.selectListByPara("app_jx_selectJxzcByKhdxdh", map);
	}
	
	public List<APP_JXMX> selectJxmxByKhdxdh(Map map) {
		return ibaseDAO.selectListByPara("app_jx_selectJxmxByKhdxdh", map);
	}
	
	public List<APP_KHQK> selectKhqkByKhdxdh(Map map) {
		return ibaseDAO.selectListByPara("app_jx_selectKhqkByKhdxdh", map);
	}
}
