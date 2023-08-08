package com.example.hdm_practice.controller;


import com.example.hdm_practice.request.PostCreateDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @PostMapping("/posts")
    public String getMappingPractice(@RequestBody PostCreateDto postCreateDto){
        return "HI";
    }







}
