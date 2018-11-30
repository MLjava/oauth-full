package com.dao;

import com.OAuth2ApplicationsTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/11/29 13:44
 * @email: linma@homeinns.com
 **/
public class IUserDetailDaoTest extends OAuth2ApplicationsTests {

    @Autowired
    private IUserDetailDao userDetailDao;

    @Test
    public void findUserDetailByUserId() {
        System.out.println(userDetailDao.findUserDetailByUserId("1"));
    }
}