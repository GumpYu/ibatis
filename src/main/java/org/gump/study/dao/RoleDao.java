package org.gump.study.dao;

import org.gump.study.pojo.Role;

/**
 * @author yuyongjun
 * @date 2018/5/28 11:53
 */

public interface RoleDao {

    Role getRole(Long id);

    Long insertRole(Role role);

}
