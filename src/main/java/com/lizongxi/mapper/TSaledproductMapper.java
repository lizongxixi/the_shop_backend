package com.lizongxi.mapper;

import com.lizongxi.pojo.TSaledproduct;

public interface TSaledproductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TSaledproduct record);

    int insertSelective(TSaledproduct record);

    TSaledproduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TSaledproduct record);

    int updateByPrimaryKey(TSaledproduct record);
}