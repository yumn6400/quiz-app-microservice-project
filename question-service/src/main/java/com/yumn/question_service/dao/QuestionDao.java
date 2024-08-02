package com.yumn.question_service.dao;

import com.yumn.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question,Integer> {

    List<Question> findByCategory(String category);
    @Query(value="SELECT * FROM question q WHERE q.category = ?1 ORDER BY RAND() LIMIT ?2", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);

}
