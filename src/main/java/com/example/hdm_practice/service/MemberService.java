package com.example.hdm_practice.service;

import com.example.hdm_practice.entity.Member;
import com.example.hdm_practice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor

public class MemberService {

    private final MemberRepository memberRepository;


    public void doSomething(){



    }

    @Transactional
    public void createMember(){
        final Member member = new Member("A");
        memberRepository.save(member);

    }
}
