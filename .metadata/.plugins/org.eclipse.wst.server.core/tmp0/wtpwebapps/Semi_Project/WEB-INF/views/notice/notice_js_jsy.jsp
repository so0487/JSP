<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<script>


var formObj = $("form[role='form']");	


$('#registBtn').on('click',function(e){
	//alert("regist btn click");
	
	var form=document.registForm;
	
	if(form.title.value==""){
		alert("제목은 필수입니다.");
		return;
	}
	
	form.submit();
});

$('button#modifyBtn').on('click',function(evnet){
	//alert("modify click");
	formObj.attr({
		'action':'noticeModifyForm.do',
		'method':'post'
	});
	formObj.submit();
});

$('#cancelBtn').on('click',function(e){
	history.go(-1);
});
 
$("#removeBtn").on("click", function(){
	//alert("remove click");
	var answer = confirm("정말 삭제하시겠습니까?");
	if(answer){		
		formObj.attr("action", "noticeRemove.do");
		formObj.attr("method", "post");
		formObj.submit();
	}
});
$("#listBtn").on("click", function(){
	//alert("list click");
	window.opener.location.reload(true);
	window.close();
});

</script>