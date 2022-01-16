package com.questinanswer.SpringBootQuoraLoginRegisterApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questinanswer.SpringBootQuoraLoginRegisterApp.entity.Answer;
import com.questinanswer.SpringBootQuoraLoginRegisterApp.service.AnswerService;

@RestController
@RequestMapping("/answer-service")
public class AnswerController {

	@Autowired
	private AnswerService answerService;
	
	@PostMapping("/answer")
	public String giveAnswer(@RequestBody Answer answer) {
		return answerService.giveAnswer(answer);
	}
	
	@GetMapping("/allAnswer/{qid}")
	public List<Answer> getAllAnswer(@PathVariable("qid") long qid) {
		return answerService.getAllAnswer(qid);
	}
	
}
