package com.dao;

import com.dataobject.UserDO;
import org.springframework.stereotype.Repository;

/**
 * @author：linma
 * @date: 2018/11/26 15:37
 * @email: linma@homeinns.com
 **/
@Repository
public interface IUserDao {

    /**
     * 根据用户名称
     *
     * @param username
     * @return
     */
    UserDO findUserByUsername(String username);

}
