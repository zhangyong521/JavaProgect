<%@ page import="java.net.URLEncoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>乱码JSP</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<a href='/chinaServlet?k1=abcd&k2=<%=URLEncoder.encode("我爱编程","UTF-8")%>'>URL中文</a>
<a href='/chinaServlet2?k1=abcd&k2=我爱编程'>URL中文2</a>

<form action="/chinaServlet3" method="post">
    用户名：<input type="text" name="uname">
    <input type="submit">
</form>
</body>
</html>
