<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//1. 대상 폴더의 파일 객체 생성(webapp > files)
	String path = application.getRealPath("/files");
	File dir = new File(path);
	
	
	//2. 폴더의 내용을 가져오기(listFile())
	File[] listArr = dir.listFiles();
	List<File> list = new ArrayList<>();
	if (listArr !=null) {
		for (File f : listArr) if (f.isFile()) list.add(f);
	}
	
	//3. 파일만 출력하기(폴더는 일단 ㄴㄴ) > 테이블에 출력
	//	-파일명 > 그대로	
	//	-크기 > B KB MB > 소수 이하 첫째자리까지
	// 	-수정된 날짜 > 2025-09-04 (목) 오후 4: 31
	// 	-정렬 > file명 기준 오름차순 ir 수정된날짜 기준 내림차순?
	
	//4. 파일명 클릭 >  파일 다운로드(download.jsp 사용)
	//5. 아이콘


%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="http://bit.ly/3WJ5ilK" />
	<style>
		#tbl1 th:nth-child(1) {width:auto;}
		#tbl1 th:nth-child(2) {width:80px;}
		#tbl1 th:nth-child(3) {width:220px;}
		#tbl1 th:nth-child(4) {width:40px;}
		#tbl1 td:nth-child(1) {text-align: left;}
]	
}
	
	
	</style>
</head>
<body>
	<!-- ex18.jsp  -->
	<!--
		
		webapp > files 폴더 관리
	
	  -->
	  
	  <h1>자료실<small>탐색기</small></h1>
	  
	  <table id="tbl1">
	  	<tr>
	  		<th>파일명</th>
	  		<th>크기</th>
	  		<th>수정된 날짜</th>
	  		<th>삭제</th>
	  	</tr>
	  	<% 
	  	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) a h:mm");
	    if (list != null) {
	        for (File file : list) {
	            String filename = file.getName();

	            // 크기 변환
	            long size = file.length();
	            String sizeStr;
	            if (size < 1024) {
	                sizeStr = size + " B";
	            } else if (size < 1024 * 1024) {
	                sizeStr = String.format("%.1f KB", size / 1024.0);
	            } else {
	                sizeStr = String.format("%.1f MB", size / 1024.0 / 1024.0);
	            }

	            // 마지막 수정 날짜
	            String dateStr = sdf.format(new Date(file.lastModified()));
	 	%>
	 	<tr>
	  		<td><a href="download.jsp?filename=<%= filename %>"><%= filename %></a></td>
	  		<td><%= sizeStr %></td>
	  		<td><%= dateStr %></td>
	  		<td data-filename="<%= filename %>"><span class= "material-symbols-outlined" onclick="del()">delete</span></td>
	  	</tr>
	 	<%
	 				}
	 			}
	 	%>
	  </table>
	  
	  <hr>
	  
	  <form method= "post" action="ex18ok.jsp" enctype="multipart/form-data">
	  	<div>파일: <input type="file" name="attach" required></div>
	  	<div><button class="attach">업로드</button></div>
	  
	  </form>

	<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
	<script src="https://bit.ly/4cMuheh"></script>
	<script>
	
	function del() {
		//data-filename=""
		
		if (confirm('delete?')) {
		let filename = $(event.target).parent().data('filename');
		//alert(filename);
		
		
		location.href = 'ex18del.jsp?filename=' + filename;
	}
		event.cancelBubble = false;
		event.stopPropagation();
	}
	
	
	</script>

</body>
</html>


