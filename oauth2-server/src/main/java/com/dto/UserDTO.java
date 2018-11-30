package com.dto;

import com.dataobject.UserDO;
import lombok.Data;
import lombok.NonNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author：linma
 * @date: 2018/11/26 15:39
 * @email: linma@homeinns.com
 **/
@Data
public class UserDTO implements UserDetails {

    /**
     * 具体用户账户详情
     */
    private UserDO userDO;

    /**
     * 用户权限
     */
    private List<String> permissions;

    /**
     * 用户角色
     */
    private List<String> roles;

    /**
     *
     * 加载用户配置和权限设置
     *
     * @param userDO
     * @param permissions
     */
    public UserDTO(@NonNull UserDO userDO, @NonNull List<String> permissions) {
        this.userDO = userDO;
        this.permissions = permissions;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return permissions.stream()
                .map(SimpleGrantedAuthority :: new)
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return userDO.getPassword();
    }

    @Override
    public String getUsername() {
        return userDO.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
