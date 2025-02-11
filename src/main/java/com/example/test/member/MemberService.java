package com.example.test.member;

import com.example.test.member.model.MemberDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class MemberService{
    private MemberRepository memberRepository;

    public void signup(MemberDto.SignupRequest dto) {
        String encodedPassword = passwordEncoder.encode(dto.getPassword());

        emailVerifyService.signup(member.getIdx(), member.getEmail());
    }
}
