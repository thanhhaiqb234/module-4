<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 9/14/2023
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<table class="table table-dark table-striped">
    <h1 style="text-align: center">Hiển thị thông tin khách hàng</h1>
    <tr>
        <th>STT</th>
        <th>Tên Khách Hàng</th>
        <th>Gmail</th>
        <th>Địa Chỉ</th>
    </tr>
    <c:forEach var="customerList" items="${customerList}" varStatus="soThuTu">
        <tr>
            <td><c:out value="${soThuTu.count}"></c:out></td>
            <td><c:out value="${customerList.name}"></c:out></td>
            <td><c:out value="${customerList.email}"></c:out></td>
            <td><c:out value="${customerList.address}"></c:out></td>
        </tr>
    </c:forEach>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
