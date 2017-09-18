package com.xuxiao.designpattern.decorator.demo;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Hacker
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 13:55 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Hacker extends Decorator{
    private static transient LogOut log = new LogOut();
    public Hacker(Programmer programmer) {
        super(programmer);
    }

    @Override
    public void coding() {
        super.coding();
        log.info("黑客写代码，可以攻破系统！");
    }
}
