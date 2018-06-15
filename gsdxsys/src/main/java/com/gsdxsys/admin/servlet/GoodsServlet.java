package com.gsdxsys.admin.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gsdxsys.entity.Goods;
import com.gsdxsys.entity.GoodsType;
import com.gsdxsys.service.GoodsService;
import com.gsdxsys.service.GoodsTypeService;
import com.gsdxsys.service.impl.GoodsServiceImpl;
import com.gsdxsys.service.impl.GoodsTypeServiceImpl;

public class GoodsServlet extends HttpServlet {
	private GoodsService service=new GoodsServiceImpl();
	private GoodsTypeService typeservice=new GoodsTypeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String action=request.getParameter("op");
		if("toadd".equals(action)){//修改
			toadd(request, response);
		}else if("doadd".equals(action)){//添加
			doadd(request, response);
		}else if("list".equals(action)){//显示
			list(request, response);
		}
		

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	//修改
	protected void toadd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<GoodsType> types= typeservice.getAll();
		req.setAttribute("types", types);
		req.getRequestDispatcher("/admin/goods_toadd.jsp").forward(req, resp);
	}
	
	//显示
	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Goods> goods= service.getAll();
		req.setAttribute("goods", goods);
		req.getRequestDispatcher("/admin/goods_list.jsp").forward(req, resp);
	}
	
	//添加操作
	protected void doadd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String goods_name=request.getParameter("goods_name");
		int typeid=Integer.parseInt(request.getParameter("typeid"));
		double goods_price=Double.parseDouble(request.getParameter("goods_price"));
		String goods_desc=request.getParameter("goods_desc");
		Goods goods=new Goods();
		goods.setGoods_desc(goods_desc);
		goods.setGoods_name(goods_name);
		goods.setGoods_price(goods_price);
		GoodsType goodstype=new GoodsType();
		goodstype.setId(typeid);
		goods.setGoodstype(goodstype);
		int result= service.addGoods(goods);
		if(result>0){
			response.sendRedirect(request.getContextPath()+"/admin/goods.do?op=list");
		}else{
			response.getWriter().println("添加失败");
		}
	}

}
