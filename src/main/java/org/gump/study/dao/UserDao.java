package org.gump.study.dao;

import org.gump.study.pojo.User;

/**
 * @author yuyongjun
 * @date 2018/4/26 16:02
 */

public interface UserDao {

    User getUser(Long id);


    int insertUser(String name);


    int deleteById(Long id);


}
