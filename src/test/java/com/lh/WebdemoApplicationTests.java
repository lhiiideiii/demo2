package com.lh;

import com.lh.dao.userdao;
import com.lh.domain.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebdemoApplicationTests {

    @Autowired
    private userdao userdao;


    @Test
    void testgetbyid() {
        user user=userdao.selectById(1);
        System.out.println(user);
    }

}
