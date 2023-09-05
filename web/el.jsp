<%@ page import="domain.User" %><%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2023/8/29
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  User user=new User();
  user.setUsername("zs");
  user.setId(1);
  user.setPassword("123");

  request.setAttribute("u",user);
%>


${requestScope.u}
</body>
</html>
