package org.gump.study.dao;

import org.gump.study.pojo.HealthIndex;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/5/28 17:54
 */

public interface FemaleStudentDao {

    List<HealthIndex> findStudentHealthFemaleByStuId(Long stuId);

}
