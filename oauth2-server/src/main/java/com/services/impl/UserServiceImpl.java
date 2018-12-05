package com.services.impl;

import com.dao.IPermissionDao;
import com.dao.IUserDao;
import com.dataobject.PermissionDO;
import com.dataobject.UserDO;
import com.dto.UserDTO;
import com.enums.UserEnum;
import com.exceptions.UserException;
import com.services.IUserService;
import com.utils.StringUtils;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author：linma
 * @date: 2018/11/26 15:31
 * @email: linma@homeinns.com
 **/
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IPermissionDao permissionDao;

    /**
     * 获取用户
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)) {
            throw new UserException(UserEnum.USER_NOT_ALLOW_NULL);
        }
        /**
         * 开始验证密码和用户状态
         */
        UserDO user = userDao.findUserByUsername(username);
        if (user == null) {
            throw new UserException(UserEnum.USER_NOT_FOUND);
        }
        if (user.getLock().equals(1)) {
            throw new UserException(UserEnum.USER_IS_LOCKED);
        }
        if (user.getEnable().equals(1)) {
            throw new UserException(UserEnum.USER_IS_DISABLED);
        }
        return new UserDTO(user, getPermissionsByUsername(username));
    }

    /**
     * 查询用户权限
     *
     * @param username
     * @return
     */
    private List<String> getPermissionsByUsername(@NonNull String username) {
        List<PermissionDO> byUsername = permissionDao.findPermissionByUsername(username);
        if (byUsername == null || byUsername.size() == 0) {
            throw new UserException(UserEnum.PERMISSION_NOT_SETTING);
        }
        return byUsername
                .stream()
                .map(PermissionDO::getPermission)
                .collect(Collectors.toList());
    }

}
