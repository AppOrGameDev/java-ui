package com.xuxiao.designpattern.proxy.dynamicproxy;

import com.xuxiao.designpattern.proxy.demo.RailwayStation;
import com.xuxiao.designpattern.proxy.demo.TicketManager;
import com.xuxiao.designpattern.proxy.dynamicproxy.factory.DynamicProxyFactory;
import com.xuxiao.designpattern.proxy.dynamicproxy.interceptor.impl.ExceptionInterceptor;
import com.xuxiao.designpattern.proxy.dynamicproxy.interceptor.impl.LogInterceptor;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Client
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 15:39 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Client {
    public static void main(String[] args) {
        TicketManager ticketManager = new RailwayStation();
        TicketManager proxyInstance = DynamicProxyFactory.getProxyInstance(ticketManager, new LogInterceptor(new ExceptionInterceptor()));
        proxyInstance.sellTicket();
        TicketManager proxyInstance1 = DynamicProxyFactory.getProxyInstance(new Class[]{TicketManager.class}, ticketManager, new LogInterceptor(new ExceptionInterceptor()));
        proxyInstance1.sellTicket();
    }
}
