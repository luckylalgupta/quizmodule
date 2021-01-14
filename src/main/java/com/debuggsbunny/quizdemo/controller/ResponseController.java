package com.debuggsbunny.quizdemo.controller;

import com.debuggsbunny.quizdemo.models.Option;
import com.debuggsbunny.quizdemo.models.Response;
import com.debuggsbunny.quizdemo.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/response")
public class ResponseController {
    @Autowired
    private ResponseService responseService;

    @PostMapping("/")
    public Response checkResponse(@RequestBody Response response){
        List<Integer> quesAnswers = response.getQuestion().getAnswers().stream().map(item -> item.getId()).collect(Collectors.toList());
        List<Integer> userAnswers = response.getUserAnswers().stream().map(item -> item.getId()).collect(Collectors.toList());
        Collections.sort(quesAnswers);
        Collections.sort(userAnswers);
        if (quesAnswers.size() != userAnswers.size()){
            response.setCorrect(false);
        }else{
            int count = 0;
            for (Integer i : quesAnswers){
                if (i == userAnswers.get(count)){
                    response.setCorrect(false);
                    break;
                }
                count++;
            }
            if (count == quesAnswers.size()){
                response.setCorrect(true);
            }
        }

        return responseService.saveResponse(response);
    }

    @GetMapping("/")
    public Optional<Response> getResponseById(@PathVariable("id") Integer id ){
        return responseService.getResponseById(id);
    }

}
