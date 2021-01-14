package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.models.Quiz;
import com.debuggsbunny.quizdemo.repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public Quiz updateQuiz(Quiz quiz) {
        return quizRepository.saveAndFlush(quiz);
    }

    public boolean deleteQuizById(Integer id) {
        Optional<Quiz> quiz = getQuizById(id);
        if(null == quiz){
            return false;
        }
         quizRepository.deleteById(id);
        return true;
    }

    public Optional<Quiz> getQuizById(Integer id) {
        return quizRepository.findById(id);
    }

    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }
}
