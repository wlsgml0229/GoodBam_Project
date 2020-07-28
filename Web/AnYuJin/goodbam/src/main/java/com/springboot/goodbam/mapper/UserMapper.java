package com.springboot.goodbam.mapper;

import com.springboot.goodbam.vo.UserVO;
import java.util.List;

public interface UserMapper {
    public List<UserVO> userList() throws Exception;
}
