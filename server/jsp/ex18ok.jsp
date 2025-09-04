<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//1. 파일 업로드 처리
	//	- 업로드할 경로(webapp > files)
	//	- 최대 크기(100MB)
	//	- MultipartRequest 생성 + 파일 업로드 완료
	//2. 목록으로 돌아가기
	//	- ex18.jsp
	
	String path = application.getRealPath("/files");
	int size = 1024 * 1024 * 100;
	
	String filename = ""; 
	//String orgfilename = "";
	
	try {
		
		MultipartRequest multi = new MultipartRequest(
									request, 	
									path,		
									size,		
									"UTF-8",	
									new DefaultFileRenamePolicy()
								);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	response.sendRedirect("ex18.jsp");

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
	<!-- ex18ok.jsp -->
	
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<script src="https://bit.ly/4cMuheh"></script>
	<script>
		
	</script>
</body>
</html>





