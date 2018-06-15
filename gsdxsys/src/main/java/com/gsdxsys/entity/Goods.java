package com.gsdxsys.entity;

//商品 实体(类)
public class Goods {
	private int goods_id;//商品ID
	private String goods_name;//商品名称
	private double goods_price;//商品价格
	private GoodsType goodstype;//商品类别
	private String goods_desc;//商品描述

	//获取商品ID
	public int getId() {
		return goods_id;
	}

	//修改商品ID
	public void setId(int id) {
		this.goods_id = id;
	}
	
	//获取商品名称
	public String getGoods_name() {
		return goods_name;
	}

	//修改商品名称
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	//获取商品价格
	public double getGoods_price() {
		return goods_price;
	}

	//修改商品价格
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}

	//获取商品类别
	public GoodsType getGoodstype() {
		return goodstype;
	}

	//修改商品类别
	public void setGoodstype(GoodsType goodstype) {
		this.goodstype = goodstype;
	}

	//获取商品描述
	public String getGoods_desc() {
		return goods_desc;
	}

	//修改商品描述
	public void setGoods_desc(String goods_desc) {
		this.goods_desc = goods_desc;
	}

}
