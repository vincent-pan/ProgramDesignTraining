package com.gsdxsys.service;

import java.util.List;

import com.gsdxsys.entity.Goods;

public interface GoodsService {
	public int addGoods(Goods goods);//添加商品
	public List<Goods> getAll();//获取全部商品信息？

}
