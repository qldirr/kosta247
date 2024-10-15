package com.example.cloudspring247.controller;

import com.example.cloudspring247.service.MemberService;
import com.example.cloudspring247.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class APIController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public String hello(){
        return "SpringBoot&Mybats!!!";
    }

    @GetMapping("/members")
    public List<MemberVO> selectListMembers(){
        return memberService.selectAllMembers();
    }

    @PostMapping("/addMember")
    public String addMember(@RequestBody MemberVO vo){
        memberService.insertMember(vo);
        return "OK";
    }
}
