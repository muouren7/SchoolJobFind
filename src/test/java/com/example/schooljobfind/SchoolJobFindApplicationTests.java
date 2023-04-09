package com.example.schooljobfind;

import com.example.schooljobfind.Common.Utils.Token;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) //在测试的时候启动Tomcat服务器，WebSocket是需要依赖Tomcat服务器的
class SchoolJobFindApplicationTests {

    @Autowired
    private Token Tokens;

    @Test
    public void test() throws InterruptedException{
        String name="AAAA";
        String token = Tokens.createToken(name);
        System.out.println(token);
        System.out.println(Tokens.varity(token));
    }
}
