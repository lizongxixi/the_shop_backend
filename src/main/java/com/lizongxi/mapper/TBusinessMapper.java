package com.lizongxi.mapper;

import com.lizongxi.pojo.TBusiness;

public interface TBusinessMapper {
    int deleteByPrimaryKey(Long tbsId);

    int insert(TBusiness record);

    int insertSelective(TBusiness record);

    TBusiness selectByPrimaryKey(Long tbsId);

    int updateByPrimaryKeySelective(TBusiness record);

    int updateByPrimaryKey(TBusiness record);
}