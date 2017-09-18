package com.xuxiao.designpattern.proxy.demo;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: RailwayStation
 * @Description: 火车站（真实主题）
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 14:22 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class RailwayStation implements TicketManager{
    private static transient LogOut log = new LogOut();
    @Override
    public void sellTicket() {
        log.info("火车站售卖火车票！");
    }
}
