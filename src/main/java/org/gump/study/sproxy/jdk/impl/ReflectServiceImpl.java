package org.gump.study.sproxy.jdk.impl;

import org.gump.study.sproxy.jdk.ReflectService;

/**
 * @author yuyongjun
 * @date 2018/5/29 19:19
 */

public class ReflectServiceImpl implements ReflectService {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+name);
    }
}
