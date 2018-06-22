package com.gd.login.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AbstractDaoImpl {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	protected List selectQuery(String query, RowMapper rm) {
		return jdbcTemplate.query(query, rm);
	}

}
