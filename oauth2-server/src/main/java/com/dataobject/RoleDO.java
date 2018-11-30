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
public class RoleDO implements Serializable {

    private String id;

    private Date createTime;

    private Date updateTime;

    private String role;

    private Integer flag;

}
