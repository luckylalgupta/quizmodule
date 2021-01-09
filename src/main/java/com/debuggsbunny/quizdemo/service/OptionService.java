package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.repositories.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionService {
    @Autowired
    private OptionRepository optionRepository;
}
