<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<!-- include summernote css/js -->
<link href="<%=request.getContextPath()%>/resources/summernote/summernote.min.css" rel="stylesheet">
<style>
	.summernote{
		width: 500px;
		height: 400px;
	}
</style>
</head>
<body>


<form method="post" action="receive.jsp">
	<div class="summernote">
		<textarea id="summernote" name="editordata" rows="20" cols="100"></textarea>
	</div>
	<input type="submit" value="전송">
</form>




<script>
window.onload=function(){
	$('#summernote').summernote({
		height:300,
		placeholder : '여기에 당신에 감성을 노래해요.'
	});
};
</script>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/summernote/summernote.min.js"></script>
</body>
</html>