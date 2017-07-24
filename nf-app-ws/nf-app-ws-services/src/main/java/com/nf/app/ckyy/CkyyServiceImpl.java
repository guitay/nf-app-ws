package com.nf.app.ckyy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tiancom.pas.common.framework.ibatis.IBaseDAO;

@Component
public class CkyyServiceImpl implements CkyyService {
	@Autowired
	private IBaseDAO ibaseDAO;
	public IBaseDAO getIbaseDAO() {
		return ibaseDAO;
	}
	public void setIbaseDAO(IBaseDAO ibaseDAO) {
		this.ibaseDAO = ibaseDAO;
	}
	public Map<String, String> delete(Map map) {
		Map ret = new HashMap();
		/*ret.put("Flag", 1);
		ret.put("Msg", "删除成功");
		
		Map map = new HashMap();
		map.put("lsh", lsh);*/
		ibaseDAO.deleteByPrimaryKey("ckyy_deleteByPk", map);
		
		return ret;
	}
	public Ckyy load(Map map) {
		Ckyy yy = (Ckyy)ibaseDAO.selectByPrimaryKey("ckyy_loadByPk", map);
		return yy;
	}
	public List<Ckyy> query(Map map) {
		/*Map map = new HashMap();
		map.put("khdxdh", khdxdh);
		*/
		
		List<Ckyy> yyList = (List<Ckyy>)ibaseDAO.selectListByPara("ckyy_queryList", map);
		
		return yyList;
	}
	public String save(Ckyy yy) {
		String mess="提交成功";
		
		Map map=new HashMap();
		map.put("blrq", yy.getBlrq());
		map.put("jgkhdxdh", yy.getJgkhdxdh());
		map.put("zjhm", yy.getZjhm());
		map.put("db", yy.getDb());
		String fpms="";
		if(yy.getYylx().equals("01")){
			HashMap hm=(HashMap) ibaseDAO.selectByPrimaryKey("ckyy_chcekCkBykhh", map);
			if(hm!=null && null!=hm.get("FPMS")){
				
				fpms=hm.get("FPMS").toString();
				System.out.println(fpms);
				mess="该客户已在"+fpms+"名下，不支持预约！";
				
			}
		
		}
		
		if(null==fpms || "".equals(fpms) ){
			if(yy.getZjhm()!=null && !"".equals(yy.getZjhm())){
				Map<String, String> validateRet = this.validate(yy);
				if(validateRet.get("Flag").equals("0")){
					mess="客户在该预约时间段内已经被预约！";
				}else{
					ibaseDAO.insert("ckyy_saveCKYY_synPasSide", yy);
					mess="提交成功!";
				}
					
				
			}else{
				ibaseDAO.insert("ckyy_updateByKey", yy);
				mess="提交成功!";
			}
		
		}

		return mess;
	}
	public boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
		}
	
	private Map<String,String> validate(Ckyy yy){
		Integer ps = (Integer)ibaseDAO.selectByPrimaryKey("ckyy_checkPasAndMpasExist", yy);
		
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("Flag", new String("1"));
		ret.put("Msg", "");
		
		if(ps.intValue()>0){
			ret.put("Flag", new String("0"));
			ret.put("Msg", "客户在该预约时间段内已经被预约！");
		}
		
		return ret;
	}
	
	public List<Map> loadKhlx(){
		List<Map> lst = (List<Map>)ibaseDAO.selectListByPara("ckyy_loadKhlx", null);
		return lst;
	}
	public List<Map> loadZjlb(String dbSchema){
		Map map = new HashMap();
		map.put("db", dbSchema);
		List<Map> lst = (List<Map>)ibaseDAO.selectListByPara("ckyy_loadZjlb", map);
		return lst;
	}
	
	public void SynchronizePasAndMPas(Ckyy yy, int type) {
		// TODO Auto-generated method stub
		
	}
	public Integer loadyysxts() {
		Object ts = ibaseDAO.selectByPrimaryKey("ckyy_loadyysxts", null);
		return ts==null ? 0 : (Integer)ts;
	}
	
	public List<Map> queryYylx(String dbSchema) {
		Map map = new HashMap();
		map.put("db", dbSchema);
		//查询预约类型
		return ibaseDAO.selectListByPara("ckyy_queryYylx", map);
	}
}
