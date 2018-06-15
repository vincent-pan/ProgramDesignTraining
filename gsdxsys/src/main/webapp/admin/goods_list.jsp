<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<%-- 商品管理页面 --%>
<body>
 <%
	/*String name=request.getParameter("login_loginname");
    String password=request.getParameter("login_password");
	if(name!="1"){
    	if(password!="1"){
    		response.sendRedirect("login.jsp");
    	}
    }*/
    %> 
	<h3>商品管理列表</h3>
	<table>
		<tr>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>类别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.goods}" var="goods">
			<tr>
				<td>${goods.goods_name}</td>
				<td>${goods.goods_price}</td>
				<td>${goods.goodstype.name}</td>
				<td>
				<a href="${pageContext.request.contextPath}/admin/goods/del.do?id=${goods.id}">删除</a>
				<a href="${pageContext.request.contextPath}/admin/goods/toedit.do?id=${goods.id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
	
	 <br><a href="index.jsp">返回主界面</a><br>




</body>
</html>