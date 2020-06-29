package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 职位(Position)实体类
 * @since 2020-06-28 14:35:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position implements Serializable {
    private static final long serialVersionUID = -95600351150229558L;
    /**
    * 职位ID
    */
    private String id;
    /**
    * 职位编号
    */
    private String code;
    /**
    * 职位名称
    */
    private String name;
    /**
    * 职位备注
    */
    private String note;
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