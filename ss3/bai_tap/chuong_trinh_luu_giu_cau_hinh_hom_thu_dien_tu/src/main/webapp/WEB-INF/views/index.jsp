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
<h1 style="text-align: center">Settings</h1>

<table class="table table-dark table-striped">
    <tr>
        <th>Numerical Order</th>
        <th>Languages</th>
        <th>Page Size</th>
        <th>Spams Filter</th>
        <th>Signature</th>
        <th></th>
    </tr>

    <c:forEach items="${settingsList}" varStatus="sothutu" var="settingList">
        <tr>
            <td><c:out value="${sothutu.count}"/></td>
            <td><c:out value="${settingList.languages}"/></td>
            <td><c:out value="${settingList.pageSize}"/></td>
            <c:choose>
                <c:when test="${settingList.spamsFilter == true}">
                    <td>Turn off</td>
                </c:when>
                <c:when test="${settingList.spamsFilter == false}">
                    <td>Turn on</td>
                </c:when>
            </c:choose>
            <td><c:out value="${settingList.signature}"/></td>
            <td>
                       <button type="submit">
                           <a href="/settings/setting/update/${settingList.id}" style="color: black ; text-decoration: none">Update</a>
                       </button>
            </td>
        </tr>
    </c:forEach>
</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>