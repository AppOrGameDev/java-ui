package com.xuxiao.designpattern.builder.demo;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 *
 * @ClassName: Builder
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 14:33
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public interface Builder {
    /**
     * 发送信息
     */
    public Email send();

    public void buildTopic();
    public void buildMessage();
    public void buildSender();
    public void buildReceiver();
    public void buildCopyRecipients();
}
