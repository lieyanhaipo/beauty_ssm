<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/12/15
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp"%>
<html>
<head>
    <title>login page</title>
</head>
<body>
    <h1>login page</h1>
    <form id="" action="doLogin" method="post">
        <div>
            <label>username</label>
            <input type="text" name="userName" maxlength="40"/>
        </div>
        <div>
            <label>password</label>
            <input type="password" name="password"/>
        </div>
        <input type="submit" value="login"/>
    </form>
    <%-- 用于输入后台返回的验证错误信息--%>
    <P>${message}</P>
</body>
</html>
