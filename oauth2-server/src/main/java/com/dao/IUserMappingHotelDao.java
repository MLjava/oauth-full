package com.dao;

import com.dataobject.UserMappingHotelDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author：linma
 * @date: 2018/12/5 11:03
 * @email: linma@homeinns.com
 **/
@Repository
public interface IUserMappingHotelDao {

    /**
     * 根据酒店编号查询用户名
     *
     * @param hotelId 酒店编号
     * @return
     */
    UserMappingHotelDO findUsernameById(Integer hotelId);

    /**
     * 根据用户查询酒店信息
     *
     * @param username 用户名字
     * @return
     */
    UserMappingHotelDO findUserMappingHotelByUsername(String username);

}
