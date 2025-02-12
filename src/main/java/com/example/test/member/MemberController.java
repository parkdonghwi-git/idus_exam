package com.example.test.member;

import com.example.test.member.model.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
