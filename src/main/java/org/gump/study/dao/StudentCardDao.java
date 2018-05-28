package org.gump.study.dao;

import org.gump.study.pojo.StudentCard;

/**
 * @author yuyongjun
 * @date 2018/5/28 16:02
 */

public interface StudentCardDao {

    StudentCard findStudentCardByStudentId(Long studentId);

}
