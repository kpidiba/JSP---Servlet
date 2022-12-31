<%-- 
    Document   : index
    Created on : Dec 30, 2022, 5:45:56 PM
    Author     : kpidi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" uri="/WEB-INF/tlds/custom.tld" %>

<%@page errorPage="error_page.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP TAG Man!</h1>
        
        
        <% session.setAttribute("session", "session"); %>
        
        <c:set var="name" value="david"></c:set>
        <c:out value="${name}"></c:out>
        <c:if test="${ 3 >2}">
            <p>True test</p>
        </c:if>
        <!-- Error Tag redirection -->
        <% // String name=null;name.length(); %>
        
        <t:greet msg="good morning"></t:greet>
        
        <% out.print("hello david"); %>
        
        <p>next</p>
        <form action="next.jsp">
            <input name="username" type="text" />
            <input type="submit" value="Send" />    
        </form>
        
        <p>Welcome</p>
        <form action="Welcome"/>
            <input name="dname" type="text" />
            <input type="submit" value="Send" />    
        </form>
    </body>
</html>
