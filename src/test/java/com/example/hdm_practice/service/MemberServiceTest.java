package com.example.hdm_practice.service;

import com.example.hdm_practice.entity.Member;
import com.example.hdm_practice.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.springframework.cglib.proxy.Enhancer;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("CGLIB으로 만든 프록시를 호출 한 뒤 self invacation을 확인한다.")
    void self_invocation(){


        Member member = new Member("LOM");
        memberRepository.save(member);

    }



}