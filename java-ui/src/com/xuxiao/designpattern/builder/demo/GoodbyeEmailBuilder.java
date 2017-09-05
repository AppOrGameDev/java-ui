package com.xuxiao.designpattern.builder.demo;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: GoodbyeEmailBuilder
 * @Description: 再见信息发送类 builder的实现类
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 11:11 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class GoodbyeEmailBuilder extends AbstractEmailBuilder{

    public GoodbyeEmailBuilder(GoodbyeEmail goodbyeEmail) {
        super(goodbyeEmail);
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
        email.setTopic("再见！");
    }

    @Override
    public void buildMessage() {
        email.setMessage("再见！");
    }

}
