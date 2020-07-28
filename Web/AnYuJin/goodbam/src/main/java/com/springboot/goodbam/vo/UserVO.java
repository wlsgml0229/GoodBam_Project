package com.springboot.goodbam.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {
    private String userID ;
    private String userPass ;
    private String userName;
    private String userEmail ;
    private String userQes ;
    private String userAns;
    private String userSignupdate;
}
