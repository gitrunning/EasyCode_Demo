package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 组织主管关联(OrgManager)实体类
 * @since 2020-06-28 14:35:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrgManager implements Serializable {
    private static final long serialVersionUID = 580310461626533724L;
    /**
    * ID
    */
    private String id;
    /**
    * 组织ID
    */
    private String orgId;
    /**
    * 用户ID
    */
    private String userId;
    /**
    * 主管的序号 1. 一级主管 2. 二级主管 以此类推 目前支持5级
    */
    private Integer level;
    
    private String createUser;
    
    private Date createTime;
    
    private String modifyUser;
    
    private Date modifyTime;


}