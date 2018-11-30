package com.security;

import com.dataobject.UserDO;
import com.dto.UserDTO;
import com.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * @author：linma
 * @date: 2018/11/30 16:29
 * @email: linma@homeinns.com
 **/
@Component
public class HomeinnsAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private IUserService userService;

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        UserDTO userDTO = (UserDTO) userService.loadUserByUsername(username);
        if (userDTO == null) {
            throw new BadCredentialsException("Username not found.");
        }
        return new UsernamePasswordAuthenticationToken(userDTO, password);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
