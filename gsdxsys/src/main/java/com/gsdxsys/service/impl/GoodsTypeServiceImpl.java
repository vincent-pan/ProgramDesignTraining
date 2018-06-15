package com.gsdxsys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsdxsys.dao.GoodsTypeDao;
import com.gsdxsys.dao.impl.GoodsTypeDaoImpl;
import com.gsdxsys.dao.impl.MyBatisUtis;
import com.gsdxsys.entity.GoodsType;
import com.gsdxsys.service.GoodsTypeService;

public class GoodsTypeServiceImpl implements GoodsTypeService{
  private GoodsTypeDao dao=new GoodsTypeDaoImpl();
	@Override
	public List<GoodsType> getAll() {
		List<GoodsType> types=new ArrayList<GoodsType>();
		SqlSession session=MyBatisUtis.createSqlSession();
		try {
			 types= dao.selectAll(session);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			if(session!=null){
			session.close();}
		}
		
		
		return types;
	}

}
