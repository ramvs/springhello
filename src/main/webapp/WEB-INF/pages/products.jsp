<%--
  Created by IntelliJ IDEA.
  User: Krystian
  Date: 2015-10-12
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
    <title>List of products</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Products</h1>

            <p>All the available products in our store</p>
        </div>
    </div>
</section>
<section class="container">
    <div class="well">
        <div class="row">
            <c:forEach items="${products}" var="product">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail">
                        <img src="<c:url value="/resource/images/${product.productId}.png">
                        </c:url>" alt="image" style="width:100%"/>

                        <div class="caption">
                            <h3>${product.name}</h3>

                            <p>${product.description}</p>

                            <p>${product.unitPrice}</p>

                            <p>Available ${product.unitsInStock} units in stock</p>

                            <p>
                                <a href=" <spring:url value= "/products/product?id=${product.productId}" /> "
                                   class="btn btn-primary">
                                    <span class="glyphicon-info-sign glyphicon"/></span> Details
                                </a>
                            </p>
                            <p>
                                <a href=" <spring:url value= "/resource/pdf/${product.productId}.pdf" /> "
                                   class="btn btn-primary">
                                    <span class="glyphicon-info-sign glyphicon"/></span> PDF file
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>
</body>
</html>
