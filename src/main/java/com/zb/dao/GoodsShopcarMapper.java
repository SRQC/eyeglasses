package com.zb.dao;

import com.zb.entity.GoodsShopcar;
import com.zb.entity.GoodsShopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsShopcarMapper {
    int countByExample(GoodsShopcarExample example);

    int deleteByExample(GoodsShopcarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsShopcar record);

    int insertSelective(GoodsShopcar record);

    List<GoodsShopcar> selectByExample(GoodsShopcarExample example);

    GoodsShopcar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsShopcar record, @Param("example") GoodsShopcarExample example);

    int updateByExample(@Param("record") GoodsShopcar record, @Param("example") GoodsShopcarExample example);

    int updateByPrimaryKeySelective(GoodsShopcar record);

    int updateByPrimaryKey(GoodsShopcar record);
}