package com.vo;

import lombok.Data;

/**
 * @author：linma
 * @date: 2018/11/26 16:35
 * @email: linma@homeinns.com
 **/
@Data
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;
}
