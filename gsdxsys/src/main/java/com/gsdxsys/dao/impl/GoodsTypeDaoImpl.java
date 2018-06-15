package com.gsdxsys.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsdxsys.dao.GoodsTypeDao;
import com.gsdxsys.entity.Goods;
import com.gsdxsys.entity.GoodsType;

public class GoodsTypeDaoImpl extends MybatisBaseDao implements GoodsTypeDao{

	//����ȫ����Ʒ������Ϣ������GoodsTypeMapper�е�sql���
	@Override
	public List<GoodsType> selectAll(SqlSession session) {
		// TODO Auto-generated method stub
		List<GoodsType> goodsTypees= super.selectList(session, "GoodsTypeMapper.selectAll");
		return goodsTypees;
	}
	
	//�����ض���Ʒ������Ϣ������GoodsMapper�е�sql���
			@Override
			public List<GoodsType> selectById(SqlSession session) {
				List<GoodsType> goodsTypees= super.selectList(session, "GoodsTypeMapper.selectById");
				return goodsTypees;
			}

		
		//������Ʒ������Ϣ������GoodsMapper�е�sql���
		@Override
		public int insertGoodsType(SqlSession session, GoodsType goodsType) {
		   int result=	super.insert(session, "GoodsTypeMapper.inserGoodsType", goodsType);
			return result;
		}
		
		//������Ʒ������Ϣ������GoodsMapper�е�sql���
			@Override
			public int updateGoodsType(SqlSession session, GoodsType goodsType) {
			   int result=	super.update(session, "GoodsTypeMapper.updateGoodsType", goodsType);
				return result;
			}
			
			
			//ɾ����Ʒ������Ϣ������GoodsMapper�е�sql���
			@Override
			public int deleteGoodsType(SqlSession session, GoodsType goodsType) {
			   int result=	super.delete(session, "GoodsTypeMapper.deleteGoodsType", goodsType);
				return result;
			}

}
