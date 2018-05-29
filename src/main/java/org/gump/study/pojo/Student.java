package org.gump.study.pojo;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/5/28 15:31
 */

public class Student {

    private Long id;
    private String name;
    private Integer gender;
    private StudentCard studentCard;
    private String note;
    private List<StudentCourse> studentCourseList;
    private List<HealthIndex> studentHealthFemales;
    private List<HealthIndex> studentHealthMales;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public StudentCard getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(StudentCard studentCard) {
        this.studentCard = studentCard;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<StudentCourse> getStudentCourseList() {
        return studentCourseList;
    }

    public void setStudentCourseList(List<StudentCourse> studentCourseList) {
        this.studentCourseList = studentCourseList;
    }

    public List<HealthIndex> getStudentHealthFemales() {
        return studentHealthFemales;
    }

    public void setStudentHealthFemales(List<HealthIndex> studentHealthFemales) {
        this.studentHealthFemales = studentHealthFemales;
    }

    public List<HealthIndex> getStudentHealthMales() {
        return studentHealthMales;
    }

    public void setStudentHealthMales(List<HealthIndex> studentHealthMales) {
        this.studentHealthMales = studentHealthMales;
    }
}
