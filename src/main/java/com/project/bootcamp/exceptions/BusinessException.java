package com.project.bootcamp.exceptions;

import org.springframework.http.HttpStatus;

public class BusinessException extends RuntimeException  {

    public BusinessException(String message)
    {
        super(message);
    }
}
