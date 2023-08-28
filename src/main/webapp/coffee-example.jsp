<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%! int customers = 0;
%>
<% customers++;
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%@include file="partials/navbar.jsp" %>

<h1> We have had <%= customers%> Customers visit our shop</h1>
<p> the coffee parameter is currently ${param.coffee}</p>


<%--<h1>Welcome To The Site!</h1>--%>
<%--<p>Path: <%= request.getRequestURL() %></p>--%>
<%--<p>Query String: <%= request.getQueryString() %></p>--%>
<%--<p>"name" parameter: <%= request.getParameter("name") %></p>--%>
<%--<p>"method" attribute: <%= request.getMethod() %></p>--%>
<%--<p>User-Agent header: <%= request.getHeader("user-agent") %></p>--%>


<form method="POST" action="coffee-example.jsp">
    <input type="text" name="coffeename" placeholder="Enter a coffee">
    <input type="text" name="username" placeholder="Enter your name">
    <label for="caramel-checkbox">Caramel</label>
    <input id="caramel-checkbox" type="checkbox" name="addons" value="caramel">
    <label for="creamer-checkbox">Creamer</label>
    <input id="creamer-checkbox" type="checkbox" name="addons" value="creamer">
    <label for="sugar-checkbox">Sugar</label>
    <input id="sugar-checkbox" type="checkbox" name="addons" value="sugar">
    <button type="submit">SUBMIT</button>
</form>

<c:if test="${param.coffeename != null}">
    <p> Coffee Chosen : ${param.coffeename}</p>
</c:if>

<c:if test="${param.username != null}">
    <p> Username Chosen : ${param.username}</p>
</c:if>

<c:if test="${paramValues.addons != null}">
    <p> Add-Ons Chosen :</p>
    <c:forEach var="addon" items="${paramValues.addons}">
        <li>${addon}</li>
    </c:forEach>
</c:if>


</body>
</html>
