package com.cg.web;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bean.LoginBean;

@Controller
public class LoginController {
//Access URL: http://localhost:8080/SpringMVC/login.do
//	@RequestMapping("/login.do")
//	public String validate(LoginBean login, Map model) {
//		//model.put("message", "login successfull: "+login.getUserId());
//		model.put("login", login);
//		return "output";
//		//return "greeting";
//	}
	
	//Access URL: http://localhost:8080/SpringMVC/login.do
	@RequestMapping(name="/login.do", method = RequestMethod.POST)
	public String validate(LoginBean login, HttpSession session) {
		session.setAttribute("login", login);
		return "output";
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
