package org.gump.study.dao;

import org.gump.study.pojo.User;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/4/26 16:02
 */

public interface UserDao {

    User getUser(Long id);


    int insertUser(User user);


    int deleteById(Long id);

    List<User> getUserInfo(String name);

    int countFirstName(String firstName);


}
