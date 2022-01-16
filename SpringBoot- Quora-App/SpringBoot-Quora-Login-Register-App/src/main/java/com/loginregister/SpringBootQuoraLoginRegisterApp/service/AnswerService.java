package com.loginregister.SpringBootQuoraLoginRegisterApp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.loginregister.SpringBootQuoraLoginRegisterApp.utilClasses.Answer;

@Service
public class AnswerService {

	@Autowired
	private RestTemplate restTemplate;

	public List<Answer> getAllAnswer(long qid) {
		Answer[] forObject = restTemplate.getForObject("http://localhost:8090/answer-service/allAnswer/" + qid,
				Answer[].class);
		List<Answer> allAnswers = Arrays.asList(forObject);
		return allAnswers;
	}

	public void submitAnswer(Answer answer) {
		restTemplate.postForObject("http://localhost:8090/answer-service/answer", answer, String.class);
	}

}
