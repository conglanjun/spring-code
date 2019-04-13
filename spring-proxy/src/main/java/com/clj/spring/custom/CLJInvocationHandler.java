package com.clj.spring.custom;

import java.lang.reflect.Method;

/**
 * User: conglanjun
 * Date: 2019/4/13
 * Time: 11:58
 * Description:
 */
public interface CLJInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
