<%--
  Created by IntelliJ IDEA.
  User: Jamal Raouj
  Date: 10/24/2022
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Login Page</title>
</head>
<body>
<%= request.getContextPath()%>
<%--<p><% request.getMethod().toString();  %></p>--%>
<form action="<%=request.getContextPath()%>/LoginServlet" method="post">

    Please enter your username
    <input type="text" name="email" /><br>

    Please enter your password
    <input type="text" name="password"/>

    <input type="submit" value="submit">

</form>

</body>
</html>
