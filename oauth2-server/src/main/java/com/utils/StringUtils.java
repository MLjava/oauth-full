package com.utils;

import lombok.NonNull;

/**
 * @author：linma
 * @date: 2018/11/27 9:21
 * @email: linma@homeinns.com
 *
 * 对常用的工具类进行包装
 **/
public class StringUtils {

    /**
     * 判断字符串为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(@NonNull String str) {
        return org.springframework.util.StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串不为空
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(@NonNull String str) {
        return !isEmpty(str);
    }

}
