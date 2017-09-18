package com.xuxiao.designpattern.facade;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Waiter
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 16:27 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Waiter {
    private static transient LogOut log = new LogOut();
    public void order(){
        log.info("服务员点菜！");
    }
}
