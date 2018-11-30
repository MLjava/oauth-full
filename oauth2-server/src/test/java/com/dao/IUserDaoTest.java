package com.dao;

import com.OAuth2ApplicationsTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/11/27 10:57
 * @email: linma@homeinns.com
 **/
public class IUserDaoTest extends OAuth2ApplicationsTests {

    @Autowired
    private IUserDao userDao;

    @Test
    public void findUserByUsername() {
        System.out.println(userDao.findUserByUsername("admin"));
    }
}