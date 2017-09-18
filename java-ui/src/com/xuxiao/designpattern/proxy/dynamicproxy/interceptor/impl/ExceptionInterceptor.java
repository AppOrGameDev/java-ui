package com.xuxiao.designpattern.proxy.dynamicproxy.interceptor.impl;

import com.xuxiao.designpattern.LogOut;
import com.xuxiao.designpattern.proxy.dynamicproxy.interceptor.IInterceptor;
import com.xuxiao.designpattern.proxy.dynamicproxy.interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * Copyright: Copyright (c) 2017/7/14 Asiainfo
 * @ClassName: ExceptionInterceptor
 * @Description: 异常拦截器
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/7/14 11:22 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/7/14     xuxiao          v1.1.0               修改原因
 */
public class ExceptionInterceptor extends Interceptor {
    private static transient LogOut log = new LogOut();

    public ExceptionInterceptor() {
    }

    public ExceptionInterceptor(IInterceptor interceptor) {
        super(interceptor);
    }

    @Override
    public void beforeInvoke(Object proxy, Method method, Object[] args) throws Exception {
        // 链式创建连接器时，谁在先就先执行谁的拦截方法
        log.info("异常拦截器前置任务");
        super.beforeInvoke(proxy,method,args);
    }

    @Override
    public void afterInvoke(Object proxy, Method method, Object[] args) throws Exception {
        super.afterInvoke(proxy,method,args);
        log.info("异常拦截器后置任务");
        // 扩展
    }

}
