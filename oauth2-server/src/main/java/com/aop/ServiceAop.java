package com.aop;

import com.enums.CommonEnum;
import com.exceptions.CommonException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author：linma
 * @date: 2018/11/29 9:57
 * @email: linma@homeinns.com
 **/
@Aspect
@Component
@Slf4j
public class ServiceAop {

    private long startTime;

    private long endTime;

    @Pointcut("execution(public * com.services.impl.*.get*(..))")
    private void services() { }

    @Before("services()")
    public void methodBefore(JoinPoint joinPoint) {
        startTime = System.currentTimeMillis();
    }

    @After("services()")
    public void methodAfter(JoinPoint joinPoint) {
        endTime = System.currentTimeMillis();
        log.info("查询使用：" + time(startTime, endTime));
    }

    /**
     * 统一返回数据处理
     *
     * @param joinPoint
     * @param result 得到参数返回值
     */
    @AfterReturning(pointcut = "services()", returning = "result")
    public void methodReturn(JoinPoint joinPoint, Object result) {
        if (result == null) {
            throw new CommonException(CommonEnum.DATA_NOT_FOUND);
        }
        if (result instanceof List<?>) {
            List<?> list = (List<?>) result;
            if (list.size() == 0) {
                throw new CommonException(CommonEnum.DATA_NOT_FOUND);
            }
        }
        if (result instanceof Map<?, ?>) {
            Map<?, ?> map = (Map<?, ?>) result;
            if (map.isEmpty()) {
                throw new CommonException(CommonEnum.DATA_NOT_FOUND);
            }
        }
    }

    private Long time(long startTime, long endTime) {
        return endTime - startTime;
    }

}