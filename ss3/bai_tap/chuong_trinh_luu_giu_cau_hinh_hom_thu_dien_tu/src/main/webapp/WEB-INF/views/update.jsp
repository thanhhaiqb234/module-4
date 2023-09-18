<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 9/18/2023
  Time: 4:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <h1>Settings</h1>
    <tr>
        <th>Languages</th>
        <td>
            <form:select path="stringList">
                <form:option value="" label="select"/>
                <form:options items="${stringList}"/>
            </form:select>
        </td>
    </tr>
    <tr>
        <th>Page Size</th>
        <td>
            show<form:select path="pageSize">
            <form:options items="${pageSizeList}"/>
        </form:select>emails per page
        </td>
    </tr>
    <tr>
        <th>Spams filter</th>
        <td>
            <form:checkbox value="Enable spam filters" path="spamFilter"/>
        </td>
    </tr>
    <tr>
        <th>Sinnature</th>
        <td>
            <form:textarea path="signature"/>
        </td>
    </tr>

</table>
</body>
</html>
