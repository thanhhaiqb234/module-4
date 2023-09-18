<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Thêm mới nhân viên</h1>
<form:form method="post" action="/employee/create" modelAttribute="employee">
    <form:input path="id"/><br>
    <form:input path="name"/><br>
    <form:input path="contactNumber"/><br>
    <button>Save</button>
</form:form>
</body>
</html>
