package org.gump.study.sproxy.jdk;

import org.gump.study.sproxy.jdk.impl.ReflectServiceImpl;

/**
 * @author yuyongjun
 * @date 2018/5/29 19:29
 */

public class TestProxy {

    public static void main(String[] args) {
        JDKProxy proxy = new JDKProxy();
        ReflectService reflectService = (ReflectService) proxy.bind(new ReflectServiceImpl());
        reflectService.sayHello("LiSi");



    }




}
