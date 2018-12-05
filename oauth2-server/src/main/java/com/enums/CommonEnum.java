package com.enums;

import com.constant.CommonConstant;
import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/12/5 13:13
 * @email: linma@homeinns.com
 **/
@Getter
public enum CommonEnum {

    /**
     * 公共异常
     */
    DATA_NOT_FOUND(CommonConstant.ERROR, "数据没有查询到！");

    private Integer code;

    private String message;

    CommonEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
