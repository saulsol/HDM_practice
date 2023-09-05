package com.example.hdm_practice.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long memberId;

    @Column(name = "member_name")
    String memberName;


    public Member(String memberName) {
        this.memberName = memberName;
    }
}
