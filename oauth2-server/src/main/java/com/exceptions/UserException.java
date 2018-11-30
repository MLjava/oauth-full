package com.exceptions;

import com.enums.UserEnum;

/**
 * @author：linma
 * @date: 2018/11/26 16:19
 * @email: linma@homeinns.com
 **/
public class UserException extends HomeinnsException {

    public UserException(UserEnum userEnum) {
        super(userEnum.getCode(), userEnum.getMessage());
    }
}
