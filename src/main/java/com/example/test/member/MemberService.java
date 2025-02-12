package com.example.test.member;

import com.example.test.emailverify.EmailVerifyService;
import com.example.test.member.model.Member;
import com.example.test.member.model.MemberDto;
import com.example.test.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final EmailVerifyService emailVerifyService;
    private final PasswordEncoder passwordEncoder;

    public void signup(MemberDto.SignupRequest dto) {
        String encodedPassword = passwordEncoder.encode(dto.getPassword());

        Member member = memberRepository.save(dto.toEntity(encodedPassword));

        emailVerifyService.signup(member.getIdx(), member.getEmail());
    }
}
