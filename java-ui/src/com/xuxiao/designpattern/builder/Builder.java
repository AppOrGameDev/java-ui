package com.xuxiao.designpattern.builder;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 *
 * @ClassName: Builder
 * @Description: 抽象建造者角色
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 10:20
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public interface Builder {
    /**
     * 规范产品各个零件的建造过程，接口独立于应用程序的商业逻辑
     */
    /**
     * 抽象产品零件1建造过程
     */
    public void buildPart1();
    /**
     * 抽象产品零件2建造过程
     */
    public void buildPart2();
    /**
     * 抽象产品建造过程
     * @return
     */
    public Product retrieveResult();
}
