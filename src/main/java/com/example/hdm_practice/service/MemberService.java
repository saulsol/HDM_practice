package com.example.hdm_practice.service;

import com.example.hdm_practice.entity.Member;
import com.example.hdm_practice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void doSomething(final Member member){
        saveMember(member);
    }

    @Transactional
    public void saveMember(final Member member){
        memberRepository.save(member);

//        if(member.getMemberName().equals("e")){
//            throw new RuntimeException("ERROR");
//        }


    }
}
