package com.hk.myspringboot.goods.dao;

import com.hk.myspringboot.goods.entity.GoodsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper extends tk.mybatis.mapper.common.Mapper<GoodsEntity> {

}
