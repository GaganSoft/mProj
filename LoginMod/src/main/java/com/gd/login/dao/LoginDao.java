package com.gd.login.dao;

import java.util.List;

import com.gd.model.user.UserBasic;

public interface LoginDao {
	
	public List<UserBasic> getUsersById(String loginId);
	
}
