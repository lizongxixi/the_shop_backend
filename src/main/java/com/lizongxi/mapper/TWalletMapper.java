package com.lizongxi.mapper;

import com.lizongxi.pojo.TWallet;

public interface TWalletMapper {
    int deleteByPrimaryKey(Long tuwId);

    int insert(TWallet record);

    int insertSelective(TWallet record);

    TWallet selectByPrimaryKey(Long tuwId);

    int updateByPrimaryKeySelective(TWallet record);

    int updateByPrimaryKey(TWallet record);
}