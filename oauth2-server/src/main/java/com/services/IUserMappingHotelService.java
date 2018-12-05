package com.services;

import com.dataobject.UserMappingHotelDO;

/**
 * @author：linma
 * @date: 2018/12/5 11:26
 * @email: linma@homeinns.com
 **/
public interface IUserMappingHotelService {

    /**
     * 根据用户查询
     *
     * @param username
     * @return
     */
    UserMappingHotelDO getUserMappingHotelByUsername(String username);

}
