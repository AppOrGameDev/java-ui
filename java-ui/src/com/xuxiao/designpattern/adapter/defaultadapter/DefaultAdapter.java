package com.xuxiao.designpattern.adapter.defaultadapter;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: DefaultAdapter
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 20:56 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class DefaultAdapter implements Target{
    private static transient LogOut log = new LogOut();
    @Override
    public void request() {
        log.info("默认适配器的平庸的具体实现");
    }
}
