package org.gump.study.dao;

import org.gump.study.pojo.FemaleHealth;

/**
 * @author yuyongjun
 * @date 2018/5/28 17:54
 */

public interface FemaleStudentDao {

    FemaleHealth findStudentHealthFemaleByStuId(Long stuId);

}
