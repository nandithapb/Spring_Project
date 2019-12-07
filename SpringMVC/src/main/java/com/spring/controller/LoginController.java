package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Login;
import com.spring.model.Register;
import com.spring.service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	//redirect to login page
	@RequestMapping(value = "Login",method = RequestMethod.GET)
	public ModelAndView ShowLogin() {
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}
	//login validation
	@RequestMapping(value ="/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,Login loginn){
		ModelAndView mv = null;
		Register reg = userService.validateuser(loginn);
		if(null != reg) {
			mv = new ModelAndView("welcome");
			mv.addObject("firstname",reg.getUsername());
		}
			else {
				mv = new ModelAndView("Login");
				mv.addObject("message","Username or Password is wrong");
			}
		return mv;
	}
}