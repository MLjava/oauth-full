package com.dao;

import com.OAuth2ApplicationsTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/11/27 16:41
 * @email: linma@homeinns.com
 **/
public class IPermissionDaoTest extends OAuth2ApplicationsTests {

    @Autowired
    private IPermissionDao permissionDao;

    @Test
    public void findPermissionByUsername() {
        System.out.println(permissionDao.findPermissionByUsername("admin1"));
    }
}