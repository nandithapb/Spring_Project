package com.spring.service;

import com.spring.model.Login;
import com.spring.model.Register;

public interface UserService {
	//method for registration
	void register(Register reg);
	//method for user validation
	Register validateuser(Login login);
}
