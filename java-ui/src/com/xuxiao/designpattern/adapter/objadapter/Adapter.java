package com.xuxiao.designpattern.adapter.objadapter;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: Adapter
 * @Description: 将双孔插座转换成三孔插座的适配器
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 20:43 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class Adapter extends Adaptee implements Target {
    private static transient LogOut log = new LogOut();
    private Adaptee adaptee ;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        log.info("将双孔插座转换成三孔插座的适配器");
        if (adaptee == null) {
            adaptee.specialRequest();
        }
    }
}
