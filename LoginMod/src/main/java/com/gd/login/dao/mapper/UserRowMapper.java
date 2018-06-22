package com.gd.login.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gd.model.user.UserBasic;

public class UserRowMapper implements RowMapper<UserBasic> {

	public UserBasic mapRow(ResultSet row, int rowNum) throws SQLException {
		UserBasic userBasic = new UserBasic();
		userBasic.setId(row.getInt("id"));
		return userBasic;
	}

}
