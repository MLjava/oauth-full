package com.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author：linma
 * @date: 2018/11/27 8:47
 * @email: linma@homeinns.com
 **/
@Data
public class UserDetailDO implements Serializable {

    private String id;

    private String userId;

    private String name;

    private Integer age;

    private String sex;

    private Date birthday;

    /**
     * 用户头像
     */
    private String icon;

    private Date createTime;

    private Date updateTime;

    private Integer flag;
}
