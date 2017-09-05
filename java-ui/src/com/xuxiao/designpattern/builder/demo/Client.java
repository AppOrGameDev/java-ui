package com.xuxiao.designpattern.builder.demo;

import com.xuxiao.designpattern.LogOut;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: Client
 * @Description: 客户端
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 14:14 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class Client {
    private static LogOut log = new LogOut();
    public static void main(String[] args) {
        EmailSys emailSys = new EmailSys(new WelcomeEmailBuilder(new WelcomeEmail()));
        emailSys.construct();
        Email welcomeEmail = emailSys.getBuilder().send();
        log.info(welcomeEmail.toString());
        emailSys.setBuilder(new GoodbyeEmailBuilder(new GoodbyeEmail()));
        emailSys.construct();
        Email goodbyeEmail = emailSys.getBuilder().send();
        log.info(goodbyeEmail.toString());
    }
}
