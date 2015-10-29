<%--
  Created by IntelliJ IDEA.
  User: Krystian
  Date: 2015-10-29
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <title>Products</title>
</head>
<body>
<section>
  <div class="jumbotron">
    <div class="container">
      <h1 class="alert alert-danger"> There is no product found
        with the Product id ${invalidProductId}</h1>
    </div>
  </div>
</section>
<section>
  <div class="container">
    <p>${url}</p>
    <p>${exception}</p>
  </div>
  <div class="container">
    <p>
      <a href="<spring:url value="/products" />"class="btn btnprimary">
        <span class="glyphicon-hand-left glyphicon"></span>
        products
      </a>
    </p>
  </div>
</section>
</body>
</html>
