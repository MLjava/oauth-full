package com;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author linma
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@MapperScan("com.dao")
public class OAuth2ApplicationsTests {

    @Autowired
    private RedisConnectionFactory connectionFactory;

    @Test
    public void context() {
        System.out.println(connectionFactory.toString());
    }
}
