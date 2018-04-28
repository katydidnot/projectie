<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<style type ="text/css">
html body{
background: #633974 !important;
color: #DAF7A6 !important;
}
</style>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<body>
<%@ include file="/WEB-INF/header.html" %>


<div class = "container">
    <div class ="row mt-5">
        <div class ="col-lg-12 mx.auto">

        <h2>Groups</h2>    <a href="CreateGroup.jsp" class="btn btn-outline-warning btn-med active" role="button" aria-pressed="true">Click Here to Create a Group.</a>
        <div class = "col-lg-5 align-center mt-5">
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th scope="col">Avaliable Groups</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${group}" var="i">

                                            <tr>
                                                <td>
                                                    <c:out value="${i}"/>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </div>


        </div>
    </div>
</div>










</body>
</html>