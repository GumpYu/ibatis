package org.gump.study.objectfactory;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author yuyongjun
 * @date 2018/5/10 20:18
 */

public class MyObjectFactory extends DefaultObjectFactory {

    private final static Logger log = Logger.getLogger(MyObjectFactory.class.getName());

    @Override
    public <T> T create(Class<T> type) {
        log.info("使用定制对象工厂对create方法构建单个对象" +type);
        return super.create(type);
    }

    @Override
    public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
        log.info("使用定制对象工厂对create方法构建单个对象"+type+"  -->"+constructorArgTypes+" --->"+constructorArgs);
        return super.create(type, constructorArgTypes, constructorArgs);
    }

    @Override
    public void setProperties(Properties properties) {
        log.info("定制属性"+properties);
        super.setProperties(properties);
    }

    @Override
    protected Class<?> resolveInterface(Class<?> type) {
        return super.resolveInterface(type);
    }

    @Override
    public <T> boolean isCollection(Class<T> type) {
        return super.isCollection(type);
    }
}
