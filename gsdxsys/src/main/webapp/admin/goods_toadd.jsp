<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<%-- 商品修改页面 --%>
<body>
<h3>修改商品</h3>
<form action="${pageContext.request.contextPath}/admin/goods.do?op=doadd" method="post">
  商品名称：<input name="goods_name" type="text"/><br/>
 商品类别：<select name="typeid">
          <option value="0">请选择</option>
          <c:forEach items="${requestScope.types}" var="t">
           <option value="${t.goods_id}">${t.goods_name}</option>
          </c:forEach>
        </select> <br/>
 商品价格：<input name="goods_price" type="text"/><br/>
 商品描述：<textarea name="goods_desc" rows="8" cols="40"></textarea><br/>
 <input name="btnadd" type="submit" value="添加" />
 </form>
 <br><a href="index.jsp">返回主界面</a><br>
</body>
</html>