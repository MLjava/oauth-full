package com.dataobject;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author：linma
 * @date: 2018/11/26 16:51
 * @email: linma@homeinns.com
 **/
@Data
public class PermissionDO implements Serializable {

    private String id;

    private Date createTime;

    private Date updateTime;

    private String permission;
}
