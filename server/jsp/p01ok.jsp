<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String width1 = request.getParameter("width1");
	String height1 = request.getParameter("height1");
	String color1 = request.getParameter("color1");
	String txt1 = request.getParameter("txt1");
	String num1 = request.getParameter("num1");
	int n = Integer.parseInt(num1);







%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="http://bit.ly/3WJ5ilK" />
	<style>
	
	
	</style>
</head>
<body>
	<!-- p01ok.jsp   -->
	<h1>결과</h1>
	<%
		for (int i=0; i< n; i++) {
	%>
	<div style="width:<%= width1 %>px; height:<%= height1 %>px; background-color:<%= color1 %>; margin:10px;" >
		<%= txt1 %> </div> 
	<% } %>
	
		

	<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/ui/1.14.1/jquery-ui.js" integrity="sha256-9zljDKpE/mQxmaR4V2cGVaQ7arF3CcXxarvgr7Sj8Uc=" crossorigin="anonymous"></script>
	<script src="https://bit.ly/4cMuheh"></script>
	<script>
	
	
	</script>

</body>
</html>


