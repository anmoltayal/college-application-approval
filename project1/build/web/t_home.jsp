<!DOCTYPE html>
<html>
<head>
     <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
    margin: 0;
}
.header {
    list-style-type: none;
    margin: 0;
    padding: 0px;
    overflow: hidden;
    border: 1px solid #e7e7e7;
    background-color:#FFFFFF;
    font-size:20px;
}

.info {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 15%;
    background-color: #f1f1f1;
    position: fixed;
    height: 100%;
    overflow: auto;
}

li a {
    display: block;
    color: #000;
    padding: 8px 16px;
    text-decoration: none;
}

li a.active {
    background-color: #555;
    color: white;
    text-decoration: none;

}

li a:hover:not(.active) {
    background-color: #FFFFFF;
    color: black;
    text-decoration: none;
    
}
</style>
</head>
<body>
    <nav class="navbar navbar-fixed-top">
<ul class="header">
    <li><a href="#home"><img src="chilogo.png"></a></li>
</ul>
<ul class="info">
    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">STUDENT <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="addstudent.html">ADD STUDENT</a></li>
          <li><a href="#">REMOVE STUDENT</a></li>
          <li><a href="#">SEARCH STUDENT</a></li>
        </ul>
    </li>
    
    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">SEARCH <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">STUDENT</a></li>
          <li><a href="#">TEACHER</a></li>
        </ul>
    </li>
    
  
    <%String id=(String)request.getAttribute("name");
            request.setAttribute("id",id);%>
    <li><a href="viewappn.jsp?id=${id}">Application</a></li>
    
    <li><a href="leave.html">APPLY FOR LEAVE</a></li>
    
    <li><a href="index.html"> <span class="glyphicon glyphicon-log-out"></span> Log Out</a></li>
</ul>
    </nav>
<div style="margin-left:16%;padding-top:7%;">
     
</div>

</body>
</html>