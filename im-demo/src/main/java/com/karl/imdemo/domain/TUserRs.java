package com.karl.imdemo.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_user_rs
 * @author 
 */
@Data
public class TUserRs implements Serializable {
    private Integer id;

    private Integer reqUserId;

    private Integer fUserId;

    private Date createTime;

    private String fUserRscol;

    private String tUserRscol;

    private static final long serialVersionUID = 1L;
}