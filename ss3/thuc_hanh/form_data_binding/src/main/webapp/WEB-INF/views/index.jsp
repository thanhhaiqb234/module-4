<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<table class="table table-dark table-striped">
    <h1 style="text-align: center">List of all employees</h1><br>
    <button><a href="employee/create" style="color: black ; text-decoration: none">Add Employee</a></button>
    <tr>
        <th>Stt</th>
        <th>Name</th>
        <th>Contact Number</th>
    </tr>
    <c:forEach items="${employeeList}" var="employeeList" varStatus="soThuTu">
        <tr>
            <td><c:out value="${soThuTu.count}"/></td>
            <td><c:out value="${employeeList.name}"/></td>
            <td><c:out value="${employeeList.contactNumber}"/></td>
        </tr>
    </c:forEach>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>