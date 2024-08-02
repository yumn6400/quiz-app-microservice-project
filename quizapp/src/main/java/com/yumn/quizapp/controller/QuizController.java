package com.yumn.quizapp.controller;

import com.yumn.quizapp.model.QuestionWrapper;
import com.yumn.quizapp.model.Response;
import com.yumn.quizapp.services.QuizService;
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
    public ResponseEntity<String> createQuiz(@RequestParam("category") String category,@RequestParam("numQ") int numQ,@RequestParam("title") String title){
        return quizService.createQuiz(category,numQ,title);
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
