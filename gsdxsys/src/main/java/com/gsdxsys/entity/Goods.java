package com.gsdxsys.entity;

//��Ʒ ʵ��(��)
public class Goods {
	private int goods_id;//��ƷID
	private String goods_name;//��Ʒ����
	private double goods_price;//��Ʒ�۸�
	private GoodsType goodstype;//��Ʒ���
	private String goods_desc;//��Ʒ����

	//��ȡ��ƷID
	public int getId() {
		return goods_id;
	}

	//�޸���ƷID
	public void setId(int id) {
		this.goods_id = id;
	}
	
	//��ȡ��Ʒ����
	public String getGoods_name() {
		return goods_name;
	}

	//�޸���Ʒ����
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	//��ȡ��Ʒ�۸�
	public double getGoods_price() {
		return goods_price;
	}

	//�޸���Ʒ�۸�
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}

	//��ȡ��Ʒ���
	public GoodsType getGoodstype() {
		return goodstype;
	}

	//�޸���Ʒ���
	public void setGoodstype(GoodsType goodstype) {
		this.goodstype = goodstype;
	}

	//��ȡ��Ʒ����
	public String getGoods_desc() {
		return goods_desc;
	}

	//�޸���Ʒ����
	public void setGoods_desc(String goods_desc) {
		this.goods_desc = goods_desc;
	}

}
