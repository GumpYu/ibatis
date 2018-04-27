package org.gump.study.controller;

import org.apache.ibatis.session.SqlSession;
import org.gump.study.dao.UserDao;
import org.gump.study.pojo.User;
import org.gump.study.utils.SqlSessionFactoryUtils;

import java.io.File;

/**
 * @author yuyongjun
 * @date 2018/4/26 16:28
 */

public class MybatisDemo {

    public static void main(String[] args) {


        System.out.println(new File(".").getAbsolutePath());


        try (SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();){
            UserDao rowMapper = sqlSession.getMapper(UserDao.class);
            User user = rowMapper.getUser(12L);
            System.out.println(user!=null?user.getName():null);
//            if (user != null) {
//               int deleteNum =  rowMapper.deleteById(6L);
//               sqlSession.commit();
//                System.out.println(deleteNum);
//            }
        }
//        try (SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();){
//            UserDao rowMapper = sqlSession.getMapper(UserDao.class);
//            int row = rowMapper.insertUser("LiSiXXX");
//            sqlSession.commit();
//            System.out.println(row);
//        }

//            SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
//            UserDao rowMapper = sqlSession.getMapper(UserDao.class);
//            int row = rowMapper.insertUser("ZhangSanFeng");
//
//            sqlSession.commit();
//            System.out.println(row);

//        if (sqlSession != null) {
//            sqlSession.close();
//        }



    }


}
