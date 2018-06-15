package com.gsdxsys.entity;

//商品类型 实体(类)
public class GoodsType {
	private int id;//商品类型ID
	private String name;//商品类型名称
	
	//获取商品类型ID
	public int getId() {
		return id;
	}
	
	//修改商品类型ID
	public void setId(int id) {
		this.id = id;
	}
	
	//获取商品类型名称
	public String getName() {
		return name;
	}
	
	//修改商品类型名称
	public void setName(String name) {
		this.name = name;
	}

	

}
