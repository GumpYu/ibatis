package org.gump.study.sproxy.cglib;

import org.gump.study.sproxy.jdk.ReflectService;
import org.gump.study.sproxy.jdk.impl.ReflectServiceImpl;

/**
 * @author yuyongjun
 * @date 2018/5/30 10:29
 */

public class TestCglib {

    public static void main(String[] args) {
        ReflectServiceCglib cglib = new ReflectServiceCglib();
        ReflectService reflectService = (ReflectService) cglib.getInstance(new ReflectServiceImpl());

        reflectService.sayHello("Wangwu");
    }
}
