<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<!-- p01.jsp  -->
	<!-- http://192.168.10.30:8080/test/q01.jsp -->
	<h1>박스 만들기</h1>
	<form method="post" action="p01ok.jsp">
		<table class="vertical">
			<tr>
				<th>너비(px)</th>
				<td><input type="number" name="width1"></td>
			</tr>
			<tr>
				<th>높이(px)</th>
				<td><input type="number" name="height1"></td>
			</tr>
			<tr>
				<th>배경색</th>
				<td><input type="color" name="color1"></td>
			</tr>
			<tr>
				<th>텍스트</th>
				<td><input type="text" name="txt1"></td>
			</tr>
			<tr>
				<th>개수</th>
				<td><input type="number" name="num1"></td>
			</tr>
		</table>
		<div>
			<input type="submit" value="만들기">
		</div>
	</form>

	<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/ui/1.14.1/jquery-ui.js" integrity="sha256-9zljDKpE/mQxmaR4V2cGVaQ7arF3CcXxarvgr7Sj8Uc=" crossorigin="anonymous"></script>
	<script src="https://bit.ly/4cMuheh"></script>
	<script>
	
	
	</script>

</body>
</html>


