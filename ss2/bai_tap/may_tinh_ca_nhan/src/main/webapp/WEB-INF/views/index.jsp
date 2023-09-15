<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<form action="computer/sum">
  <h1>Caculator</h1>
<input name="number1" required min="1"> <input name="number2" required min="1">
  <br><br>
  <button name="calculation" value="+" type="submit">Addition(+)</button>
  <button name="calculation" value="-" type="submit">Addition(-)</button>
  <button name="calculation" value="*" type="submit">Addition(X)</button>
  <button name="calculation" value="/" type="submit">Addition(/)</button>
</form>
<h1>Result Division : ${sum}</h1>
</body>
</html>