package com.gsdxsys.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.gsdxsys.dao.GoosDao;
import com.gsdxsys.entity.Goods;
@Repository
public class GoodsDaoImpl  extends MybatisBaseDao implements GoosDao{

	//����ȫ����Ʒ��Ϣ������GoodsMapper�е�sql���
	@Override
	public List<Goods> selectAll(SqlSession session) {
		List<Goods> goodses= super.selectList(session, "GoodsMapper.selectAll");
		return goodses;
	}
	
	//�����ض���Ʒ��Ϣ������GoodsMapper�е�sql���
		@Override
		public List<Goods> selectById(SqlSession session) {
			List<Goods> goodses= super.selectList(session, "GoodsMapper.selectById");
			return goodses;
		}

	
	//������Ʒ��Ϣ������GoodsMapper�е�sql���
	@Override
	public int insertGoods(SqlSession session, Goods goods) {
	   int result=	super.insert(session, "GoodsMapper.inserGoods", goods);
		return result;
	}
	
	//������Ʒ��Ϣ������GoodsMapper�е�sql���
		@Override
		public int updateGoods(SqlSession session, Goods goods) {
		   int result=	super.update(session, "GoodsMapper.updateGoods", goods);
			return result;
		}
		
		
		//ɾ����Ʒ��Ϣ������GoodsMapper�е�sql���
		@Override
		public int deleteGoods(SqlSession session, Goods goods) {
		   int result=	super.delete(session, "GoodsMapper.deleteGoods", goods);
			return result;
		}

	

}
