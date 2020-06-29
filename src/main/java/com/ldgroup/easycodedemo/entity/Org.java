package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 组织(Org)实体类
 * @since 2020-06-28 14:35:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Org implements Serializable {
    private static final long serialVersionUID = -35561910957588752L;
    /**
    * 组织ID
    */
    private String id;
    /**
    * 父组织ID
    */
    private String parentId;
    /**
    * 组织编号
    */
    private String code;
    /**
    * 组织名称
    */
    private String name;
    /**
    * 组织类型 1. 表示公司 2. 表示部门
    */
    private Integer type;
    /**
    * 备注
    */
    private String note;
    /**
    * 组织的类别 1. 外部组织 2. 内部组织 3. 分公司组织
    */
    private Integer category;
    /**
    * 创建人
    */
    private String createUser;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改人
    */
    private String modifyUser;
    /**
    * 修改时间
    */
    private Date modifyTime;


}