package com.in28minutes.sprintboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	//localhost:8080/login?name=Ranga
	@RequestMapping("login")
	public String gotoLoginPage() {
		
		return "login";
	}
}
