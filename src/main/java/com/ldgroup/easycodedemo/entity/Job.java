package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * 岗位(Job)实体类
 * @since 2020-06-28 14:35:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job implements Serializable {
    private static final long serialVersionUID = -72910066759827660L;
    /**
    * 岗位ID
    */
    private String id;
    /**
    * 岗位编号
    */
    private String code;
    /**
    * 岗位名称
    */
    private String name;
    /**
    * 岗位备注
    */
    private String note;
    /**
    * 是否归属所属组织1. 归属所有组织 0. 不归属于所有组织
    */
    private Integer belongAll;
    
    private String createUser;
    /**
    * 创建时间
    */
    private Date createTime;
    
    private String modifyUser;
    /**
    * 修改时间
    */
    private Date modifyTime;




}