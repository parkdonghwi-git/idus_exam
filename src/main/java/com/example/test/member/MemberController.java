package com.example.test.member;

import com.example.test.member.model.Member;
import com.example.test.member.model.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public void signup(@RequestBody MemberDto.SignupRequest dto) {
    memberService.signup(dto);
    }
}
