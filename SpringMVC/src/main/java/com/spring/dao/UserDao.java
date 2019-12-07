package com.spring.dao;

import com.spring.model.Login;
import com.spring.model.Register;

public interface UserDao {
	//method for registration
	void register(Register reg);
	// method for user validation
	Register validateuser(Login login);
	
}
