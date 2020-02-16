package com.karl.imdemo.domain;

import java.io.Serializable;

/**
 * t_user
 * @author 
 */
public class TUser implements Serializable {
    /**
     * 主键

     */
    private Integer id;

    private String name;

    private String nickName;

    /**
     * 座右铭
     */
    private String motto;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}