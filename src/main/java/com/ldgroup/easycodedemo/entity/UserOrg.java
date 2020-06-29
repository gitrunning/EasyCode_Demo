package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (UserOrg)实体类
 * @since 2020-06-28 14:35:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrg implements Serializable {
    private static final long serialVersionUID = -50749117576223531L;
    
    private String id;
    
    private String userId;
    
    private String orgId;
    /**
    * 1直属人员 2协助人员
    */
    private Integer type;
    
    private String createUser;
    
    private Date createTime;
    
    private String modifyUser;
    
    private Date modifyTime;

}