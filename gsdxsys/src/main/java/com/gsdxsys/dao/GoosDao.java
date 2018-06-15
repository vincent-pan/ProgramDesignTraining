package com.gsdxsys.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsdxsys.entity.Goods;

public interface GoosDao {
    public List<Goods> selectAll(SqlSession session);//显示全部商品？
    public List<Goods> selectById(SqlSession session);//显示特定商品？
    public int insertGoods(SqlSession session,Goods goods);//插入商品
    public int updateGoods(SqlSession session,Goods goods);//更新商品
    public int deleteGoods(SqlSession session,Goods goods);//删除商品
    
}
