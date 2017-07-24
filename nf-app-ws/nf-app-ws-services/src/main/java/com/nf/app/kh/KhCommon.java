package com.nf.app.kh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nf.app.bean.pojo.APP_KH;

public class KhCommon {

	/**
	 * 根据客户号获取账户信息
	 * @param dgkhList
	 */
	public static void getAppZhInfoByKhh(List<APP_KH> khList,KhService service,Map map) {
		List<APP_KH> zhInfos=service.getZhInfo(map);//查出所有的账户数据
		Map<String,List<APP_KH>> khs=new HashMap<String, List<APP_KH>>();//按客户号保存对应的多条账户信息
		for (int i = 0; i < zhInfos.size(); i++) {
			APP_KH zhInfo=zhInfos.get(i);
			String khh=zhInfo.getKhh();//该账户信息的客户号
			if(khs.containsKey(khh)){
				List<APP_KH> zhMap=khs.get(khh);
				zhMap.add(zhInfo);
			}else{
				List<APP_KH> zhMap=new ArrayList<APP_KH>();
				zhMap.add(zhInfo);
				khs.put(khh, zhMap);
			}
			
		}
		for (int i = 0; i < khList.size(); i++) {
			APP_KH cus=khList.get(i);
			cus.setZhList(khs.get(cus.getKhh()));
		}
	}
	
	/**
	 * 获取关注客户的账户信息
	 * @param khList
	 * @param service
	 * @param map
	 */
	public static void getAppGzZhInfoByKhh(List<APP_KH> khList, KhService service,
			Map<String, Object> map) {
		List<APP_KH> zhInfos=service.getGzZhInfo(map);
		Map<String,List<APP_KH>> khs=new HashMap<String, List<APP_KH>>();//按客户号保存对应的多条账户信息
		for (int i = 0; i < zhInfos.size(); i++) {
			APP_KH zhInfoMap=zhInfos.get(i);
			String khh=zhInfoMap.getKhh().toString();//该账户信息的客户号
			if(khs.containsKey(khh)){
				List<APP_KH> zhMap=khs.get(khh);
				zhMap.add(zhInfoMap);
			}else{
				List<APP_KH> zhMap=new ArrayList<APP_KH>();
				zhMap.add(zhInfoMap);
				khs.put(khh, zhMap);
			}
			
		}
		for (int i = 0; i < khList.size(); i++) {
			APP_KH cus=khList.get(i);
			cus.setZhList(khs.get(cus.getKhh().toString()));
		}
	}
	
}
