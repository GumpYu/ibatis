package org.gump.study.pojo;

/**
 * @author yuyongjun
 * @date 2018/5/28 15:29
 */

public class Course {

    private Long id;
    private String courseName;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
