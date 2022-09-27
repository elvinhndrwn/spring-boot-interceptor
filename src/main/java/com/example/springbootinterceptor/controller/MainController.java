package com.example.springbootinterceptor.controller;

import com.example.springbootinterceptor.dto.RequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @PostMapping("/hello")
    public String execute(@RequestBody RequestDTO requestDTO){
        log.info("Start execute method");
        return "Hello " + requestDTO.getName();
    }
}
