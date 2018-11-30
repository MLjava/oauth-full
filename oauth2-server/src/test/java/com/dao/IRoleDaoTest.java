package com.dao;

import com.OAuth2ApplicationsTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/11/30 9:56
 * @email: linma@homeinns.com
 **/
public class IRoleDaoTest extends OAuth2ApplicationsTests {

    @Autowired
    private IRoleDao roleDao;

    @Test
    public void findRolesByUsername() {
        System.out.println(roleDao.findRolesByUsername("admin1"));
    }
}