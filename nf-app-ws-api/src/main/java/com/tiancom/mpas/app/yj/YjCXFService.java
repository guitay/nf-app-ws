package com.tiancom.mpas.app.yj;

import java.util.List;

public interface YjCXFService {

	/*
	 * 查询当前登录行员的所有指标 wzj
	 */
	public List<Zbxq> loadGrYj(int tjrq, int khdxdh, String ywlb, int khzq, int startRow, int pageSize, String dbSchema);

	/*
	 * 查询个人业绩某条指标的详情 wzj
	 */
	public Zbxq loadGrFixedBlock(int khzq, int khzbdh,  int tjrq, int khdxdh, String dbSchema);

	/*
	 * 获取指标的历史详情 wzj
	 */
	public Zbxq loadGrChangingBlock( int khdxdh, int tjrq, int khzq, int khzbdh, String dbSchema);

	public List<Zbxq> loadJgYj(int khzq, int khdxdh, int tjrq, String ywlb, int startRow, int pageSize, String dbSchema);

	public Zbxq loadJgFixedBlock( int khdxdh, int tjrq, int khzq, int khzbdh, String dbSchema);

	public Zbxq loadJgChangingBlock( int khdxdh, int tjrq, int khzq, int khzbdh, String dbSchema);

	public List<Zbxq> loadQhYj(int khzq, int khdxdh, int tjrq, String ywlb, int startRow, int pageSize, String dbSchema);

	public List<Zbxq> loadJgxqByZb(int khzbdh, int khzq, int tjrq, String dbSchema);

	public Zbxq loadJgFixedBlockInQh( int tjrq, int khzq, int khzbdh, String jgdh, String dbSchema);

	public Zbxq loadJgChangingBlockInQh( int tjrq, int khzq, int khzbdh, String jgdh, String dbSchema);

}
