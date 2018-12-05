package com.dataobject;

import lombok.Data;

/**
 * @author：linma
 * @date: 2018/12/4 9:32
 * @email: linma@homeinns.com
 **/
@Data
public class ClientDetailsDO {

    private String clientId;

    private String resourceIds;

    private String clientSecret;

    private String scope;

    private String authorizedGrantTypes;

    private String webServerRedirectUri;

    private String authorities;

    private Integer accessTokenValidity;

    private Integer refreshTokenValidity;

    private String additionalInformation;

    private String autoapprove;
}
