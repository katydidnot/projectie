<html>
<body>
<%@ include file="/WEB-INF/Header.html" %>
<%@ include file="/WEB-INF/SearchBar.html" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <div class = "row mt-5">
        <div class = "col-md-4">
        </div>
        <div class = "col-md-4">
        <div class="jumbotron">
          <h1 class="display-4">Welcome!</h1>
          <p class="lead">This is a simple app that will collect fresh cut product and let you know when it is available.</p>
          <hr class="my-4">
          <p>Click Below to add product to our database!</p>
          <a class="btn btn-warning btn-lg" href="/AddProduct.jsp" role="button">Add Product</a>
        </div>
        <div class = "col-md-4">

        </div>
         <form method = "GET" action ="/AddProduct">
        <h4>OR....</h4>
        <h6> Select a category below to display product available<h6>
         <div class = "row mt-2">
                        <div class="col-auto my-1">
                            <label class="mr-sm-2" for="inlineFormCustomSelect">Select Category</label>
                            <select name = "currentCategory" class="custom-select mr-sm-2" id="inlineFormCustomSelect3">
                                <option selected>Choose...</option>
                                <option value="Greenery" >Greenery</option>
                                <option value="Fillers">Fillers</option>
                                <option value="Flowers">Flowers</option>
                                <option value="Berries">Berries</option>
                                <option value="Branches">Branches</option>
                            </select>
                    </div>
                    </div>


                    <div class ="row">
                                    <div class ="col-lg-5"></div>
                                    <div class =col-lg-2>
                                        <button type="submit" class="btn btn-light active btn-sm mt-3" role ="button" aria-pressed="true">Submit</button>
                                    </div>
                                    <div class ="col-lg-5"></div></div>
        </form>
    </div>




</html>
</body>