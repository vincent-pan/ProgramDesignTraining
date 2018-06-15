package com.gsdxsys.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsdxsys.dao.GoodsTypeDao;
import com.gsdxsys.entity.Goods;
import com.gsdxsys.entity.GoodsType;

public class GoodsTypeDaoImpl extends MybatisBaseDao implements GoodsTypeDao{

	//查找全部商品类型信息，调用GoodsTypeMapper中的sql语句
	@Override
	public List<GoodsType> selectAll(SqlSession session) {
		// TODO Auto-generated method stub
		List<GoodsType> goodsTypees= super.selectList(session, "GoodsTypeMapper.selectAll");
		return goodsTypees;
	}
	
	//查找特定商品类型信息，调用GoodsMapper中的sql语句
			@Override
			public List<GoodsType> selectById(SqlSession session) {
				List<GoodsType> goodsTypees= super.selectList(session, "GoodsTypeMapper.selectById");
				return goodsTypees;
			}

		
		//插入商品类型信息，调用GoodsMapper中的sql语句
		@Override
		public int insertGoodsType(SqlSession session, GoodsType goodsType) {
		   int result=	super.insert(session, "GoodsTypeMapper.inserGoodsType", goodsType);
			return result;
		}
		
		//更新商品类型信息，调用GoodsMapper中的sql语句
			@Override
			public int updateGoodsType(SqlSession session, GoodsType goodsType) {
			   int result=	super.update(session, "GoodsTypeMapper.updateGoodsType", goodsType);
				return result;
			}
			
			
			//删除商品类型信息，调用GoodsMapper中的sql语句
			@Override
			public int deleteGoodsType(SqlSession session, GoodsType goodsType) {
			   int result=	super.delete(session, "GoodsTypeMapper.deleteGoodsType", goodsType);
				return result;
			}

}
