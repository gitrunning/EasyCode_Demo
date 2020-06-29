package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 组织用户关联(UserOrgJob)实体类
 * @since 2020-06-28 14:36:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrgJob implements Serializable {
    private static final long serialVersionUID = -57483853984403650L;
    /**
    * ID
    */
    private String id;
    /**
    * 岗位ID
    */
    private String jobId;
    
    private String userOrgId;
    
    private String createUser;
    
    private Date createTime;
    
    private String modifyUser;
    
    private Date modifyTime;


}