<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>

  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
 
 
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/materialize.min.css"  media="screen,projection"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custom.css">
  
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-ui.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/materialize.min.js"></script>

  
 

  <style type="text/css">
    .grade:hover{
      cursor: pointer;
      color: #f44336;
    }
  </style>

</head>

<body>

<!-- Navbar goes here -->
<header>
  <nav class="light-green lighten-3">
    <div class="nav-wrapper">
      <a href="#" class="left"><img src="${pageContext.request.contextPath}/resources/images/logo.png" width="150"></a>
      <a href="#" data-activates="mobile-nav" class="right button-collapse"><i class="mdi-navigation-more-vert"></i></a>
      <ul class="right">
        <li><a href="#">লগ ইন </i></span></a></li>
        <li><a href="#">সাইন আপ</a></li>
      </ul>
      <div class="left mysearch col s4 l6">
        <form>
          <div class="input-field light-green lighten-5 lighten-1">
            <input type="search" id="search-field" class="field" requ placeholder="Search Products" maxlength="">
            <label for="search-field">  <i class="mdi-action-search"></i></label>
            <i class="mdi-navigation-close close"></i>
          </div>
        </form>
      </div>
    </div>
  </nav>
<!-- 
  <ul class="side-nav" id="mobile-nav">
    <li><a href="#">Link 1</a></li>
    <li><a href="#">Link 2</a></li>
    <li><a href="#">Link 3</a></li>
  </ul> -->

</header>


  <!-- Page Content goes here -->
  <div class="section" style="margin:0px;">
  <!-- Page Layout here -->

  <!-- side content -->
    <div class="row">
      
      <div class="col s12 m3 category">
        
         <ul class="collapsible popout" data-collapsible="accordion">
          <li>
            <div class="collapsible-header">ফসল</div>
            <div class="collapsible-body"><p>Lorem ipsum dolor sit amet.</p></div>
          </li>
          <li>
            <div class="collapsible-header">ফলমূল</div>
            <div class="collapsible-body"><p>Lorem ipsum dolor sit amet.</p></div>
          </li>
          <li>
            <div class="collapsible-header">সবজি</div>
            <div class="collapsible-body"><p>Lorem ipsum dolor sit amet.</p></div>
          </li>
        </ul>
      </div> 

       <!-- view content -->

    <div class="col s12 m9">
      <div class="view-content">
        
        <!-- search category -->
        <div class="search-category">
          <div class="row">
            <div class="col s12 m3">             
              <label class="label">ফলাফল পরিবর্তন</label>
              <select id="sort">
                <option value="" disabled selected>বাছাই করুন</option>
                <option value="1">নতুনতম </option>
                <option value="2">সর্বাধিক রেটিংপ্রাপ্ত</option>
              </select>
            </div>

            <div class="col s12 m3">
              <label class="label">দেখুন</label>
              <select id="amount">
                <option value="" disabled selected>বাছাই করুন</option>
                <option value="5">৫</option>
                <option value="10">১০</option>
                <option value="20">২০</option>
              </select>
            </div>
            <div class="col s12 m3">

            </div>
            <div class="col s12 m3">

            </div>
          </div>

        </div>
        
        <!-- end search end category -->

        <!-- card -->
        <div class="card">
          <div class="row">
            <div class="col s12 m3 card-image">
              <div class="card-image">
                <a href=""><img src="${pageContext.request.contextPath}/resources/images/dhan.JPG"></a>
              </div>
              
            </div>

            <div class="col s12 m9 card-content">
              <h4 style="margin:0;">I am Lorem ipsum header</h4>
              <hr>
              <p>I am a very simple card. I am good at containing small bits of information.
              I am convenient because I require little markup to use effectively.</p>
            </div>
          </div>

          <div class="card-action">
            <a href="#">Uploaded Date : 08-02-02</a>
            <a href="#">Seen : 212</a>
            <a href="#">Uploader : Shafin Sunny</a>
            <div style="float:right;color:#e57373;margin-right:1%;">
              <i class="small material-icons grade">grade</i>
              <i class="small material-icons grade">grade</i>
              <i class="small material-icons grade">grade</i>
              <i class="small material-icons grade">grade</i>
              <i class="small material-icons grade">grade</i>
            </div>
          </div>
        </div>

        <!-- end card -->


        <!-- card -->
        <div class="card">
          <div class="row">
            <div class="col s12 m3 card-image">
              <div class="card-image">
                <a href=""><img src="${pageContext.request.contextPath}/resources/images/dhan.JPG"></a>
              </div>
              
            </div>

            <div class="col s12 m9 card-content">
              <h4 style="margin:0;">I am Lorem ipsum header</h4>
              <hr>
              <p>I am a very simple card. I am good at containing small bits of information.
              I am convenient because I require little markup to use effectively.</p>
            </div>
          </div>

          <div class="card-action">
            <a href="#">Uploaded Date : 08-02-02</a>
            <a href="#">Seen : 212</a>
            <a href="#">Uploader : Shafin Sunny</a>
            <div style="float:right;color:#e57373;margin-right:1%;">
              <i class="small material-icons grade">grade</i>
              <i class="small material-icons grade">grade</i>
              <i class="small material-icons grade">grade</i>
              <i class="small material-icons grade">grade</i>
              <i class="small material-icons grade">grade</i>
            </div>
          </div>
        </div>

        <!-- end card -->

        <div class="row">
          <div class="col s12 m12">
            <ul class="pagination">
              <li class="disabled"><a href="#!"><i class="material-icons">chevron_left</i></a></li>
              <li class="active"><a href="#!">1</a></li>
              <li class="waves-effect"><a href="#!">2</a></li>
              <li class="waves-effect"><a href="#!">3</a></li>
              <li class="waves-effect"><a href="#!">4</a></li>
              <li class="waves-effect"><a href="#!">5</a></li>
              <li class="waves-effect"><a href="#!"><i class="material-icons">chevron_right</i></a></li>
            </ul>
          </div>
        </div>

      </div>      
    </div>

    <!-- end view content -->
   
      
    </div> 

    <!-- end side content  -->

      
  </div>

  <!-- end page layout -->
  






<script type="text/javascript">
  $(document).ready(function(){
      // $('.cart').hide();
      $(".button-collapse").sideNav();
      $('.modal-trigger').leanModal();
      $('.collapsible').collapsible({
        accordion : false 
      });
      $('select').material_select();  
      
      var sort = $('#sort');
      sort.on('change',function(){
    	   
    	  var sortId = $(this).val().trim();
    	  $.ajax({
				
				url: '${pageContext.request.contextPath}/sort/sortId',
				type:'GET',
		       // dataType:'json',
				success: function(data){
					console.log(data);
					
				},
				statusCode: { 
					404: function() {
					    
				    }
					    
				},
				error : function(data,status,er) {
					
					
					
				}
			});
    	   
      });
      
      
      
  });

</script>

</body>
</html>