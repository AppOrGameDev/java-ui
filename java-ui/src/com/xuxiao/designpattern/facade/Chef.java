package com.xuxiao.designpattern.facade;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: Chef
 * @Description: 厨师做饭
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 16:27 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class Chef {
    private static transient LogOut log = new LogOut();
    public void cook(){
        log.info("厨师做一顿丰盛的饭菜！");
    }
}
