package com.xuxiao.designpattern.proxy.demo;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: RailwayTicketAgency
 * @Description: 火车票代售点
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 14:25 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class RailwayTicketAgency implements TicketManager{
    private static transient LogOut log = new LogOut();
    private TicketManager ticketManager;

    public RailwayTicketAgency(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    @Override
    public void sellTicket() {
        if (ticketManager != null) {
            ticketManager.sellTicket();
            log.info("火车票代售点代理售票");
        }
    }
}
