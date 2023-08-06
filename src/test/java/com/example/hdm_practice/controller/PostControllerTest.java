package com.example.hdm_practice.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest
class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;
    // @WebMvcTest 를 붙이지 않으면 에러가 뜸

    @Test
    @DisplayName("/post 요청시 hi 출력")
    void test() throws Exception  {
        mockMvc.perform(MockMvcRequestBuilders.post("/posts")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED ) //application/x-www-form-urlencoded.

                ) // application/json
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("HI"))
                .andDo(print());
    }
    // 대소문자가 달라도 틀렸다고 에러를 띄움
    // MockMVC는 기본적으로 application/json
    // contentType 이 바뀌어도 기본적으로 Test 통과가 된다.


}