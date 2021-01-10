package com.debuggsbunny.quizdemo.controller;

import com.debuggsbunny.quizdemo.models.Option;
import com.debuggsbunny.quizdemo.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api/option")
public class OptionController {
    @Autowired
    private OptionService optionService;
    @PostMapping("/")
    public Option addOption(@RequestBody Option option){
        return optionService.addOption(option);
    }
}
