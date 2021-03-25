package com.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalException extends RuntimeException{
    public InternalException(String message){super(message);}
    public InternalException(String message, Throwable cause) {
        super(message, cause);
    }
}
