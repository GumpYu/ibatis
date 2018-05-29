package org.gump.study.controller;

import org.apache.ibatis.session.SqlSession;
import org.gump.study.dao.RoleDao;
import org.gump.study.dao.StudentDao;
import org.gump.study.dao.UserDao;
import org.gump.study.enums.Sex;
import org.gump.study.pojo.*;
import org.gump.study.utils.SqlSessionFactoryUtils;

import java.io.File;
import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/4/26 16:28
 */

public class MybatisDemo {

    public static void main(String[] args) {

        System.out.println("Database Id: "+SqlSessionFactoryUtils.getSqlSessionFactory().getConfiguration().getDatabaseId());


//        try (SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession()){
//            UserDao rowMapper = sqlSession.getMapper(UserDao.class);
//            List<User> users = rowMapper.getUserInfo("Li");
//            if(!users.isEmpty()){
//                for (User user:users) {
//                    System.out.println("Id "+user.getId()+" name "+user.getName()+" desc "+user.getDescription()+" sex "+user.getSex());
//                }
//            }
//
//            System.out.println("First Name Count: "+rowMapper.countFirstName("li"));
//            if (user != null) {
//               int deleteNum =  rowMapper.deleteById(6L);
//               sqlSession.commit();
//                System.out.println(deleteNum);
//            }
//        }

//        try (SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession()){
//            RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
//            System.out.println("Camel Case Test:"+roleDao.getRole(1L).getRoleName());

//            Role role = new Role();
//            role.setNote("sub admin manager");
//            role.setRoleName("Sub Administrator");
//            roleDao = sqlSession.getMapper(RoleDao.class);
//            roleDao.insertRole(role);
//            sqlSession.commit();
//            System.out.println(role.getId());

//            if (user != null) {
//               int deleteNum =  rowMapper.deleteById(6L);
//               sqlSession.commit();
//                System.out.println(deleteNum);
//            }
//        }

        try (SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession()){
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
            Student student =  studentDao.getStudent(1L);
            System.out.println("--------------------");
            System.out.println("Id ==>"+student.getId());
            System.out.println("Name ==>"+student.getName());
            System.out.println("Note ==>"+student.getNote());
            System.out.println("Gender ==>"+student.getGender());
            System.out.println("NativePlace ==>"+student.getStudentCard().getNativePlace());
            System.out.println("*********************");
//            for (StudentCourse sc : student.getStudentCourseList()) {
//                System.out.println("CourseName: "+sc.getCourse().getCourseName());
//                System.out.println("Note: "+sc.getCourse().getNote());
//            }
//            System.out.println("--------------------");
//            if(student.getStudentHealthFemales()!=null){
//                for (HealthIndex hi : student.getStudentHealthFemales()) {
//                    if(hi!=null){
//                        System.out.println("Womb: "+hi.getWomb());
//                        System.out.println("Prostate: "+hi.getProstate());
//                    }
//                }
//                System.out.println("--------------------");
//            }
//
//            if(student.getStudentHealthMales()!=null){
//                for (HealthIndex hi : student.getStudentHealthMales()) {
//                    if (hi != null) {
//                        System.out.println("Womb: "+hi.getWomb());
//                        System.out.println("Prostate: "+hi.getProstate());
//                    }
//                }
//                System.out.println("--------------------");
//            }

//            Role role = new Role();
//            role.setNote("sub admin manager");
//            role.setRoleName("Sub Administrator");
//            roleDao = sqlSession.getMapper(RoleDao.class);
//            roleDao.insertRole(role);
//            sqlSession.commit();
//            System.out.println(role.getId());

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
//            User user = new User();
//            user.setDescription("just for test one");
//            user.setName("lissxxxx1");
//            user.setSex(Sex.MALE.toString());
//            int row = rowMapper.insertUser(user);
//
//            sqlSession.commit();
//            System.out.println(row);

//        if (sqlSession != null) {
//            sqlSession.close();
//        }



    }


}
