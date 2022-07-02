package com.lizongxi.mapper;

import com.lizongxi.pojo.TOrder;

public interface TOrderMapper {
    int deleteByPrimaryKey(Long toId);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Long toId);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
}