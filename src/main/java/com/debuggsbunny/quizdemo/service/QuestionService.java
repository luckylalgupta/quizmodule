package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepo questionRepo;
}
