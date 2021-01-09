package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.repositories.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {
    @Autowired
    private ResponseRepository responseRepository;
}
