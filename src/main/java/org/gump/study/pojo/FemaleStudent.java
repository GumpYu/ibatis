package org.gump.study.pojo;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/5/29 10:38
 */

public class FemaleStudent extends Student {

    private List<HealthIndex> studentHealthFemales = null;

    @Override
    public List<HealthIndex> getStudentHealthFemales() {
        return studentHealthFemales;
    }

    @Override
    public void setStudentHealthFemales(List<HealthIndex> studentHealthFemales) {
        this.studentHealthFemales = studentHealthFemales;
    }
}
