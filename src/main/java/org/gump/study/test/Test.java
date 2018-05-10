package org.gump.study.test;

import org.gump.study.pojo.User;

import java.lang.reflect.Constructor;

/**
 * @author yuyongjun
 * @date 2018/5/10 19:53
 */

public class Test {

    public static void main(String[] args) throws Exception{

        Constructor constructor = User.class.getDeclaredConstructor();
        System.out.println(constructor);
    }

}
