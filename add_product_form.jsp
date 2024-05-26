<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>

</head>
<body>
<h1>This is a add product form</h1>
<form action="handle-product" method="post">
Product Name:<input type="text" name="name"> <br><br>
Product Description:
<textarea rows="3" name="description"></textarea> <br><br>
Product Price:<input type="text" name="price"> <br><br>
<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
<button type="submit">Add</button>
</form>
</body>
</html>