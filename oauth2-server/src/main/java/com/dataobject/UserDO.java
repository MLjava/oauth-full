package com.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author：linma
 * @date: 2018/11/26 15:40
 * @email: linma@homeinns.com
 **/
@Data
public class UserDO implements Serializable {

    private String id;

    private String username;

    private String password;

    private Date updateTime;

    private Date createTime;

    private Integer flag;

    private Integer lock;

    /**
     * 用户可用状态
     * 0：可用
     * 1：不可用
     */
    private Integer enable;
}
