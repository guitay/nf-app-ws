package com.nf.app.grsz;

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
import com.tiancom.mpas.mq.producer.MQProducer;
import com.tiancom.pas.common.framework.ibatis.IBaseDAO;



/**
 * 我
 * @author tancr
 *
 */
@SuppressWarnings("unchecked")
@Component
public class GrszServiceImpl implements GrszService {
	@Autowired
	private IBaseDAO ibaseDAO;
	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}
	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	
	@Autowired
	private MQProducer mq;
	
	//-------------------------new-------------------------
	
	//加载消息列表
	public List<Xxts> selectXxList(Xxts xx){
		Map map = new HashMap();
		if(null!=xx.getDb()&&!"".equals(xx.getDb())){
			map.put("db", xx.getDb());
		}
		if(null!=xx.getBh()&&!"".equals(xx.getBh())){
			map.put("bh", xx.getBh());
		}
		if(null!=xx.getOtsnr()&&!"".equals(xx.getOtsnr())){
			map.put("otsnr", xx.getOtsnr());
		}
//		if(null!=xx.getPage()&&!"".equals(xx.getPage())){
//			map.put("page", xx.getPage());
//		}
//		if(null!=xx.getRow()&&!"".equals(xx.getRow())){
//			map.put("row", xx.getRow());
//		}else{
//			map.put("row", 1);
//			map.put("page", 999);
//		}
		if(null!=xx.getTsnr()&&!"".equals(xx.getTsnr())){
			map.put("tsnr", xx.getTsnr());
		}
		if(null!=xx.getXxlj()&&!"".equals(xx.getXxlj())){
			map.put("xxlj", xx.getXxlj());
		}
		if(null!=xx.getXxlx()&&!"".equals(xx.getXxlx())){
			map.put("xxlx", xx.getXxlx());
		}
		if(null!=xx.getXxsj()&&!"".equals(xx.getXxsj())){
			map.put("xxsj", xx.getXxsj());
		}
		if(null!=xx.getZt()&&!"".equals(xx.getZt())){
			map.put("zt", xx.getZt());
		}
		map.put("tshy", xx.getTshy());
		List<Xxts> ts = new ArrayList<Xxts>();
		System.out.println("=========CXSJ"+xx.getCxsl());
		if(null!=xx.getCxsl()&&!"".equals(xx.getCxsl())){
			List<Xxts> ts2 = ibaseDAO.selectListByPara("APP_Grsz_selectXxList", map);
			Xxts xx2 = new Xxts();
			xx2.setCxsl(ts2.size()+"");
			ts.add(xx2);
		}else{
			ts = ibaseDAO.selectPageInfoByPara("APP_Grsz_selectXxList", map, xx.getRow(), xx.getPage());
		}
		
		return ts;
	}
	
	//添加推送消息
	public void insertXxts(Xxts xx){
		ibaseDAO.insert("APP_Grsz_insertXxts", xx);
		//推送友盟
		//2017-06-27-13.01.03.0
		if(xx.getXxlx().equals("4")){
			tsym(xx);
		}
		if(xx.getXxlx().equals("1")){
		try {
			
			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH.mm");
			DateFormat sdf2 = new SimpleDateFormat("yyyMMddHHmm"); 
			Date date = new Date();
			Long time = date.getTime()+(long)2*60*60*1000;
			String tmp =xx.getXxsj().substring(0,16);
			tmp = tmp+"";
			//201706271342
			String xxsj = sdf2.format(sdf.parse(xx.getXxsj().substring(0,16)));
			String xtsj = sdf2.format(time);
			if(null!=xx.getXxsj()||!"".equals(xx.getXxsj())||Long.valueOf(xxsj).longValue()<Long.valueOf(xtsj).longValue()){
				tsym(xx);
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		}
	}
	
	//修改消息状态
	public void updateXxzt(Xxts xx) {
		ibaseDAO.updateByPrimaryKey("APP_Grsz_updateXxzt", xx);
		//推送友盟
		//2017-06-27-13.01.03.0
		try {
			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH.mm");
			DateFormat sdf2 = new SimpleDateFormat("yyyMMddHHmm"); 
			Date date = new Date();
			Long time = date.getTime()+(long)2*60*60*1000;
			String tmp = xx.getXxsj().substring(0,16);
			tmp = tmp+"";
			//201706271342
			String xxsj = sdf2.format(sdf.parse(xx.getXxsj().substring(0,16)));
			String xtsj = sdf2.format(time);
			
			if(null!=xx.getXxsj()||!"".equals(xx.getXxsj())||Long.valueOf(xxsj).longValue()<Long.valueOf(xtsj).longValue()){
				tsym(xx);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	//加载提醒设置
	public List<Txsz> selectTxsz(Txsz sz){
		return ibaseDAO.selectListByPara("APP_Grsz_selectTxsz", sz);
	}
	
	//修改提醒设置
	public void updateTxsz(Txsz sz){
		ibaseDAO.updateByPrimaryKey("APP_Grsz_updateTxsz", sz);
	}
	
	//-------------------------new-------------------------
	public void insertYhfk(Map map) {
		ibaseDAO.insert("APP_Grsz_insertYhfk", map);
		
	}

	public List<PfHyList> getZxpf(Map<String, Object> map,int beginRow,int pageSize) {
		return ibaseDAO.selectPageInfoByPara("APP_Grsz_getZxpf", map, beginRow, pageSize);
	}
	
	public List<PfInfo> getPfInfo(Map map) {
		return ibaseDAO.selectInfoByPara("APP_Grsz_getPfInfo", map);
	}
	
	public List<FaInfo> getPfSelect(Map map) {
		return ibaseDAO.selectInfoByPara("APP_Grsz_getPfSelect", map);
	}
	
	public void updatePfInfo(Map map) {
		ibaseDAO.updateByPrimaryKey("APP_Grsz_updatePfInfo", map);
		ibaseDAO.updateByPrimaryKey("update_znbs_zxpfz_df",map);
		ibaseDAO.updateByPrimaryKey("update_znbs_zxpffa_pfzt",map);
	}
	public void updatePy(Map map) {
		ibaseDAO.updateByPrimaryKey("update_znbs_zxpffa_py", map);
	}
	
	private void tsym(Xxts xx){
		//推送给友盟
		MPasMessage msg = new MPasMessage();
		msg.setType("customizedcast");
		msg.setAlert(xx.getTsnr());
		msg.setAlias(xx.getDb()+"-"+xx.getHydh());
		msg.setAliasType("MPAS-ID");
		msg.setCzxt(xx.getCzxt());
		//msg.setStartTime("");
		msg.setTag("");
		if(xx.getXxlx().equals("1")){
			msg.setJmsType("MPAS-PUSH-RWXX");
		}
		if(xx.getXxlx().equals("4")){
			msg.setJmsType("MPAS-PUSH-KHSQ");
		}
		String key = xx.getDb() + xx.getHydh() + "" + xx.getXxlx() + String.valueOf(System.currentTimeMillis());// 银行标识+行员类别+消息类型+systemtime
		msg.setMsgID(key);
						 
		Map params = new HashMap();
		params.put("xxlx",  xx.getXxlx());
		//params.put("key", "value");
		msg.setParams(params);
		mq.send(msg);
	}
}
