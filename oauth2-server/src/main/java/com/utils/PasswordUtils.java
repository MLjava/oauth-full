package com.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author：linma
 * @date: 2018/11/30 14:13
 * @email: linma@homeinns.com
 **/
public class PasswordUtils {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
