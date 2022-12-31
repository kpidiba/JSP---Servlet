<%-- 
    Document   : Welcome
    Created on : Dec 31, 2022, 6:24:27 AM
    Author     : kpidi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <% 
      //     String name = config.getInitParameter("dname");
     //      out.println(name);
        %>
        
        <% 
           String name = application.getInitParameter("David");
           out.println(name);
        %>
        <%
            out.print(session.getAttribute("session"));
        %>
    </body>
</html>
