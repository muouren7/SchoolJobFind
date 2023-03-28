package com.example.schooljobfind;

import com.example.schooljobfind.Common.Mapper.UserMapper;
import com.example.schooljobfind.Common.enity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SchoolJobFindApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<Users> list = userMapper.selectList(null);
        System.out.println(list);
    }
}
