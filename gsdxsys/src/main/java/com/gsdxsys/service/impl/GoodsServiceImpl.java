package com.gsdxsys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gsdxsys.dao.GoosDao;
import com.gsdxsys.dao.impl.GoodsDaoImpl;
import com.gsdxsys.dao.impl.MyBatisUtis;
import com.gsdxsys.entity.Goods;
import com.gsdxsys.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
   private GoosDao dao=new GoodsDaoImpl();
	@Override
	public int addGoods(Goods goods) {
		int result=0;
	    SqlSession session=MyBatisUtis.createSqlSession();
	    try {
	    	result=dao.insertGoods(session, goods);
		     session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} 
	    finally {
	    	if(session!=null){
	    		session.close();
	    	}
			
		}
	    return result;
	    
	}

	@Override
	public List<Goods> getAll() {
		List<Goods> result=new ArrayList<Goods>();
	    SqlSession session=MyBatisUtis.createSqlSession();
	    try {
	    	result=dao.selectAll(session);
		     session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} 
	    finally {
	    	if(session!=null){
	    		session.close();
	    	}
			
		}
	    return result;
	}

}
