package com.example.test.member.model;

import lombok.Getter;

public class MemberDto {
    @Getter
    public static class SignupRequest {
        private String email;
        private String password;
        private String name;
        private String nickname;
        private String phoneNum;
    }
}
