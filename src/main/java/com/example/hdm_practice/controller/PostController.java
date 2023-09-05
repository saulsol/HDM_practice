package com.example.hdm_practice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping ("/serverTest")
    public String getMappingPractice(){
        System.out.println("컨트롤러 동작");

        return "HI";
    }







}
