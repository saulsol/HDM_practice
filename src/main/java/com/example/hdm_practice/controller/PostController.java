package com.example.hdm_practice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping ("/serverTest")
    public String getMappingPractice(){
        return "HI";
    }







}
