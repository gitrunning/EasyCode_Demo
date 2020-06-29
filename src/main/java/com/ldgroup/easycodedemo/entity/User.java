package com.ldgroup.easycodedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户(User)实体类
 * @since 2020-06-28 14:35:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 269433823226071815L;
    /**
    * 用户ID
    */
    private String id;
    /**
    * 员工工号
    */
    private String code;
    /**
    * 员工姓名
    */
    private String name;
    /**
    * 电话
    */
    private String phone;
    /**
    * 邮箱地址
    */
    private String email;
    /**
    * 钉钉ID
    */
    private String dingdingId;
    /**
    * 微信ID
    */
    private String wechatId;
    /**
    * 状态 1. 启用 2. 禁用
    */
    private Integer status;
    /**
    * 出生日期
    */
    private Date birthday;
    /**
    * 性别 1. 男 2. 女
    */
    private Integer sex;
    /**
    * 人员类型 1. 内部人员 2. 外包人员 
    */
    private Integer type;
    /**
    * 删除状态: 1.存在 0删除
    */
    private Integer deleted;
    /**
    * 员工id, 字母, 如果存在后面用数字递增, 例如, zhangsan, zhangsan1, zhangsan2
    */
    private String employeeId;
    /**
    * 身份证号
    */
    private String identity;
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