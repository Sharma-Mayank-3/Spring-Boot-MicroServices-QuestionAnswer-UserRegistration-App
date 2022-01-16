package com.loginregister.SpringBootQuoraLoginRegisterApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginregister.SpringBootQuoraLoginRegisterApp.entity.UserModel;
import com.loginregister.SpringBootQuoraLoginRegisterApp.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	
	public String registerUser(UserModel userModel) {
		userRepo.save(userModel);
		return "user saved";
	}
	
	
	public UserModel findUser(String name, String password) {
		return userRepo.searchByNameAndPassword(name, password);
	}
}
