package com.yumn.quizapp.dao;

import com.yumn.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
