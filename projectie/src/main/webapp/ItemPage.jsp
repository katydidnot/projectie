
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<body>
<%@ include file="/WEB-INF/Header.html" %>
<%@ include file="/WEB-INF/SearchBar.html" %>

<div class = "container mx.auto">


    <form method = "POST" action ="/Item">
        <div class ="row mt-5">
            <div class ="col-lg-3"></div>
            <div class ="col-lg-5">
                <div class="form-group">
                    <input class ="form-control" name ="productName" type = "text" placeholder =${productName}>
                </div></div>
            <div class ="col-lg-3"></div></div>


   <div class="form-row align-items-center">
            <div class="col-auto my-1">
                <label class="mr-sm-2" for="inlineFormCustomSelect">Start Month</label>
                <select name = "startDate" class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                    <option selected>${startDate}</option>
                    <option value="1">January</option>
                    <option value="2">February</option>
                    <option value="3">March</option>
                    <option value="4">April</option>
                    <option value="5">May</option>
                    <option value="6">June</option>
                    <option value="7">July</option>
                    <option value="8">August</option>
                    <option value="9">September</option>
                    <option value="10">October</option>
                    <option value="11">November</option>
                    <option value="12">December</option>
                </select>
            </div>

            <div class="col-auto my-1">
                <label class="mr-sm-2" for="inlineFormCustomSelect">End Month</label>
                <select name = "endDate" class="custom-select mr-sm-2" id="inlineFormCustomSelect2">
                    <option selected>${endDate}</option>
                    <option value="1" >January</option>
                    <option value="2">February</option>
                    <option value="3">March</option>
                    <option value="4">April</option>
                    <option value="5">May</option>
                    <option value="6">June</option>
                    <option value="7">July</option>
                    <option value="8">August</option>
                    <option value="9">September</option>
                    <option value="10">October</option>
                    <option value="11">November</option>
                    <option value="12">December</option>
                </select>

            </div>

            <div class = "row mt-2">
                <div class="col-auto my-1">
                    <label class="mr-sm-2" for="inlineFormCustomSelect">Select Category</label>
                    <select name = "productCategory" class="custom-select mr-sm-2" id="inlineFormCustomSelect3">
                        <option selected>${productCategory}</option>
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
                <div class ="col-lg-5"></div>
                </div>
        </div>

        <div class = "row">
        <div class = "col-lg-5"></div>
        <div class = "col-lg-2">
       <a href="#" class="btn btn-danger active btn-sm mt-3" role="button" aria-pressed="true">Delete</a>
         </div>
        </form>



















</body>
</html>