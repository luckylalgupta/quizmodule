package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.repositories.ResponseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {
    @Autowired
    private ResponseRepo responseRepo;
}
