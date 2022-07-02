package com.lizongxi.mapper;

import com.lizongxi.pojo.TOrderinfo;

public interface TOrderinfoMapper {
    int deleteByPrimaryKey(Long toiId);

    int insert(TOrderinfo record);

    int insertSelective(TOrderinfo record);

    TOrderinfo selectByPrimaryKey(Long toiId);

    int updateByPrimaryKeySelective(TOrderinfo record);

    int updateByPrimaryKey(TOrderinfo record);
}