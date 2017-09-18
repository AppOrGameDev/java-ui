package com.xuxiao.designpattern.proxy.dynamicproxy.interceptor;

import com.xuxiao.designpattern.LogOut;

import java.lang.reflect.Method;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Interceptor
 * @Description: 装饰器模式（给出拦截器的平庸实现）
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 15:42 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Interceptor implements IInterceptor{
    private static transient LogOut log = new LogOut();
    protected IInterceptor interceptor = null;

    public Interceptor() {
    }

    public Interceptor(IInterceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    public void beforeInvoke(Object proxy, Method method, Object[] args) throws Exception {
        // TODO: 2017/7/14  链式创建连接器时，谁在先就先执行谁的拦截方法
        if(this.interceptor!=null){
            this.interceptor.beforeInvoke(proxy,method,args);
        }
    }

    @Override
    public void afterInvoke(Object proxy, Method method, Object[] args) throws Exception {
        if(this.interceptor!=null){
            this.interceptor.afterInvoke(proxy,method,args);
        }
    }

    @Override
    public void acceptExceptionHandler(Object proxy, Method method, Throwable targetEx) throws Exception {
    }
}
