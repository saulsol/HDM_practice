package com.example.hdm_practice.controller;

import com.example.hdm_practice.dto.MemberCreateDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MemberController {

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody MemberCreateDto memberCreateDto,
                                       BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            List<String> errors = bindingResult.getAllErrors()
                    .stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .collect(Collectors.toList());
            return ResponseEntity.ok().body(errors);
        }


        return ResponseEntity.ok().body("회원 등록 성공: " + memberCreateDto.getName());
    }

    @PostMapping("/registerNoBindingResult")
    public ResponseEntity<?> registerUser2(@Valid @RequestBody MemberCreateDto memberCreateDto){

        return ResponseEntity.ok().body("회원 등록 성공: " + memberCreateDto.getName());
    }


}
