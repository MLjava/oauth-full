package com.exceptions;

import com.enums.CommonEnum;

/**
 * @author：linma
 * @date: 2018/12/5 13:13
 * @email: linma@homeinns.com
 **/
public class CommonException extends HomeinnsException {

    public CommonException(CommonEnum commonEnum) {
        super(commonEnum.getCode(), commonEnum.getMessage());
    }

}
