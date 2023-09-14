<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<form action="/search/dictionary">
  <h4>Nhập Từ mà bạn muốn tra cứu : <input type="text" name="search"><button type="submit">Tìm Kiếm</button>
  </h4>
  <h4>Kết Quả : ${result}</h4>
</form>
</body>
</html>