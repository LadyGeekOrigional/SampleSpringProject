package com.sampleprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value = "/")
	public String getGreeting() {
		return "index";
	}
	@RequestMapping(value = "/login")
	public String getLogin() {
		return "login";
	}
	@RequestMapping("/welcome")
	public String getWelcomeScreen() {
		return "welcome";
	}
	@RequestMapping("/user")
	public String getUserScreen() {
		return "user";
	}
	@RequestMapping("/Admin")
	public String getAdminScreen() {
		return "Admin";
	}
	

}
