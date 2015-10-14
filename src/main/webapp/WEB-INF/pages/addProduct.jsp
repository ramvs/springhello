<%--
  Created by IntelliJ IDEA.
  User: Krystian
  Date: 2015-10-14
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"
        %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-
  8859-1">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <title>Products</title>

</head>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Products</h1>

            <p>Add products</p>
        </div>
    </div>
</section>
<section class="container">
    <form:form modelAttribute="newProduct" class="form-horizontal">
        <fieldset>
            <legend>Add new product</legend>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2"
                       for="productId">Product Id</label>

                <div class="col-lg-10">
                    <form:input id="productId" path="productId" type="text"
                                class="form:input-large"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2"
                       for="name">Name</label>

                <div class="col-lg-10">
                    <form:input id="name" path="name" type="text"
                                class="form:input-large"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2"
                       for="manufacturer">Manufacturer</label>

                <div class="col-lg-10">
                    <form:input id="manufacturer" path="manufacturer" type="text"
                                class="form:input-large"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2"
                       for="category">Category</label>

                <div class="col-lg-10">
                    <form:input id="category" path="category" type="text"
                                class="form:input-large"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2"
                       for="unitsInStock">Units in Stock</label>

                <div class="col-lg-10">
                    <form:input id="unitsInStock" path="unitsInStock" type="text"
                                class="form:input-large"/>
                </div>
            </div>
                <div class="form-group">
                <label class="control-label col-lg-2"
                       for="description">Description</label>

                <div class="col-lg-10">
                    <form:textarea id="description" path="description" rows=
                            "2"/>
                </div>
            </div>
            <div class="form-group">
                <div class="form-group">
                    <label class="control-label col-lg-2"
                           for="conditions">Condition</label>

                    <div class="col-lg-10">
                        <form:radiobutton path="conditions" value="New"/>New
                        <form:radiobutton path="conditions" value="Old"/>Old
                        <form:radiobutton path="conditions" value="Refurbished"
                                />Refurbished
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-10">
                        <input type="submit" id="btnAdd" class="btn btn-primary"
                               value="Add"/>
                    </div>
                </div>
        </fieldset>
    </form:form>
</section>

</body>
</html>
