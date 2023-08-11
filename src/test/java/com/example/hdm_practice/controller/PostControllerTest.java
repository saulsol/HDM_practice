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
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\": \"제목입니다.\", \"content\": \"내용입니다.\"}")

                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("HI"))
                .andDo(print());
    }
    // 대소문자가 달라도 틀렸다고 에러를 띄움
    // MockMVC는  application/json 타입으로 변경을 해야한다.
    // contentType 이 바뀌어도 기본적으로 Test 통과가 된다.
    //


}