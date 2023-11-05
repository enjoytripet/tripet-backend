package com.enjoy.tripet.service;

import com.enjoy.tripet.domain.Member;
import com.enjoy.tripet.repository.MemberRepository;
import com.enjoy.tripet.request.SignUpDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void signUp(SignUpDto signUpDto){
        Member signUpMember = Member.builder()
                .email(signUpDto.getEmail())
                .password(signUpDto.getPassword())
                .nickname(signUpDto.getNickname())
                .build();
        memberRepository.save(signUpMember);
    }
}
