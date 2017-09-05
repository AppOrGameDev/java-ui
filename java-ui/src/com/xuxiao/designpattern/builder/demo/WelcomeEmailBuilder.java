package com.xuxiao.designpattern.builder.demo;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: WelcomeEmailBuilder
 * @Description: 欢迎信息发送类  builder的实现类
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 11:10 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class WelcomeEmailBuilder extends AbstractEmailBuilder{

    public WelcomeEmailBuilder(WelcomeEmail welcomeEmail) {
        super(welcomeEmail);
    }

    /**
     * 发送信息
     */
    @Override
    public Email send() {
        return email;
    }

    @Override
    public void buildTopic() {
        email.setTopic("欢迎！");
    }

    @Override
    public void buildMessage() {
        email.setMessage("欢迎！");
    }
}
