package com.example.dao.impl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.dao.CstmrDao;
import com.example.model.Cstmr;

@Repository
public class CstmrDaoImpl extends JdbcDaoSupport implements CstmrDao {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public void insert(Cstmr cus) {
		String sql = "INSERT INTO cstmr " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[] { cus.getCustId(), cus.getName(), cus.getAge() });
	}

}
