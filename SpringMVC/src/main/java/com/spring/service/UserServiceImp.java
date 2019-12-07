package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.UserDao;
import com.spring.model.Login;
import com.spring.model.Register;

public class UserServiceImp implements UserService{
	@Autowired
	//object of user dao class
	UserDao userDao;
	//method for registration
	public void register(Register reg) {
		userDao.register(reg);
	}
	//method for user validation
	public Register validateuser(Login login) {
		
		return userDao.validateuser(login);
	}
}
