package com.xuxiao.designpattern.proxy.dynamicproxy.interceptor.impl;

import com.xuxiao.designpattern.LogOut;
import com.xuxiao.designpattern.proxy.dynamicproxy.interceptor.IInterceptor;
import com.xuxiao.designpattern.proxy.dynamicproxy.interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: LogInterceptor
 * @Description: 日志拦截器
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 15:41 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class LogInterceptor extends Interceptor{
    private static transient LogOut log = new LogOut();
    public LogInterceptor() {
        super();
    }

    public LogInterceptor(IInterceptor interceptor) {
        super(interceptor);
    }

    @Override
    public void beforeInvoke(Object proxy, Method method, Object[] args) throws Exception {
        log.info("日志拦截器前置任务");
        super.beforeInvoke(proxy, method, args);
    }

    @Override
    public void afterInvoke(Object proxy, Method method, Object[] args) throws Exception {
        super.afterInvoke(proxy, method, args);
        log.info("日志拦截器后置任务");
    }
}
