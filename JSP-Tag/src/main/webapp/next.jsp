<%-- 
    Document   : next
    Created on : Dec 31, 2022, 6:09:47 AM
    Author     : kpidi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <h1>
                <%
                String usen = request.getParameter("username");
                out.print(usen);
            %> 
            </h1>
            
            //Redirection
            <% response.sendRedirect("https://www.google.com");                 %>
    </body>
</html>
