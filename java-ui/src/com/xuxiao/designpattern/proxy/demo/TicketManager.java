package com.xuxiao.designpattern.proxy.demo;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 *
 * @ClassName: TicketManager
 * @Description: 虚拟主题（票务售卖）
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 14:20
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public interface TicketManager {
    /**
     * 卖票
     */
    public void sellTicket();
}
