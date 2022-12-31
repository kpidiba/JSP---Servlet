<%-- 
    Document   : index
    Created on : Dec 28, 2022, 10:27:00 PM
    Author     : kpidi
--%>

<%@page import="java.time.LocalDate" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <%! int a= 10; %>
        <h2><%=a %></h2>
        <h1>ACTUAL TIME : <%= LocalDate.now() %></h1>
        
    </body>
</html>
