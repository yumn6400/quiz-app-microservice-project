package com.yumn.quiz_service.controller;

import com.yumn.quiz_service.dto.QuizDto;
import com.yumn.quiz_service.model.QuestionWrapper;
import com.yumn.quiz_service.model.Response;
import com.yumn.quiz_service.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {


    @Autowired
    private QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(QuizDto quizDto){
        System.out.println(quizDto.getCategoryName()+","+quizDto.getNumQuestion()+","+quizDto.getTitle());
        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumQuestion(), quizDto.getTitle());
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
        return quizService.calculateResult(id,responses);
    }
}
