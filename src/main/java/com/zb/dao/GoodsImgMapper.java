package com.zb.dao;

import com.zb.entity.GoodsImg;
import com.zb.entity.GoodsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsImgMapper {
    int countByExample(GoodsImgExample example);

    int deleteByExample(GoodsImgExample example);

    int deleteByPrimaryKey(Integer goodsImgId);

    int insert(GoodsImg record);

    int insertSelective(GoodsImg record);

    List<GoodsImg> selectByExample(GoodsImgExample example);

    GoodsImg selectByPrimaryKey(Integer goodsImgId);

    int updateByExampleSelective(@Param("record") GoodsImg record, @Param("example") GoodsImgExample example);

    int updateByExample(@Param("record") GoodsImg record, @Param("example") GoodsImgExample example);

    int updateByPrimaryKeySelective(GoodsImg record);

    int updateByPrimaryKey(GoodsImg record);
}