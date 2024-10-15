package com.example.cloudspring247.mapper;

import com.example.cloudspring247.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> selectAllMembers();
    public void insertMember(MemberVO vo);
}
