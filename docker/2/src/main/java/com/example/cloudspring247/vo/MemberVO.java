package com.example.cloudspring247.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
    private int id;
    private String name;
    private String job;
    private String home;
}
