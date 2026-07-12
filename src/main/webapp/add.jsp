<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: mazen
  Date: 7/12/26
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#f0ffff">
    <%
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;
        response.getWriter().println("sum = " + sum);
    %>
</body>
</html>
