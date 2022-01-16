package com.loginregister.SpringBootQuoraLoginRegisterApp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loginregister.SpringBootQuoraLoginRegisterApp.service.AnswerService;
import com.loginregister.SpringBootQuoraLoginRegisterApp.service.QuestionService;
import com.loginregister.SpringBootQuoraLoginRegisterApp.utilClasses.Answer;
import com.loginregister.SpringBootQuoraLoginRegisterApp.utilClasses.Question;

@Controller
@RequestMapping("/")
public class QuestionAnswerController {

	@Autowired
	private AnswerService answerService;
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/newQuestion")
	public String askNewQuestion() {
		return "newQuestion";
	}
	
	@GetMapping("/answer")
	public String answerToQuestion(HttpServletRequest request, Model model) {
		String strQid = request.getParameter("qid");
		long qid = Long.parseLong(strQid);
		Question questionById = questionService.getQuestionById(qid);
		List<Answer> allAnswer = answerService.getAllAnswer(qid);
		model.addAttribute("allAnswers", allAnswer);
		model.addAttribute("questionById", questionById);
		return "allAnswers";
	}
	
	@PostMapping("/newQuestionPost")
	public String postQuestion(Question question, Model model) {
		questionService.askQuestion(question);
		List<Question> allQuestion = questionService.getAllQuestion();
		model.addAttribute("allQuestion", allQuestion);
		return "home";
	}
	
	@GetMapping("/newAnswer")
	public String newAnswer(HttpServletRequest request, Model model) {
		String strQid = request.getParameter("qid");
		model.addAttribute("qid", strQid);
		return "newAnswer";
	}
	
	@PostMapping("/newAnswerPost")
	public String postAnswer(Answer answer, Model model) {
		answerService.submitAnswer(answer);
		Question questionById = questionService.getQuestionById(answer.getQid());
		List<Answer> allAnswer = answerService.getAllAnswer(answer.getQid());
		model.addAttribute("allAnswers", allAnswer);
		model.addAttribute("questionById", questionById);
		return "allAnswers";
	}
	
}
