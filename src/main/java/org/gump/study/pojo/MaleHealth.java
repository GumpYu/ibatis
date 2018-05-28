package org.gump.study.pojo;

/**
 * @author yuyongjun
 * @date 2018/5/28 15:37
 */

public class MaleHealth extends HealthIndex {

    private Long id;
    private String prostate;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }

}
