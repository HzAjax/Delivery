package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> allExeptions (Exception ex) {
        return new ResponseEntity<>("Ошибка в запросе: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
