package com.yumn.quiz_service.services;

import com.yumn.quiz_service.dao.QuizDao;
import com.yumn.quiz_service.feign.QuizInterface;
import com.yumn.quiz_service.model.QuestionWrapper;
import com.yumn.quiz_service.model.Quiz;
import com.yumn.quiz_service.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;

    @Autowired
    QuizInterface quizInterface;

    public ResponseEntity<String> createQuiz(String categoryName,int numQuestion,String title){
        System.out.println("****createQuiz method got called*********");
        System.out.println("Category: "+categoryName+",title : "+title+"numQ :"+numQuestion);
        List<Integer> questionIds=quizInterface.getQuestionsForQuiz(categoryName,numQuestion).getBody();

        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIds(questionIds);
        quizDao.save(quiz);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id){
        Optional<Quiz> quiz=quizDao.findById(id);
        List<Integer> questionIds=quiz.get().getQuestionIds();
        return quizInterface.getQuestionsFromId(questionIds);
    }

    public ResponseEntity<Integer> calculateResult(Integer id,List<Response> responses){
        return quizInterface.getScore(responses);
    }

}
