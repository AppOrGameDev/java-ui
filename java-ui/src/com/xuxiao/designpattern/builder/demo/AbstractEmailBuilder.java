package com.xuxiao.designpattern.builder.demo;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: AbstractBuilder
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 14:33 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public abstract class AbstractEmailBuilder implements Builder{
    /**
     * protected 作用域 详看public-protected-private作用域.jpg
     */
    protected Email email;

    public AbstractEmailBuilder(Email email) {
        this.email = email;
    }

    /**
     * 发送信息
     */
    @Override
    public Email send() {
        return email;
    }

    @Override
    public void buildSender() {
        email.setSender("发件人");
    }

    @Override
    public void buildReceiver() {
        email.setReceiver("收件人");
    }

    @Override
    public void buildCopyRecipients() {
        email.setCopyRecipients("抄送人");
    }
}
