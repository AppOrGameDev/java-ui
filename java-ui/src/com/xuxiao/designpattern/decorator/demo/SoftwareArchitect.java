package com.xuxiao.designpattern.decorator.demo;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: SoftwareArchitect
 * @Description: 软件架构师
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 13:58 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class SoftwareArchitect extends Decorator{
    private static transient LogOut log = new LogOut();
    public SoftwareArchitect(Programmer programmer) {
        super(programmer);
    }

    @Override
    public void coding() {
        super.coding();
        log.info("软件架构师写代码，搭建系统骨架！");
    }
}
