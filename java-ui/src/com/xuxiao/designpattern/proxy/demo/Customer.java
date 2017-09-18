package com.xuxiao.designpattern.proxy.demo;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Customer
 * @Description: 消费者
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 14:28 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Customer {
    private static transient LogOut log = new LogOut();
    public void buyTicket(){
        RailwayTicketAgency railwayTicketAgency = new RailwayTicketAgency(new RailwayStation());
        railwayTicketAgency.sellTicket();
        log.info("消费者买票");
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyTicket();
    }
}
