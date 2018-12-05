package com.dao;

import com.OAuth2ApplicationsTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/12/4 9:56
 * @email: linma@homeinns.com
 **/
public class IClientDetailsDaoTest extends OAuth2ApplicationsTests {

    @Autowired
    private IClientDetailsDao clientDetailsDao;

    @Test
    public void findClientDetailsByClientId() {
        System.out.println(clientDetailsDao.findClientDetailsByClientId("client"));
    }
}