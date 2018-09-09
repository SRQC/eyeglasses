package com.zb.dao;

import com.zb.entity.StbArea;
import com.zb.entity.StbAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StbAreaMapper {
    int countByExample(StbAreaExample example);

    int deleteByExample(StbAreaExample example);

    int deleteByPrimaryKey(Short id);

    int insert(StbArea record);

    int insertSelective(StbArea record);

    List<StbArea> selectByExample(StbAreaExample example);

    StbArea selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") StbArea record, @Param("example") StbAreaExample example);

    int updateByExample(@Param("record") StbArea record, @Param("example") StbAreaExample example);

    int updateByPrimaryKeySelective(StbArea record);

    int updateByPrimaryKey(StbArea record);
}