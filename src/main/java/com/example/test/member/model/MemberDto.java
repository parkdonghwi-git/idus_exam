package com.example.test.member.model;

import lombok.Getter;


public class MemberDto {
    @Getter
    public static class SignupRequest {
        private String email;
        private String password;
        private String name;
        private String nickname;

        public Member toEntity(String encodedPassword) {
            return Member.builder()
                    .email(email)
                    .password(encodedPassword)
                    .nickName(nickname)
                    .build();
        }
    }
}