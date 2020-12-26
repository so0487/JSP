<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Main Page</h1>
	
	
	
	<input type="text" name="query" value="" id="query"/>
	<!-- <button type="button" onclick="search_go()">네이버 검색</button>	 -->
	<!-- <button type="button" id="searchBtn">네이버 검색</button>	 -->
	
	<select id="loc_mcd">
		<option value="101000">서울 </option>
		<option value="102000">경기 </option>
		<option value="108000">인천 </option>
		<option value="106000">부산 </option>
		<option value="104000">대구 </option>
		<option value="103000">광주 </option>
		<option value="105000">대전 </option>
		<option value="107000">울산 </option>
		<option value="118000">세종 </option>
		<option value="109000">강원 </option>
		<option value="110000">경남 </option>
		<option value="111000">경북 </option>
		<option value="112000">전남 </option>
		<option value="113000">전북 </option>
		<option value="115000">충남 </option>
		<option value="114000">충북 </option>
		<option value="116000">제주 </option>
		<option value="117000">전국 </option>
	
	</select>
	
	<button type="button" id="searchBtn">사람인 검색</button>	
	
	
	
</body>
</html>


<script>

 	var btn = document.getElementById("searchBtn");
	btn.onclick=function(event){
		var text = document.getElementById("query").value;
		
		
		//네이버 검색
		//var url = "https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=";
		
		
		
		//사람인 검색
		var loc_mcd = document.getElementById("loc_mcd");
		loc_mcd = loc_mcd.options[loc_mcd.selectedIndex].value;
		//console.log(loc_mcd);
		
		
		var url = "http://www.saramin.co.kr/zf_user/search?searchType=search&loc_mcd="+loc_mcd
				+"&cat_cd=404&company_cd=0%2C1%2C2%2C3%2C4%2C5%2C6%2C7%2C9%2C10&searchword="
				+text+"&panel_type=&search_optional_item=y&search_done=y&panel_count=y";
				
				
		location.href=url+loc_mcd+text;
		
		
		
		console.log(url);
		
		
		
		
		
		
	};


	
	
	

</script>