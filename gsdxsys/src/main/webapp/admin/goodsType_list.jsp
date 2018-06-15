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
	<h3>商品类别管理列表</h3>
	<table>
		<tr>
			<td>商品类别名称</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.goodsType}" var="goodsType">
			<tr>
				<td>${goodsType.goodsType_name}</td>
				<td>
				<a href="${pageContext.request.contextPath}/admin/goodsType/del.do?id=${goodsType.id}">删除</a>
				<a href="${pageContext.request.contextPath}/admin/goodsType/toedit.do?id=${goodsType.id}">修改</a></td>
			</tr>
		</c:forEach>
	</table>

 <br><a href="index.jsp">返回主界面</a><br>


</body>
</html>