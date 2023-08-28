<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String submittedUsername = request.getParameter("user");
    String submittedPassword = request.getParameter("pass");

//    if ("user".equals(submittedUsername) && "pass".equals(submittedPassword)) {
//        // Redirect to profile page
//        response.sendRedirect("profile.jsp");
//    } else {
//        // Redirect back to login form
//        response.sendRedirect("login.jsp");
//    }
%>
<html>
<head>
    <title>Title</title>
    <%@ include file="partials/head.jsp" %>
</head>
<body class="green">
<%@ include file="partials/navbar.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:choose>

    <c:when test="${param.username eq 'user' && param.password eq 'pass'}">
        <c:redirect url="profile.jsp"/>
    </c:when>
    <c:otherwise>

        <h1>Login Form</h1>
        <form method="post" action="login.jsp">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br><br>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br><br>

            <input type="submit" value="Login">
        </form>

    </c:otherwise>

</c:choose>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>
</html>
