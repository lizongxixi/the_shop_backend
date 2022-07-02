package com.lizongxi.mapper;

import com.lizongxi.pojo.TUserAddr;

public interface TUserAddrMapper {
    int deleteByPrimaryKey(Long tuaId);

    int insert(TUserAddr record);

    int insertSelective(TUserAddr record);

    TUserAddr selectByPrimaryKey(Long tuaId);

    int updateByPrimaryKeySelective(TUserAddr record);

    int updateByPrimaryKey(TUserAddr record);
}