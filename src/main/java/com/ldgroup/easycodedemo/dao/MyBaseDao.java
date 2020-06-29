package com.ldgroup.easycodedemo.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MyBaseDao<T> extends Mapper<T>, MySqlMapper<T> {
}
