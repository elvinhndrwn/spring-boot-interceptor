package com.example.springbootinterceptor.controller;

import com.example.springbootinterceptor.dto.RequestDTO;
import com.example.springbootinterceptor.dto.UserDto;
import com.example.springbootinterceptor.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @Autowired
    private UserService userService;

    @PostMapping("/hello")
    public String execute(@RequestBody RequestDTO requestDTO){
        log.info("Start execute method");
        return "Hello " + requestDTO.getName();
    }

    @PostMapping("/get-user")
    public UserDto getUser(@RequestBody UserDto requestDTO){
        log.info("Start execute method");
        return userService.getUser(requestDTO);
    }
}
