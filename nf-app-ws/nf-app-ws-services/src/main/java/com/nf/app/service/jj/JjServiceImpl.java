package com.nf.app.service.jj;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nf.app.bean.jj.Jj;
import com.nf.app.dao.jj.JjDao;

/**
 * 计价
 * 
 *
 */
@Component
public class JjServiceImpl implements JjService{
	@Autowired
	private JjDao dao;

	public List<Jj> getCustomers(Map<String, Object> map, int beginRow,
			int pageSize) {
		return dao.getCustomers(map, beginRow, pageSize);
	}
}
