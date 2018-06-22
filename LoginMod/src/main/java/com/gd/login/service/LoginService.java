package com.gd.login.service;

import com.gd.model.user.UserBasic;

public interface LoginService {
	
	public UserBasic validateUserByLoginId(String loginId);


}
