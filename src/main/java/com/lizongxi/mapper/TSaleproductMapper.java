package com.lizongxi.mapper;

import com.lizongxi.pojo.TSaleproduct;

public interface TSaleproductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TSaleproduct record);

    int insertSelective(TSaleproduct record);

    TSaleproduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TSaleproduct record);

    int updateByPrimaryKey(TSaleproduct record);
}