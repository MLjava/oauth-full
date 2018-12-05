package com.dao;

import com.dataobject.ClientDetailsDO;
import org.springframework.stereotype.Repository;

/**
 * @author：linma
 * @date: 2018/12/4 9:39
 * @email: linma@homeinns.com
 **/
@Repository
public interface IClientDetailsDao {

    /**
     * 根据client查询clientDetails信息
     *
     * @param clientId
     * @return
     */
    ClientDetailsDO findClientDetailsByClientId(String clientId);

}
