package com.gd.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gd.login.dao.LoginDao;
import com.gd.model.user.UserBasic;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDao loginDao;

	public UserBasic validateUserByLoginId(String loginId) {
		List<UserBasic> userList = loginDao.getUsersById(loginId);
		userList.forEach(e -> System.out.println(e.getId()));
		return userList.get(0);
	}

}
