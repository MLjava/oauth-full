package com.dao;

import com.dataobject.PermissionDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author：linma
 * @date: 2018/11/26 16:45
 * @email: linma@homeinns.com
 **/
@Repository
public interface IPermissionDao {

    /**
     * 根据用户名字查询
     *
     * @param username
     * @return
     */
    List<PermissionDO> findPermissionByUsername(String username);

}
