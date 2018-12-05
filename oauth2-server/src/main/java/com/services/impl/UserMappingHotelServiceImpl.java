package com.services.impl;

import com.dao.IUserMappingHotelDao;
import com.dataobject.UserMappingHotelDO;
import com.enums.ServiceEnum;
import com.exceptions.ServiceException;
import com.services.IUserMappingHotelService;
import com.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author：linma
 * @date: 2018/12/5 11:26
 * @email: linma@homeinns.com
 **/
@Service
@Slf4j
public class UserMappingHotelServiceImpl implements IUserMappingHotelService {

    @Autowired
    private IUserMappingHotelDao userMappingHotelDao;

    @Override
    public UserMappingHotelDO getUserMappingHotelByUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            throw new ServiceException(ServiceEnum.HOTEL_CODE_NOT_ALLOW_NULL);
        }
        return userMappingHotelDao.findUserMappingHotelByUsername(username);
    }
}
