package com.gsdxsys.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsdxsys.entity.Goods;

public interface GoosDao {
    public List<Goods> selectAll(SqlSession session);//��ʾȫ����Ʒ��
    public List<Goods> selectById(SqlSession session);//��ʾ�ض���Ʒ��
    public int insertGoods(SqlSession session,Goods goods);//������Ʒ
    public int updateGoods(SqlSession session,Goods goods);//������Ʒ
    public int deleteGoods(SqlSession session,Goods goods);//ɾ����Ʒ
    
}
