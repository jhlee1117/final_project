package com.ch.jobdamoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
		
	@RequestMapping("selectLoginForm")
	public String selectJoinForm() {
		return "login/selectLoginForm";
	}
	
}
