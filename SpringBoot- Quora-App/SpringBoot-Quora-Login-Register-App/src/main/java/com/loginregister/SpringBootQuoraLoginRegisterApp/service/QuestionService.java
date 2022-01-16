package com.loginregister.SpringBootQuoraLoginRegisterApp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.loginregister.SpringBootQuoraLoginRegisterApp.utilClasses.Question;

@Service
public class QuestionService {

	@Autowired
	private RestTemplate restTemplate;
	
	
	public List<Question> getAllQuestion() {
		Question[] forObject = restTemplate.getForObject("http://localhost:8090/question-service/allQuestion",
				Question[].class);
		List<Question> allQuestionList = Arrays.asList(forObject);
		return allQuestionList;
	}
	
	public String askQuestion(Question question) {
		restTemplate.postForObject("http://localhost:8090/question-service/askQuestion", question, String.class);
		return "done question ";
	}
	
	public Question getQuestionById(long id) {
		Question forObject = restTemplate.getForObject("http://localhost:8090/question-service/question/"+id, Question.class);
		return forObject;
	}
}
