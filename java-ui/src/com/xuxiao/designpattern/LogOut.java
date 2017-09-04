package com.xuxiao.designpattern;

import sun.rmi.runtime.Log;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;

/**
 * Copyright: Copyright (c) 2017/9/4 Asiainfo
 * @ClassName: LogOut
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: xuxiao
 * @date: 2017/9/4 20:03 
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2017/9/4     xuxiao          v1.1.0               修改原因
 */
public class LogOut extends Log {

    @Override
    public boolean isLoggable(Level level) {
        return false;
    }

    @Override
    public void log(Level level, String s) {

    }

    @Override
    public void log(Level level, String s, Throwable throwable) {

    }

    @Override
    public void setOutputStream(OutputStream outputStream) {

    }

    @Override
    public PrintStream getPrintStream() {
        return null;
    }

    public void info(String info){
        System.out.println(info);
    }
}
