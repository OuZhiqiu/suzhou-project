package com.hk.myspringboot.goods.service;

import com.hk.myspringboot.goods.dao.GoodsMapper;
import com.hk.myspringboot.goods.entity.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    public List<GoodsEntity> queryUserList() {
        return goodsMapper.selectAll();
    }


}
