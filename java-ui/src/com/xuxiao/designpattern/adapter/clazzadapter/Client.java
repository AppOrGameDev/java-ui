package com.xuxiao.designpattern.adapter.clazzadapter;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: Client
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 20:46 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.request();
    }
}
