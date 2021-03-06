package com.debuggsbunny.quizdemo.controller;

import com.debuggsbunny.quizdemo.models.Option;
import com.debuggsbunny.quizdemo.models.Question;
import com.debuggsbunny.quizdemo.service.QuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/question")
public class QuestionController {
    private final Logger logger = LoggerFactory.getLogger(QuestionController.class);

    @Autowired
    private QuestionService questionService;

    @GetMapping(value="/{id}")
    public Optional<Question> getQuestionById(@PathVariable("id") Integer id){
      return  questionService.getQuestionById(id);
    }

    @PostMapping("/")
    public Question addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @PutMapping("/")
    public Question updateQuestion(@RequestBody Question question){
        return questionService.updateQuestion(question);
    }

    @DeleteMapping("/")
    public boolean deleteQuestionById(@PathVariable("id") Integer id){
        return questionService.deleteQuestionById(id);
    }

    @GetMapping(value ="/all")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @PutMapping(value = "/{questionId}/options")
    public Question addOptions(@PathVariable("questionId") Integer questionId, @RequestBody List<Option> options){
        Optional<Question> question = questionService.getQuestionById(questionId);
        question.get().setOptions(options);
        return questionService.updateQuestion(question.get());
    }

    @PutMapping(value = "/{questionId}/answers")
    public Question addAnswers(@PathVariable("questionId") Integer questionId, @RequestBody List<Option> answers){
        Optional<Question> question = questionService.getQuestionById(questionId);
        question.get().setAnswers(answers);
        return questionService.updateQuestion(question.get());
    }
}
