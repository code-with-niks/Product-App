<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

</head>
<body>
<h1>WELCOME TO PRODUCT APP</h1>
<table class="table" border="1px">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
     <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${products}" var="p">
    <tr>
    <th>${p.id}</th>
    <th>${p.name}</th>
    <th>${p.description}</th>
     <th>${p.price}</th>    
    </tr>
        </c:forEach>
  </tbody>
</table>
<a href="add-product" >Add</a>

</body>
</html>
