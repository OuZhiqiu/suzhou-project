package com.hk.myspringboot.goods.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/*商品属性实体类*/
@Table(name = "t_goods")
@Data
public class GoodsEntity {
    @Id
    //商品编号
    private int id;
    //商品标题
    private String title;
    //商品详情描述
    private String content;
    //商品图片路径
    private String imagePath;
    //商品价格
    private float price;
}
