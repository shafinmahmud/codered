<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">

<title>HomePage</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath}/resources/javascript/jquery-1.11.3.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/javascript/bootstrap.min.js"></script>


</head>
<body>
<c:forEach var="category" items="${categories}">
    <c:if test="${category.categoryName}=="""></c:if>
</c:forEach>


<script type="text/javascript">

 $(document).ready(function(){
	 
	 $('h3').on('click',function(){
		 
		 var type= $(this).data('id').trim();
		 $.ajax({
				
				url: '${pageContext.request.contextPath}/categories/type',
				type:'GET',
		       // dataType:'json',
				success: function(data){
					console.log(data);
					
				},
				statusCode: { 
					404: function() {
					    console.log("no data found");
				    }
					    
				},
				error : function(data,status,er) {
					
					console.log("error");
					
				}
			});
		 
	 });
	 
 });
</script>
</body>


</html>