package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.models.Question;
import com.debuggsbunny.quizdemo.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Optional<Question> getQuestionById(Integer id) {
       return questionRepository.findById(id);
    }

    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Question updateQuestion(Question question) {
        return questionRepository.save(question);
    }

    public boolean deleteQuestionById(Integer id) {
        Optional<Question> question = getQuestionById(id);
        if(null == question){
            return false;
        }
        questionRepository.deleteById(id);
        return true;
    }

    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }
}
