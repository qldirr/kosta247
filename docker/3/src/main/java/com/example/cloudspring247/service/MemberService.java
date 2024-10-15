package com.example.cloudspring247.service;

import com.example.cloudspring247.mapper.MemberMapper;
import com.example.cloudspring247.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    public List<MemberVO> selectAllMembers(){
        return memberMapper.selectAllMembers();
    }

    public void insertMember(MemberVO vo){
        memberMapper.insertMember(vo);
    }
}
