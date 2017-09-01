package com.xuxiao.designpattern.abstractfactory.factory;

import com.xuxiao.designpattern.abstractfactory.product.IProduct;

/**
 * Copyright: Copyright (c) 2017/8/29 Asiainfo
 *
 * @ClassName: IFactory
 * @Description: 工厂接口
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/8/29 16:08
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/8/29     xuxiao          v1.1.0               修改原因
 */
public interface IFactory {
    /**
     * 普通新建实例
     * @return
     */
    IProduct generator();

    /**
     * 单例模式新建实例
     * @return
     */
    IProduct genSingle();
}
