<%--
  Created by IntelliJ IDEA.
  User: 23164
  Date: 2022/10/17
  Time: 1:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="css/login.css" rel="stylesheet">
</head>

<body>
<div id="loginDiv" style="height: 350px">
    <form action="/LoginServlet" id="form" method="POST">
        <h1 id="loginMsg">LOGIN IN</h1>
        <div id="errorMsg">${login_msg}</div>
        <p>Username:<input id="username" name="username" type="text" value="${cookie.username.value}"></p>

        <p>Password:<input id="password" name="password" type="password" value="${cookie.password.value}"></p>
        <p>Remember:<input id="remember" name="remember" type="checkbox" value="1"></p>
        <div id="subDiv">
            <input type="submit" class="button" value="login up">
            <input type="reset" class="button" value="reset" onclick="fun1()">&nbsp;&nbsp;&nbsp;
            <a href="register.jsp">没有账号</a>
        </div>
    </form>
</div>

</body>
<script>
    function fun1(){
        document.getElementById("username").setAttribute("value","");
        document.getElementById("password").setAttribute("value","");
    }
</script>
</html>