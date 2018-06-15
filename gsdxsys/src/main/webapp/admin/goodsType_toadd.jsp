<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<%-- 商品添加页面 --%>
<body>
<h3>添加商品类别</h3>
<form action="${pageContext.request.contextPath}/admin/goodsType.do?op=doadd" method="post">
  商品类别名称：<input name="goodsType_name" type="text"/><br/>
 商品类别描述：<textarea name="goodsType_desc" rows="8" cols="40"></textarea><br/>
 <input name="btnadd" type="submit" value="添加" />
  </form>
   <br><a href="index.jsp">返回主界面</a><br>
</body>
</html>