package com.nf.app.service.zdwd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.zdwd.Zdwd;
import com.nf.app.dao.zdwd.ZdwdDao;

@Component
public class ZdwdServiceImpl implements ZdwdService {
	@Autowired
	private ZdwdDao dao;
	
	public List<Zdwd> query(String db) {
		return dao.query(db);
	}
	
}
