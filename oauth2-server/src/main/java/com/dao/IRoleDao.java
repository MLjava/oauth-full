package com.dao;

import com.dataobject.RoleDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author：linma
 * @date: 2018/11/26 16:48
 * @email: linma@homeinns.com
 **/
@Repository
public interface IRoleDao {

    /**
     * 根据用户查角色
     *
     * @param username
     * @return
     */
    List<RoleDO> findRolesByUsername(String username);
}
