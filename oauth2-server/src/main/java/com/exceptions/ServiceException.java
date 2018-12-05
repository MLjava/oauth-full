package com.exceptions;

import com.enums.ServiceEnum;

/**
 * @author：linma
 * @date: 2018/12/5 11:31
 * @email: linma@homeinns.com
 **/
public class ServiceException extends HomeinnsException {

    public ServiceException(ServiceEnum serviceEnum) {
        super(serviceEnum.getCode(), serviceEnum.getMessage());
    }
}
