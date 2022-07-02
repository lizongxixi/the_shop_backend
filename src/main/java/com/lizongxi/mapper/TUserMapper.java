package com.lizongxi.mapper;

import com.lizongxi.pojo.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Long tuId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long tuId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}