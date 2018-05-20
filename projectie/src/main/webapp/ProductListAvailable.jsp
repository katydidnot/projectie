<html>
<%@ include file="/WEB-INF/Header.html" %>
<%@ include file="/WEB-INF/SearchBar.html" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<body>
    <div class ="container mx.auto">
        <div class = "row">
            <div class = "col-lg-3">
            </div>
            <div class = "col-lg-6">

                                                <h4>Available Product: ${category}<h4>

                                                    <c:forEach items="${products}" var="i">

                                                               <form method = "GET" action = "/Item" ><li class="list-group-item list-group-item-warning"> <c:out value="${i}"/><input type="hidden" name="productName" value="${i}"> <button type="submit" class="btn btn-light active btn-sm mt-3" role ="button" aria-pressed="true">Edit</button></li></form>



                                                    </c:forEach>
            </tbody>

            </div>
            <div class ="col-lg-3">
            </div>







        </div>
    </div>
</body>
</html>