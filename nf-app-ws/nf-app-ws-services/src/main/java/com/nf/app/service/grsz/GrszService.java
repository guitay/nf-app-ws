package com.nf.app.service.grsz;

import java.util.List;
import java.util.Map;

import com.nf.app.bean.grsz.FaInfo;
import com.nf.app.bean.grsz.PfHyList;
import com.nf.app.bean.grsz.PfInfo;
import com.nf.app.bean.grsz.Txsz;
import com.nf.app.bean.grsz.Xxts;


/**
 * 我Service
 * @author tancr
 *
 */
@SuppressWarnings("unchecked")
public interface GrszService {
  
	final static String KEY = "Grsz.GrszService";
	
	
	
	/**
	 * 更新评语
	 * @param xx 
	 */
	public void updatePy(Map map);

	public List<Xxts> selectXxList(Xxts xx);

	public List<Txsz> selectTxsz(Txsz sz);

	public void updateTxsz(Txsz sz);
	
	public List<PfHyList> getZxpf(Map<String, Object> map,int beginRow,int pageSize);
	
	public List<PfInfo> getPfInfo(Map map);
	
	public List<FaInfo> getPfSelect(Map map);
	
	public void updatePfInfo(Map map);
	
	public void insertYhfk(Map map);

	public void insertXxts(Xxts ts);
	
	//修改消息状态
	public void updateXxzt(Xxts xx);
}
