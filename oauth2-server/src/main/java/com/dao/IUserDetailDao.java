package com.dao;

import com.dataobject.UserDetailDO;
import org.springframework.stereotype.Repository;

/**
 * @author：linma
 * @date: 2018/11/29 13:36
 * @email: linma@homeinns.com
 **/
@Repository
public interface IUserDetailDao {

    /**
     * 根据用户id，查询用户详情
     *
     * @param userId
     * @return
     */
    UserDetailDO findUserDetailByUserId(String userId);

}
