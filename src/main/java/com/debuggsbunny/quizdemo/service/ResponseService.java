package com.debuggsbunny.quizdemo.service;

import com.debuggsbunny.quizdemo.models.Response;
import com.debuggsbunny.quizdemo.repositories.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResponseService {
    @Autowired
    private ResponseRepository responseRepository;

    public Response saveResponse(Response response) {
        return responseRepository.save(response);
    }

    public Optional<Response> getResponseById(Integer id) {
        return responseRepository.findById(id);
    }
}
