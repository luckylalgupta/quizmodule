package com.debuggsbunny.quizdemo.controller;

import com.debuggsbunny.quizdemo.models.Quiz;
import com.debuggsbunny.quizdemo.service.QuizService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private final Logger logger = LoggerFactory.getLogger(QuizController.class);

    @Autowired
    private QuizService quizService;

    @PostMapping("/")
    public Quiz addQuiz(@RequestBody Quiz quiz){
       return quizService.addQuiz(quiz);
    }

    @PutMapping("/")
    public Quiz updateQuiz(@RequestBody Quiz quiz){
        return quizService.updateQuiz(quiz);
    }

    @DeleteMapping("/")
    public boolean deleteQuizById(@PathVariable("id") Integer id){
        return quizService.deleteQuizById(id);
    }

    @GetMapping("/{id}")
    public Optional<Quiz> getQuizById(@PathVariable("id") Integer id){
        return quizService.getQuizById(id);
    }

    @GetMapping("/")
    public List<Quiz> getAllQuiz(){
        return quizService.getAllQuiz();
    }

}
