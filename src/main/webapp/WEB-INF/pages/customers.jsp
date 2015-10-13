<%--
  Created by IntelliJ IDEA.
  User: Krystian
  Date: 2015-10-13
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-
  8859-1">
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <title>List of customers</title>
</head>
<body>
<section>
  <div class="jumbotron">
    <div class="container">
      <h1>Customers</h1>

      <p>List of all available customers in our store</p>
    </div>
  </div>
</section>
<section class="container">
  <div class="row">
    <c:forEach items="${customers}" var="customer">
      <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
        <div class="thumbnail">
          <div class="caption">
            <h3>Customer ID : ${customer.customerId}</h3>
            <p>Customer Name : ${customer.name}</p>
            <p>Customer number of order : ${customer.noOfOrdersMade}</p>
          </div>
        </div>
      </div>
    </c:forEach>
  </div>
</section>
</body>
</html>
