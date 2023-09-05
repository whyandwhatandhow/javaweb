<%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2023/8/28
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script>
  window.onload=function () {
    document.getElementById("img").onclick=function () {
      this.src="/HelloJavaweb_war_exploded/checkCode?time="+new Date().getTime();
    }
  }
</script>
<head>
    <title>login</title>
</head>
<body>
<form action="/HelloJavaweb_war_exploded/loginServlet" method="post">
  <table>
    <tr>
      <td>用户名</td>
      <td><input type="text" name="username"></td>
    </tr>
    <tr>
      <td>密码</td>
      <td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td>验证码</td>
      <td><input type="text" name="CheckCode"></td>
    </tr>
    <tr>
      <td colspan="2"><img id="img" src="/HelloJavaweb_war_exploded/checkCode"></td>
    </tr>
    <tr>
      <td>登录</td>
      <td colspan="2"><input type="submit" value="登录"></td>
    </tr>
  </table>
</form>


<div>
  <%=request.getAttribute("cc_error")==null ? " ":request.getAttribute("cc_error")%>
</div>
<div>
  <%=request.getAttribute("login_error")==null ? " ":request.getAttribute("login_error")%>
</div>

</body>
</html>

