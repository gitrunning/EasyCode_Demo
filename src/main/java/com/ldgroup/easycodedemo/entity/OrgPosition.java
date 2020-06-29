package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 组织岗位关联(OrgPosition)实体类
 * @since 2020-06-28 14:35:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrgPosition implements Serializable {
    private static final long serialVersionUID = 473299379864949929L;
    
    private String id;
    /**
    * 组织ID
    */
    private String orgId;
    /**
    * 职位ID
    */
    private String positionId;
    
    private String createUser;
    
    private Date createTime;
    
    private String modifyUser;
    
    private Date modifyTime;


}