<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h3 style="color: red">${message}</h3>
<form action="validate" method="post">
  <br>
  <h4>Nhập Email của bạn vào : <input type="text" name="email"></h4>
  <button type="submit">Kiểm Tra</button>
</form>
</body>
</html>