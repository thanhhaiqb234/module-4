<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<br/>
<form action="/transfer/money">
<h4>Nhập số tiền mà bạn muốn tính vào đây : <input type="number"  name="usd" id="usd"></h4>
  <br><br>
  <button type="submit">Tính Tổng</button>
</form>
<h3>Kết Quả = ${vnd}</h3>
</body>
</html>