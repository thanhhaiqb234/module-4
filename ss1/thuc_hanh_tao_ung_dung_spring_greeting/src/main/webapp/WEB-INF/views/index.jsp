<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>

</head>
<body>
<button><a href="/greeting">xin Chào ${name}</a></button>
<br>
<form method="post" action="/studen/create">
<button type="submit">oki</button>
</form>
<br>
<button><a href="/studen/create">nhấp vào đây</a></button>
</body>
</html>