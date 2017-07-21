
package com.tiancom.mpas.app.grsz;

import java.util.List;

import javax.ws.rs.core.Response;

import com.tiancom.mpas.pojo.QueryCondition;

/**
 * 系统参数CXF接口
 * 
 * @author NongFei
 *
 */
public interface GrszCXFService {


	public List<PfHyList> loadZxpf(QueryCondition<ZxpfCs> condition);

	// 查询方案选项详情

	public List<FaInfo> loadZxpfSelect(String fabh, String xmbh, String dbSchema);

	public Response updatePfInfo(ZxpfPojo zxpf);

	public Response updatePy(ZxpfPojo zxpf);

	public Response saveYjfk(Yhfk fk);
	
	public List<Xxts> selectXxList(Xxts xx);

	public List<Txsz> selectTxsz(Txsz sz);

	public Response updateTxsz(Txsz sz);

}
