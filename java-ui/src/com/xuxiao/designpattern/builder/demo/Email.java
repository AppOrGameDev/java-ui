package com.xuxiao.designpattern.builder.demo;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: Emial
 * @Description: 电子邮件 产品
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 11:25 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class Email {
    /**
     * 主题
     */
    private String topic;
    /**
     * 信息
     */
    private String message;
    /**
     * 发件人
     */
    private String sender;
    /**
     * 收件人
     */
    private String receiver;
    /**
     * 抄送人
     */
    private String copyRecipients;

    public Email() {
    }

    public Email(String topic, String message, String sender, String receiver, String copyRecipients) {
        this.topic = topic;
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.copyRecipients = copyRecipients;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getCopyRecipients() {
        return copyRecipients;
    }

    public void setCopyRecipients(String copyRecipients) {
        this.copyRecipients = copyRecipients;
    }

    @Override
    public String toString() {
        return "Emial{" +
                "topic='" + topic + '\'' +
                ", message='" + message + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", copyRecipients='" + copyRecipients + '\'' +
                '}';
    }
}
