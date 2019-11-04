<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>
<body>
<form action="/loginServlet" method="post">
    用户名：<input type="text" name="uname"><br>
    密码：<input type="password" name="upwd"><br>
    保持登录一周:<input type="checkbox" name="jiZhu" value="jiZhu"><br>
    <input type="submit">
</form>
</body>

</body>
</html>
