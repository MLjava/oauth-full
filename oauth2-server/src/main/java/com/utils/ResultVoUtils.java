package com.utils;

import com.constant.CommonConstant;
import com.exceptions.HomeinnsException;
import com.vo.ResultVO;

/**
 * @author：linma
 * @date: 2018/11/26 16:36
 * @email: linma@homeinns.com
 **/
public class ResultVoUtils {

    private ResultVoUtils() {}

    public static ResultVO<HomeinnsException> failure(HomeinnsException e) {
        ResultVO<HomeinnsException> resultVO = new ResultVO<>();
        resultVO.setCode(e.getCode());
        resultVO.setMessage(e.getMessage());
        return resultVO;
    }

    public static ResultVO<Object> success(Object data) {
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setCode(CommonConstant.OK);
        resultVO.setMessage(CommonConstant.Message.OK_MESSAGE);
        resultVO.setData(data);
        return resultVO;
    }
}
