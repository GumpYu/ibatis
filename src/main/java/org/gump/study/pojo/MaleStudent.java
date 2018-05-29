package org.gump.study.pojo;

import java.util.List;

/**
 * @author yuyongjun
 * @date 2018/5/29 10:39
 */

public class MaleStudent extends Student {

    private List<HealthIndex> studentHealthMales = null;

    @Override
    public List<HealthIndex> getStudentHealthMales() {
        return studentHealthMales;
    }

    @Override
    public void setStudentHealthMales(List<HealthIndex> studentHealthMales) {
        this.studentHealthMales = studentHealthMales;
    }
}


