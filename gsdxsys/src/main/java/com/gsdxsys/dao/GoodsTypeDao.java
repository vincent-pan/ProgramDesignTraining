package com.gsdxsys.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsdxsys.entity.Goods;
import com.gsdxsys.entity.GoodsType;

public interface GoodsTypeDao {
   public List<GoodsType> selectAll(SqlSession session);//显示全部商品类型
   public List<GoodsType> selectById(SqlSession session);//显示特定商品类型？
   public int insertGoodsType(SqlSession session,GoodsType goodsType);//插入商品类型
   public int updateGoodsType(SqlSession session,GoodsType goodsType);//更新商品类型
   public int deleteGoodsType(SqlSession session,GoodsType goodsType);//删除商品类型
}
