package com.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;

import javax.security.auth.Subject;
import java.util.Collection;

/**
 * @author：linma
 * @date: 2018/11/30 16:55
 * @email: linma@homeinns.com
 **/
@Slf4j
public class HomeinnsToken extends AbstractAuthenticationToken {

    private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

    public HomeinnsToken(Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        super.setAuthenticated(true);
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean implies(Subject subject) {
        return false;
    }
}
