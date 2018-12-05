package com.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class UserMappingHotelDO {

    private static final long serialVersionUID = -958701617337204974L;

    private Integer id;

    private Integer userId;

    private String username;

    private String hotelCd;

    private String hotelId;

    private String hotelName;

    private String brandCd;

    private String brandDesc;

    private String hotelJobId;

    private String hotelJobTitle;

    private Date createTime;

    private Date updateTime;

}