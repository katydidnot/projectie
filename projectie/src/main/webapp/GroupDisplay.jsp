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
            <table class="table table-hover">
                <div class ="row-lg-12">
                    <thead>
                        <tr>
                            <th scope="col">Users</th>
                        </tr>
                    </thead>
                       <tbody>

                            <c:forEach items="${user}" var="i">

                                <tr>
                                    <td>
                                        <a href ="">
                                            <c:out value="${i}"/>
                                        </a>
                                    </td>
                                </tr>
                                            </c:forEach>
                       </tbody>
                </div>
        </body>
</html>


