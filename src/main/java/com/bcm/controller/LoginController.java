package com.bcm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping(path="/register",method=RequestMethod.GET)
	public String getLogin() {
		return "login called";
	}
	
	@RequestMapping(path="/")
	public String getApi() {
		return "api accessed with token";
	}
}
