package com.oauth2;

import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author：linma
 * @date: 2018/12/3 16:31
 * @email: linma@homeinns.com
 **/
@Component
public class OAuth2ClientDetailsService extends JdbcClientDetailsService {

    public OAuth2ClientDetailsService(DataSource dataSource) {
        super(dataSource);
    }
}
