package com.nf.app.dao.ckyy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.nf.app.bean.ckyy.Ckyy;

@Component
public class CkyyDao  {
	

	private final SqlSession sqlSession;

	public CkyyDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public Map<String, String> delete(Map map) {
		Map ret = new HashMap();
		sqlSession.delete("ckyy_deleteByPk", map);
		
		return ret;
	}
	public Ckyy load(Map map) {
		Ckyy yy = (Ckyy)sqlSession.selectOne("ckyy_loadByPk", map);
		return yy;
	}
	public List<Ckyy> query(Map map) {
		List<Ckyy> yyList = sqlSession.selectList("ckyy_queryList", map);
		
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
			HashMap hm=(HashMap) sqlSession.selectOne("ckyy_chcekCkBykhh", map);
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
					sqlSession.insert("ckyy_saveCKYY_synPasSide", yy);
					mess="提交成功!";
				}
					
				
			}else{
				sqlSession.insert("ckyy_updateByKey", yy);
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
		Integer ps = (Integer)sqlSession.selectOne("ckyy_checkPasAndMpasExist", yy);
		
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
		List<Map> lst = sqlSession.selectList("ckyy_loadKhlx", null);
		return lst;
	}
	public List<Map> loadZjlb(String dbSchema){
		Map map = new HashMap();
		map.put("db", dbSchema);
		List<Map> lst = sqlSession.selectList("ckyy_loadZjlb", map);
		return lst;
	}
	
	public void SynchronizePasAndMPas(Ckyy yy, int type) {
		// TODO Auto-generated method stub
		
	}
	public Integer loadyysxts() {
		Object ts = sqlSession.selectOne("ckyy_loadyysxts", null);
		return ts==null ? 0 : (Integer)ts;
	}
	
	public List<Map> queryYylx(String dbSchema) {
		Map map = new HashMap();
		map.put("db", dbSchema);
		//查询预约类型
		return sqlSession.selectList("ckyy_queryYylx", map);
	}
}
