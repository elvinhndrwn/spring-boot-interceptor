package com.example.springbootinterceptor.service;

import com.example.springbootinterceptor.dto.UserDto;
import com.example.springbootinterceptor.model.User;
import com.example.springbootinterceptor.repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Optional;

@Service
@Slf4j
public class UserService{

    @Autowired
    private UserRepo userRepo;

    public UserDto getUser(UserDto request){
        UserDto response = UserDto.builder().build();

        try {
            if(request != null){
                Optional<User> user = userRepo.findByUsername(request.getUsername());
                user.ifPresent(value -> BeanUtils.copyProperties(value, response));
            }
            return response;
        }catch (Exception e){
            log.error("error when get user name");
            throw e;
        }
    }
}
