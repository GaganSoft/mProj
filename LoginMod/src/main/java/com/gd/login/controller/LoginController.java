package com.gd.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gd.login.service.LoginService;

@Controller
@RequestMapping("/gd")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String loginValidator(@RequestParam("lid") final String loginId) {
		
		System.out.println("Handling request at loginValidator");
		if (loginId !=null && loginId.length() > 0)
			loginService.validateUserByLoginId(loginId);
		
		return "index";
	}

}
