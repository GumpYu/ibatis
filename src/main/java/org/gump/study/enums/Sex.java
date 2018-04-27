package org.gump.study.enums;

/**
 * @author yuyongjun
 * @date 2018/4/27 14:38
 */

public enum Sex {

    MALE(1, "male"),
    FEMALE(2, "female");

    private int code;
    private String desc;

    Sex(int code,String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
