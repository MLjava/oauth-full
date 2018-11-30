package com.config;

import com.exceptions.HomeinnsException;
import com.utils.ResultVoUtils;
import com.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.List;
import java.util.Set;

/**
 * @author：linma
 * @date: 2018/11/26 16:33
 * @email: linma@homeinns.com
 **/
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理自定义异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(HomeinnsException.class)
    public ResultVO<HomeinnsException> handlerHomeinnsException(HomeinnsException e) {
        return ResultVoUtils.failure(e);
    }

    /**
     * 参数校验异常url
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(ValidationException.class)
    public ResultVO handleConstraintViolation(ValidationException exception) {
        ResultVO resultVO = new ResultVO();
        if (exception instanceof ConstraintViolationException) {
            ConstraintViolationException exs = (ConstraintViolationException) exception;
            Set<ConstraintViolation<?>> violations = exs.getConstraintViolations();
            for (ConstraintViolation<?> item : violations) {
                resultVO.setMessage(item.getMessage());
                resultVO.setCode(500);
                return resultVO;
            }
        }
        resultVO.setCode(500);
        resultVO.setMessage("请求错误！");
        return resultVO;
    }

    /**
     * 参数校验异常方法体内
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        ResultVO resultVO = new ResultVO();
        List<ObjectError> allErrors = e.getBindingResult().getAllErrors();
        for (ObjectError error : allErrors) {
            resultVO.setMessage(error.getDefaultMessage());
            resultVO.setCode(500);
            return resultVO;
        }
        resultVO.setCode(500);
        resultVO.setMessage("请求错误！");
        return resultVO;
    }

}
