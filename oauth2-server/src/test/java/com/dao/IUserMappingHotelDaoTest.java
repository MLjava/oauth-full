package com.dao;

import com.OAuth2ApplicationsTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/12/5 11:16
 * @email: linma@homeinns.com
 **/
public class IUserMappingHotelDaoTest extends OAuth2ApplicationsTests {

    @Autowired
    private IUserMappingHotelDao userMappingHotelDao;

    @Test
    public void findUsernameById() {
        System.out.println(userMappingHotelDao.findUsernameById(11));
    }

    @Test
    public void findUserMappingHotelByUsername() {
        System.out.println(userMappingHotelDao.findUserMappingHotelByUsername("common1"));
    }
}