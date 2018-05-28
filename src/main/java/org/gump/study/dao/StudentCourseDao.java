package org.gump.study.dao;

import org.gump.study.pojo.StudentCourse;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/5/28 16:56
 */

public interface StudentCourseDao {

    List<StudentCourse> findStudentCourseByStuId(Long id);

}
