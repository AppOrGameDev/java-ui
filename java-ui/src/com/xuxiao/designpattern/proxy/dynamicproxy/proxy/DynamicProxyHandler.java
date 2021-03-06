package com.xuxiao.designpattern.proxy.dynamicproxy.proxy;

import com.xuxiao.designpattern.LogOut;
import com.xuxiao.designpattern.proxy.dynamicproxy.exception.AcceptableException;
import com.xuxiao.designpattern.proxy.dynamicproxy.interceptor.IInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Copyright: Copyright (c) 2017/7/14 Asiainfo
 * @ClassName: DynamicProxyHandler
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/7/14 11:16 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/7/14     xuxiao          v1.1.0               修改原因
 */
public class DynamicProxyHandler implements InvocationHandler {
    private static transient LogOut log = new LogOut();
    //拦截器
    private IInterceptor interceptor;
    //实际代理对象
    private Object proxyObj;

    public DynamicProxyHandler(Object proxyObj, IInterceptor interceptorList){
        this.proxyObj = proxyObj;
        this.interceptor = interceptorList;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(this.interceptor ==null){
            //没有拦截器
            return method.invoke(this.proxyObj,args);
        }
        log.info("执行拦截器前置方法:::");
        try{
            interceptor.beforeInvoke(this.proxyObj,method,args);
        }catch (Exception ex){
            // TODO: 2017/7/14 处理异常
            dealException(ex);
        }

        Object rtn = null;
        rtn = method.invoke(this.proxyObj,args);

        log.info("执行拦截器后置方法:::");
        try{
            interceptor.afterInvoke(this.proxyObj,method,args);
        }catch (Exception ex){
            // TODO: 2017/7/14 处理异常
            dealException(ex);
        }

        return rtn;
    }

    public void dealException(Exception ex) throws Exception {
        if(ex instanceof AcceptableException){
            log.info("AcceptableException Info:: "+ex.getMessage());
            ex.printStackTrace();
            // TODO: 2017/7/14 可接受异常的处理

        }else{
            // 不可接受异常
            log.info("ERROR Info:: "+ex.getMessage());
            ex.printStackTrace();
            throw ex;
        }
    }
}
