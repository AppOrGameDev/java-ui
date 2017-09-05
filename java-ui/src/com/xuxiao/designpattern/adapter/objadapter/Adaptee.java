package com.xuxiao.designpattern.adapter.objadapter;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: Adaptee
 * @Description: 需要适配到Target的类
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 20:39 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class Adaptee {
    private static transient LogOut log = new LogOut();
    public void specialRequest(){
        log.info("我是双孔插座");
    }
}
