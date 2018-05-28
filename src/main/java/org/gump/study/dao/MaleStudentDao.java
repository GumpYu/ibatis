package org.gump.study.dao;

import org.gump.study.pojo.MaleHealth;

/**
 * @author yuyongjun
 * @date 2018/5/28 17:54
 */

public interface MaleStudentDao {

    MaleHealth findStudentHealthMaleByStuId(Long stuId);

}
