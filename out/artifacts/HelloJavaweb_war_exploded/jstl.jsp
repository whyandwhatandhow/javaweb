<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2023/8/30
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    List list=new ArrayList<>();
    list.add("aaaaa");
    request.setAttribute("list",list);
    request.setAttribute("number",3);

%>


<%--    c:if标签--
test必须属性 接收boolen表达式，ture则接收，显示，否则不显示
--%>
    <c:if test="true"></c:if>


<c:if test="${not empty list}">
    list not empty
</c:if>

<c:if test="${number %2!=0}">
    ${number}为奇数
</c:if>

<c:if test="${number %2==0}">
    ${number}为偶数
</c:if>
</body>
</html>
