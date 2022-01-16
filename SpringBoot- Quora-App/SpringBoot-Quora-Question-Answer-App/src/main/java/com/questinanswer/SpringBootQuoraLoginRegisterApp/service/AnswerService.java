package com.questinanswer.SpringBootQuoraLoginRegisterApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questinanswer.SpringBootQuoraLoginRegisterApp.entity.Answer;
import com.questinanswer.SpringBootQuoraLoginRegisterApp.repo.AnswerRepo;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepo answerRepo;
	
	
	public String giveAnswer(Answer answer) {
		answerRepo.save(answer);
		return "answer recorded";
	}
	
	public List<Answer> getAllAnswer(long qid) {
		return answerRepo.findbyqid(qid);
	}
	
	
}
