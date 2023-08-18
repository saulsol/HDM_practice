package com.example.hdm_practice.controller;


import com.example.hdm_practice.request.PostCreateDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping ("/serverTest")
    public String getMappingPractice(){
        return "HI";
    }







}
