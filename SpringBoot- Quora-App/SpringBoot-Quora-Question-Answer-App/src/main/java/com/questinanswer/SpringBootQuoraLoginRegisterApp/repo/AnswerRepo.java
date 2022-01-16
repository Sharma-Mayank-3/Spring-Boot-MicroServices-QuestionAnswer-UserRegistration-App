package com.questinanswer.SpringBootQuoraLoginRegisterApp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.questinanswer.SpringBootQuoraLoginRegisterApp.entity.Answer;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Long>{

	@Query("from Answer where qid=:qid")
	public List<Answer> findbyqid(long qid);
	
}
