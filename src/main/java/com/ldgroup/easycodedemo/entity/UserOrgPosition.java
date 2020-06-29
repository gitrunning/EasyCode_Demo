package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户职位关联(UserOrgPosition)实体类
 * @since 2020-06-28 14:36:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrgPosition implements Serializable {
    private static final long serialVersionUID = -47384046375664748L;
    /**
    * ID
    */
    private String id;
    /**
    * 职位ID
    */
    private String positionId;
    
    private String userOrgId;
    
    private String createUser;
    
    private Date createTime;
    
    private String modifyUser;
    
    private Date modifyTime;


}