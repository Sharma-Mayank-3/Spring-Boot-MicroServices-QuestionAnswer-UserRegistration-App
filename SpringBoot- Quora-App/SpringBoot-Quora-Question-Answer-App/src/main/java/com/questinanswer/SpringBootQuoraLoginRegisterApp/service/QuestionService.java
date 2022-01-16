package com.questinanswer.SpringBootQuoraLoginRegisterApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questinanswer.SpringBootQuoraLoginRegisterApp.entity.Question;
import com.questinanswer.SpringBootQuoraLoginRegisterApp.repo.QuestionRepo;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepo questionRepo;
	
	
	public String insertQuestion(Question question) {
		questionRepo.save(question);
		return "success...";
	}
	
	public Optional<Question> getQuestionById(long id) {
		return questionRepo.findById(id);
	}
	
	
	public List<Question> allQuestion() {
		return questionRepo.findAll();
	}
}
