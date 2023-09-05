package com.example.hdm_practice.repository;

import com.example.hdm_practice.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
