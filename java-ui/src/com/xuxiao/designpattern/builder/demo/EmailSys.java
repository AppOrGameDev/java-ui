package com.xuxiao.designpattern.builder.demo;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: EmailSys
 * @Description: 电子邮件系统 导演角色
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 11:17 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class EmailSys {
    private Builder builder;


    public EmailSys(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        if (builder != null) {
            builder.buildSender();
            builder.buildReceiver();
            builder.buildCopyRecipients();
            builder.buildTopic();
            builder.buildMessage();
        }else {
            throw new NullPointerException("EmailSys中autoMessage为空，不能创建邮件");
        }
    }
}
