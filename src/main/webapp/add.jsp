<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: mazen
  Date: 7/12/26
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#f0ffff">
    <%! int x = 2; %>
    <%
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int sum = num1 + num2;
        response.getWriter().println("sum = " + sum);
    %>
    My favourite number is <%= x %>
</body>
</html>
