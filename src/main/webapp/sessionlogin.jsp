<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="/loginServlet" method="post">
        用户名：<input type="text" name="uname"><br>
        密码:<input type="password" name="upwd"><br>
        <input type="submit">
    </form>
</body>
</html>
