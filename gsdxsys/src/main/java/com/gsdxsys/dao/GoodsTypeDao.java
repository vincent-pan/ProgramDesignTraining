package com.gsdxsys.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsdxsys.entity.Goods;
import com.gsdxsys.entity.GoodsType;

public interface GoodsTypeDao {
   public List<GoodsType> selectAll(SqlSession session);//��ʾȫ����Ʒ����
   public List<GoodsType> selectById(SqlSession session);//��ʾ�ض���Ʒ���ͣ�
   public int insertGoodsType(SqlSession session,GoodsType goodsType);//������Ʒ����
   public int updateGoodsType(SqlSession session,GoodsType goodsType);//������Ʒ����
   public int deleteGoodsType(SqlSession session,GoodsType goodsType);//ɾ����Ʒ����
}
