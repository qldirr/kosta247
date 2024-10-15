package com.example.restfulwebservice2.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//2xx -> OK
//4xx -> client 오류
//5xx -> server 오류
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException(String format) {
        super(format);
    }
}
