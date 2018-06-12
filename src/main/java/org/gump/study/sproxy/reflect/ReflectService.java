package org.gump.study.sproxy.reflect;

import java.lang.reflect.Method;

/**
 * @author yuyongjun
 * @date 2018/5/29 18:06
 */

public class ReflectService {

    public void sayHello(String name) {
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) throws Exception {
        Object serice = Class.forName(ReflectService.class.getName()).newInstance();
        Method method = serice.getClass().getMethod("sayHello", String.class);
        method.invoke(serice, "ZhanSan");
    }


}
