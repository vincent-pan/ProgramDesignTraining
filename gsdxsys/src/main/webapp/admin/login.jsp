<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	系统登录
	<form action="" method="post">
        <table>
            <tr>
                <td><label>用户名</label></td>
                <td><input type="text" id="loginname" name="loginname"></td>
            </tr>
            <tr>
                <td><label>密码</label></td>
                <td><input type="password" id="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录" /></td>
                <td><input type="reset"></td>
            </tr>
        </table>
    </form>
    
   
    
</body>
</html>
 <%
	String name=request.getParameter("loginname");
    String password=request.getParameter("password");
	if(name=="1"){
    	if(password=="1"){
    		response.sendRedirect("index.jsp");
    	}
    }
    %>