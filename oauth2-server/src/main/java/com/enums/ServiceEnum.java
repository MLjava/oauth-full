package com.enums;

import com.constant.CommonConstant;
import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/12/5 11:31
 * @email: linma@homeinns.com
 **/
@Getter
public enum ServiceEnum {

    /**
     * 酒店编号不可以位空
     */
    HOTEL_CODE_NOT_ALLOW_NULL(CommonConstant.ERROR,"酒店编号不可以位空!"),

    HOTEL_CODE_NOT_MATCH(CommonConstant.ERROR, "酒店编号不匹配！");

    private Integer code;

    private String message;

    ServiceEnum(Integer code, String message) {
        this.code = code;
    }
}
