<%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2023/7/20
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$tomcat$</title>
  </head>
  <body>
  hello ymd;

  <%
    System.out.println("hello jsp");

    String contextPath = request.getContextPath();

    System.out.println(contextPath);

  %>
  </body>
</html>
