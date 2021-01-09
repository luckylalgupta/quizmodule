package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.repositories.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepo answerRepo;

}
