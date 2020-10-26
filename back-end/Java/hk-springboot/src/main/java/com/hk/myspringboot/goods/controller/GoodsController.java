package com.hk.myspringboot.goods.controller;

import com.hk.myspringboot.config.appresult.AppResult;
import com.hk.myspringboot.config.appresult.AppResultBuilder;
import com.hk.myspringboot.config.appresult.ResultCode;
import com.hk.myspringboot.goods.entity.GoodsEntity;
import com.hk.myspringboot.goods.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/goods")
@RestController
@Slf4j
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 查询全部商品
     *
     * @author wangyanlei
     * @date 2020年10月11日 22:41:49
     */
    @RequestMapping("/list")
    public AppResult queryUserList() {
        System.out.println("+++++++++++++++++++进入查询全部商品的方法++++++++++++++++++++");
        List<GoodsEntity> list = goodsService.queryUserList();
        return AppResultBuilder.success(list, ResultCode.SUCCESS);
    }
}
