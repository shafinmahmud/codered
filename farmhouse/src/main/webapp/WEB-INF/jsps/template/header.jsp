<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
ul{
   padding: 0em;
}
ul li{
    list-style-type: none;
}

.heading{
  
  background-color: #6AC140;
  border-radius:0.4em;
  text-align:center;
  cursor:pointer;
  
}

.right{

 position: absolute;

}
a{
   cursor: pointer;
}
a:link    {color:green; background-color:transparent; text-decoration:none}
a:visited {color:pink; background-color:transparent; text-decoration:none;}
a:hover   {color:red; background-color:transparent; text-decoration:underline}
a:active  {color:yellow; background-color:transparent; text-decoration:underline}


</style>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
      <a class="navbar-brand" href="#">ফার্ম হাউজ</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/authors">Authors</a></li>
        <li><a href="#">Books</a></li> 
        <li><a href="#">Page 3</a></li> 
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="${pageContext.request.contextPath}/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="container">
    <div class="row">
       <div class="left col-md-offset-1 col-md-2">
          <div class="well">
             <h3 class="heading" data-id="crops">ফসল</h3>
             
             <h3 class="heading" data-id="fruits">ফলমূল</h3>
            
             <h3 class="heading" data-id="vegetables">সবজি</h3>
             
             <h3 class="heading" data-id="districts">জেলা</h3>
            
          </div>  
       </div>
       <div class="right col-md-offset-3 col-md-8">
          <div class="well">
             <h1>sad</h1>
          </div>
       </div>
    </div>
</div>


</body>
</html>