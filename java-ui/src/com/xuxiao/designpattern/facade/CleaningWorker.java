package com.xuxiao.designpattern.facade;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/6 Asiainfo
 * @ClassName: CleaningWorker
 * @Description: 保洁（餐后清理）
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/6 16:28 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/6     xuxiao          v1.1.0               修改原因
 */
public class CleaningWorker {
    private static transient LogOut log = new LogOut();
    public void clean(){
        log.info("保洁清理用餐后的饭桌！");
    }
}
