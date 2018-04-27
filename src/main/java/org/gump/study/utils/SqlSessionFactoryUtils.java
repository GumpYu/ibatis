package org.gump.study.utils;

import com.ibatis.common.resources.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.InputStream;

/**
 * @author yuyongjun
 * @date 2018/4/26 16:05
 */

public class SqlSessionFactoryUtils {

    private static SqlSessionFactory sqlSessionFactory = null;

    private static final byte[] byteObj = new byte[]{};

    private SqlSessionFactoryUtils() {}

    public static SqlSessionFactory getSqlSessionFactory() {
        String source = "SqlMapConfig.xml";
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(source);
        } catch (Exception e) {
            Logger.getLogger(SqlSessionFactoryUtils.class.getName()).log(Level.INFO, null, e);
        }

        synchronized (byteObj) {
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            }
        }

        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession() {
        if (sqlSessionFactory == null) {
            getSqlSessionFactory();
        }

        return sqlSessionFactory.openSession();
    }



}
