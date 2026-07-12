<%--
  Created by IntelliJ IDEA.
  User: mazen
  Date: 7/12/26
  Time: 7:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" import="java.sql.*" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <%
        Class.forName("org.postgresql.Driver");
        String query = "select name from employees where id = 37";
        Connection connection = DriverManager.getConnection("postgresql+asyncpg://postgres:postgres@localhost:5434/mind_trace_db","postgres","postgres");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();
        response.getWriter().println(resultSet.getString("name"));
    %>
</body>
</html>
