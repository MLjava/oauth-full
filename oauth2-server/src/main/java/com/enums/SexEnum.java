package com.enums;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/27 8:51
 * @email: linma@homeinns.com
 **/
@Getter
public enum SexEnum {

    /**
     * 男性
     */
    MALE(0, "男"),

    /**
     * 女性
     */
    FEMALE(1, "女"),

    /**
     * 非男女
     */
    NO_SETTING(2, "非男女");

    private Integer code;

    private String sex;

    SexEnum(Integer code, String sex) {
        this.code = code;
        this.sex = sex;
    }
}
