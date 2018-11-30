package com.enums;

import com.constant.CommonConstant;
import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/11/26 16:20
 * @email: linma@homeinns.com
 **/
@Getter
public enum UserEnum {

    /**
     * 用具不可以位空
     */
    USER_NOT_ALLOW_NULL(CommonConstant.ERROR, "用户不可以位空!"),

    USER_IS_LOCKED(CommonConstant.ERROR, "当前用户被锁定！"),

    USER_IS_DISABLED(CommonConstant.ERROR, "当前用户不可用！"),

    USER_NOT_FOUND(CommonConstant.ERROR, "当前用户不存在！"),

    PERMISSION_NOT_SETTING(CommonConstant.ERROR, "当前用户的权限没有配置！");

    UserEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;
}
