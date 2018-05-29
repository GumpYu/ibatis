package org.gump.study.dao;

import org.apache.ibatis.annotations.Param;
import org.gump.study.pojo.Role;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/5/28 11:53
 */

public interface RoleDao {

    Role getRole(Long id);

    List<Role> findRoles(@Param("roleName") String roleName);

    Long insertRole(Role role);

}
