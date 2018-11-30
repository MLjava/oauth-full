package com.exceptions;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/26 15:35
 * @email: linma@homeinns.com
 **/
@Getter
public class HomeinnsException extends RuntimeException {

    private Integer code;

    public HomeinnsException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
