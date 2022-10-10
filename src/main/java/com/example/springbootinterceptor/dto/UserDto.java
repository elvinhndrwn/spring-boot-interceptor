package com.example.springbootinterceptor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    private static final long serialVersionUID = -136418749554362758L;

    private String username;
}
