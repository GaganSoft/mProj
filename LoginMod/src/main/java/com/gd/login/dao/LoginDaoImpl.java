package com.gd.login.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.gd.login.dao.mapper.UserRowMapper;
import com.gd.model.user.UserBasic;

@Component
public class LoginDaoImpl extends AbstractDaoImpl implements LoginDao{
	
	@Autowired
	private DbQueries dbQueries;
	
	public List<UserBasic> getUsersById(String loginId) {
		
		return selectQuery(dbQueries.qGetAllUsers(), new UserRowMapper());
	}

}
