package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.spring.model.Register;
import com.spring.service.UserService;

@Controller
	public class RegisterController {
	
	@Autowired
	public UserService userService;
		//redirect to home page
		@RequestMapping("/")
		public ModelAndView Home() {
			//System.out.println("home moeland view......");
			ModelAndView mv=new ModelAndView("Home");
			return mv;
		}
		//redirect to register page
		@RequestMapping(value="Register")
		public ModelAndView showRegister() {
			System.out.println("register cntrl");
			ModelAndView mv=new ModelAndView("Register");
			return mv;
		}
		//register process
		@RequestMapping(value="/registerProcess", method=RequestMethod.POST)
		public ModelAndView adduser(HttpServletRequest request, HttpServletResponse response, Register reg) {
			userService.register(reg);
			//return new ModelAndView("Home","Firstname",reg.getFirstname());
			return new ModelAndView("Home");
		}
}
