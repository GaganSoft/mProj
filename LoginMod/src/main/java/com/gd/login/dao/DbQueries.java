package com.gd.login.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbQueries {
	
	@Value("${user.get.all}")
	private String getAllUsers;
	
	@Value("${user.get.by.loginId}")
	private String getUserBylogin;

	public String qGetAllUsers() {
		return getAllUsers;
	}
	
	public String qGetUserByLogin() {
		return getUserBylogin;
	}

}
