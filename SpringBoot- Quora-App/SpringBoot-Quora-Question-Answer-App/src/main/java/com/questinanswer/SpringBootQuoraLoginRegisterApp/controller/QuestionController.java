package com.questinanswer.SpringBootQuoraLoginRegisterApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questinanswer.SpringBootQuoraLoginRegisterApp.entity.Question;
import com.questinanswer.SpringBootQuoraLoginRegisterApp.service.QuestionService;

@RestController
@RequestMapping("/question-service")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/askQuestion")
	public String askQuestion(@RequestBody Question question) {
		return questionService.insertQuestion(question);
	}
	
	@GetMapping("/allQuestion")
	public List<Question> getAllQuestion() {
		return questionService.allQuestion();
	}
	
	@GetMapping("/question/{id}")
	public Optional<Question> getQuestionById(@PathVariable("id") long id) {
	return questionService.getQuestionById(id);
	}
}
