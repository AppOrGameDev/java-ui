package com.xuxiao.designpattern.builder;

/**
 * Copyright: Copyright (c) 2017/9/5 Asiainfo
 * @ClassName: Director
 * @Description: 导演
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/5 10:21 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/5     xuxiao          v1.1.0               修改原因
 */
public class Director {
    private Builder builder;
    public Director() {
    }
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各个零件建造方法,比如产品的生产顺序等
     */
    public void construct(){
        if(builder!=null){
            /**
             * 零件组装流程
             */
            builder.buildPart1();
            builder.buildPart2();
        }else{
            throw new NullPointerException("Director中的builder为空，不能建造产品!!!");
        }
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
