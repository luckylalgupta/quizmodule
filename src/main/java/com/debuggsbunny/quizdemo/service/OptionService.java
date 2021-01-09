package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.repositories.OptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionService {
    @Autowired
    private OptionRepo optionRepo;
}
