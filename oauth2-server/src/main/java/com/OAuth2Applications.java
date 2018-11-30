package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author linma
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.dao")
@EnableTransactionManagement
public class OAuth2Applications {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2Applications.class, args);
    }
}
