package com.zb.dao;

import com.zb.entity.BannerImge;
import com.zb.entity.BannerImgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerImgeMapper {
    int countByExample(BannerImgeExample example);

    int deleteByExample(BannerImgeExample example);

    int deleteByPrimaryKey(Integer bIId);

    int insert(BannerImge record);

    int insertSelective(BannerImge record);

    List<BannerImge> selectByExample(BannerImgeExample example);

    BannerImge selectByPrimaryKey(Integer bIId);

    int updateByExampleSelective(@Param("record") BannerImge record, @Param("example") BannerImgeExample example);

    int updateByExample(@Param("record") BannerImge record, @Param("example") BannerImgeExample example);

    int updateByPrimaryKeySelective(BannerImge record);

    int updateByPrimaryKey(BannerImge record);
}