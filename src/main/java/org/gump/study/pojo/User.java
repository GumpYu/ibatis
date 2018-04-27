package org.gump.study.pojo;

import java.io.Serializable;

/**
 * @author yuyongjun
 * @date 2018/4/26 15:57
 */

public class User implements Serializable {

    private Long id;
    private String name;
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
