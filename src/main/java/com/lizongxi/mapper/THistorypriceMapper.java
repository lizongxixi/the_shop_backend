package com.lizongxi.mapper;

import com.lizongxi.pojo.THistoryprice;

public interface THistorypriceMapper {
    int deleteByPrimaryKey(Long thId);

    int insert(THistoryprice record);

    int insertSelective(THistoryprice record);

    THistoryprice selectByPrimaryKey(Long thId);

    int updateByPrimaryKeySelective(THistoryprice record);

    int updateByPrimaryKey(THistoryprice record);
}