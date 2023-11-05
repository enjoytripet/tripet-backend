//package com.enjoy.tripet.controller;
//
//import com.enjoy.tripet.request.SignUpDto;
//import com.enjoy.tripet.service.MemberService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/member")
//public class MemberController {
//    private final MemberService memberService;
//
//    @PostMapping("/signUp")
//    public ResponseEntity<Void> signUp(@RequestBody SignUpDto signUpDto){
//        memberService.signUp(signUpDto);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
