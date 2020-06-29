package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 组织岗位关联(OrgJob)实体类
 * @since 2020-06-28 14:35:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrgJob implements Serializable {
    private static final long serialVersionUID = -54751399111054316L;
    
    private String id;
    /**
    * 组织ID
    */
    private String orgId;
    /**
    * 岗位ID
    */
    private String jobId;
    
    private String createUser;
    
    private Date createTime;
    
    private String modifyUser;
    
    private Date modifyTime;


}