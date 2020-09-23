<%--
  Created by IntelliJ IDEA.
  User: 虚栩维我
  Date: 2020/9/22
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>显示所有用户</h3>
<c:forEach items="${list }" var="u">

        <li>${u.id }</li>
        <li>${u.username}</li>
        <li>${u.password}</li>
        <li>${u.birthday}</li>

</c:forEach>
</body>

</body>
</html>
