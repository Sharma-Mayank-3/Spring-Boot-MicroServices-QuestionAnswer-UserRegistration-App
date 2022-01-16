package com.loginregister.SpringBootQuoraLoginRegisterApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.loginregister.SpringBootQuoraLoginRegisterApp.entity.UserModel;
import com.loginregister.SpringBootQuoraLoginRegisterApp.service.QuestionService;
import com.loginregister.SpringBootQuoraLoginRegisterApp.service.UserService;
import com.loginregister.SpringBootQuoraLoginRegisterApp.utilClasses.Question;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private QuestionService questionService;

	@RequestMapping("/")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/register")
	public String registrationPage() {
		return "registration";
	}

	@PostMapping("/insert")
	public String insertNewUser(UserModel userModel, Model model) {
		String msg = userService.registerUser(userModel);
		model.addAttribute("msg", msg);
		return "login";
	}

	@PostMapping("/validate")
	public String validateUser(@RequestParam("name") String name, @RequestParam("password") String password,
			Model model) {
		UserModel findUser = userService.findUser(name, password);
		List<Question> allQuestion = questionService.getAllQuestion();
		model.addAttribute("allQuestion", allQuestion);
		model.addAttribute("user", findUser);
		return "home";
	}
	
	
	@GetMapping("/home")
	public String homePage(Model model) {
		List<Question> allQuestion = questionService.getAllQuestion();
		model.addAttribute("allQuestion", allQuestion);
		return "home";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}

}
