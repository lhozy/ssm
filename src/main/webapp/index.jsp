<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/23
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>首页</h3>
<br/>
<a href="account/list">查找用户</a>
<br/>
<br/>
<form action="account/save" method="post">
    姓名：<input type="text" name="name" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="submit" value="保存"/><br/>

</form>
</body>
</html>
