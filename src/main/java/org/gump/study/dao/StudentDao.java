package org.gump.study.dao;

import org.apache.ibatis.annotations.Param;
import org.gump.study.pojo.Student;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/5/28 16:01
 */

public interface StudentDao {

    Student getStudent(Long id);

    List<Student> findStudents(@Param("ids") List<Long> ids);

}
