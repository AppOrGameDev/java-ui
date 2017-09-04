package com.xuxiao.designpattern.singleton;

/**
 * Copyright: Copyright (c) 2017/9/4 Asiainfo
 * @ClassName: WeekExt
 * @Description: 枚举类扩展属性和方法
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/4 19:49 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/4     xuxiao          v1.1.0               修改原因
 */
public enum WeekExt {
    MON("星期一","Monday","Mon"),
    TUE("星期二","Tuesday","Tue"),
    WED("星期三","Wednesday","Wed"),
    THU("星期四","Thursday","Thu"),
    FRI("星期五","Friday","Fri"),
    SAT("星期六","Saturday","Sat"),
    SUN("星期天","Sunday","Sun");

    /**
     * 中文
     */
    private String chn;
    /**
     * 英文
     */
    private String eng;
    /**
     * 英文简写
     */
    private String Smp;

    WeekExt(String chn, String eng, String smp) {
        this.chn = chn;
        this.eng = eng;
        Smp = smp;
    }

    public String getChn() {
        return chn;
    }

    public String getEng() {
        return eng;
    }

    public String getSmp() {
        return Smp;
    }

    @Override
    public String toString() {
        return new StringBuffer().append(chn).append(",").append(eng).append(",").append(Smp).toString();
    }
}
