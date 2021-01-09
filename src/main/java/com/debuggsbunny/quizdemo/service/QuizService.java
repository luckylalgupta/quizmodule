package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.repositories.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
    @Autowired
    private QuizRepo quizRepo;
}
