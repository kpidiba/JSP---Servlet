<%--
    Document   : index
    Created on : Dec 31, 2022, 7:54:27 AM
    Author     : kpidi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:out value="c out value"></c:out>
        <c:import url="navbar.jsp" var="data"></c:import>
        <c:out value="${data}" ></c:out>
            <br>
        <c:set var="somme" value="${10+10}" scope="session" ></c:set>
        <c:out value="somme value: ${somme}" ></c:out>
        <c:remove var="result"/>
        <c:out value="somme after remove: ${somme}" ></c:out>

        <c:catch var="except">
            <%
                int a = 2 / 0;
            %>
        </c:catch>

        <c:if test="${except != null}">
            <p>${except}</p>
            <p>${except.message}</p>

        </c:if>

        <c:set var="age" value="${10}" scope="session" ></c:set>

        <c:choose>
            <c:when test="${age >10}">
                <h1>Plus de 10 ans</h1>
            </c:when>

            <c:otherwise>
                <h1>INVALID AGE</h1>
            </c:otherwise>
        </c:choose>

        <c:forEach var="num" begin="1" end="10">
            <c:out value="- ${num} -"></c:out>
        </c:forEach>
        <br>
        <c:forTokens items="Becoder-Youtube-channel" delims="-" var="newString">
            <c:out value="name: ${newString}"></c:out> <br>
        </c:forTokens>

        <c:url var="page" value="/index.jsp">
            <c:param name="em" value="demo@gmail.com"></c:param>
        </c:url>
        <c:out value="name: ${page}"></c:out> <br>

        <%--<c:redirect url="https://google.com"></c:redirect>--%>
        <c:set var="david" value="the world is more complex that I think" scope="session" ></c:set>

        <c:out value="name: ${fn:toUpperCase(david)}"></c:out> <br>

    </body>
</html>
