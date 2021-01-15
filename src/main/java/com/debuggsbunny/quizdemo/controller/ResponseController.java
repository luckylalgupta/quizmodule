package com.debuggsbunny.quizdemo.controller;

import com.debuggsbunny.quizdemo.models.Option;
import com.debuggsbunny.quizdemo.models.Question;
import com.debuggsbunny.quizdemo.models.Response;
import com.debuggsbunny.quizdemo.service.QuestionService;
import com.debuggsbunny.quizdemo.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/response")
public class ResponseController {

    @Autowired
    private ResponseService responseService;

    @Autowired
    private QuestionService questionService;

    @PostMapping("/")
    public Response addResponse(@RequestBody Response response){
        Question question = questionService.getQuestionById(response.getQuestion().getId()).get();
        List<Integer> quesAnswers = question.getAnswers().stream().map(item -> item.getId()).collect(Collectors.toList());
        List<Integer> userAnswers = response.getAnswers().stream().map(item -> item.getId()).collect(Collectors.toList());
        Collections.sort(quesAnswers);
        Collections.sort(userAnswers);

        if (quesAnswers.size() != userAnswers.size()){
            response.setCorrect(false);
        }else{
            response.setCorrect(true);
            for (int count = 0; count < quesAnswers.size(); count++){
                if (quesAnswers.get(count) != userAnswers.get(count)){
                    response.setCorrect(false);
                    break;
                }
            }
        }

        return responseService.saveResponse(response);
    }

    @GetMapping("/{id}")
    public Optional<Response> getResponseById(@PathVariable("id") Integer id ){
        return responseService.getResponseById(id);
    }

}
