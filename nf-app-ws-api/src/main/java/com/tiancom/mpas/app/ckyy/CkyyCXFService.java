package com.tiancom.mpas.app.ckyy;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface CkyyCXFService {

	/*
	 * 查询预约类型 wzj
	 */
	public List<Map> queryYylx(Ckyy ckyy);

	/*
	 * 查询所有预约 wzj
	 */
	public List<Ckyy> queryYy(int khdxdh, String yylx, String dbSchema);

	/*
	 * 查看预约的详情 wzj
	 */
	public Ckyy loadYyBylsh( double lsh, int khdxdh, String dbSchame);

	public String saveYy(long lsh, int khdxdh, int jgkhdxdh, String jgmc, int khlx, String zjlb, String zjhm,
			BigDecimal yjje, int blrq, int yyqsrq, String khmc, int yyjsrq, String bz, String ppbz, String yylx, String dbSchema);

	public void deleteYyByLsh(int khdxdh, long lsh, String dbSchema);

	public List<Map> loadZzlb(String dbSchema);

}
