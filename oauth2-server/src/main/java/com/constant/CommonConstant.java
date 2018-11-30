package com.constant;

/**
 * @author：linma
 * @date: 2018/11/27 9:29
 * @email: linma@homeinns.com
 **/
public interface CommonConstant {

    /**
     * 请求成功码
     */
    Integer OK = 200;

    /**
     * 亲求失败码
     */
    Integer ERROR = 500;

    Integer PERMISSION_DENIED = 401;

    interface Message {

        String OK_MESSAGE = "请求成功！";

        String ERROR_MESSAGE = "请求失败！";

        String PERMISSION_DENIED_MESSAGE = "权限不足！";
    }
}
