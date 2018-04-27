package org.gump.study.controller;

import org.apache.ibatis.session.SqlSession;
import org.gump.study.dao.UserDao;
import org.gump.study.enums.Sex;
import org.gump.study.pojo.User;
import org.gump.study.utils.SqlSessionFactoryUtils;

import java.io.File;
import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/4/26 16:28
 */

public class MybatisDemo {

    public static void main(String[] args) {


        System.out.println(new File(".").getAbsolutePath());


        try (SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();){
            UserDao rowMapper = sqlSession.getMapper(UserDao.class);
            List<User> users = rowMapper.getUserInfo("Lisi");
            if(!users.isEmpty()){
                for (User user:users) {
                    System.out.println("Id "+user.getId()+" name "+user.getName()+" desc "+user.getDescription());
                }
            }
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

            SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
            UserDao rowMapper = sqlSession.getMapper(UserDao.class);
            User user = new User();
            user.setDescription("just for test one");
            user.setName("liss");
            user.setSex(Sex.FEMALE);
            int row = rowMapper.insertUser(user);

            sqlSession.commit();
            System.out.println(row);

//        if (sqlSession != null) {
//            sqlSession.close();
//        }



    }


}
