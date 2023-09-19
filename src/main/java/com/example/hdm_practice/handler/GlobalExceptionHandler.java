package com.example.hdm_practice.handler;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<String> handleValidationException(MethodArgumentNotValidException ex){
        List<String> errors = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach(
                error -> {
                    errors.add(error.getDefaultMessage());
                }
        );
        return errors;
    }

}
