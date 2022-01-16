package com.questinanswer.SpringBootQuoraLoginRegisterApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questinanswer.SpringBootQuoraLoginRegisterApp.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long>{

}
