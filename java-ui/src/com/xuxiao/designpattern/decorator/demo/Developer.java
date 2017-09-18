package com.xuxiao.designpattern.decorator.demo;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Developer
 * @Description: 开发者（具体组件）
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 13:52 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Developer implements Programmer{
    private static transient LogOut log = new LogOut();
    @Override
    public void coding() {
        log.info("开发者写代码！！！");
    }
}
