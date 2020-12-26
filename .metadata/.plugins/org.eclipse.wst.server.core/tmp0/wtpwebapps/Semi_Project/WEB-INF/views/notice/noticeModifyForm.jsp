<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%@ include file="/WEB-INF/views/include/open_header.jsp" %>


 <section class="content container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card card-outline card-info">
					<div class="card-header row">
						<h4 class="col-md-8">공지 수정</h4>
						<div class="col-md-4">
							<div class="float-right">
								<button type="button" class="btn btn-warning" id="modifyBtn">수 정</button>
								&nbsp;&nbsp;&nbsp;&nbsp;
								<button type="button" class="btn btn-default " id="cancelBtn">취 소</button>
							</div>
						</div>
					</div><!--end card-header  -->
					<div class="card-body">
						<form role="form" method="post" action="noticeModify.do" name="noticeModifyForm">
							
							<div class="form-group">
								<label for="title">제 목</label> 
								<input type="text" id="title" name='title' class="form-control" value="${notice.title }">
							</div>
							<div class="form-group">
								<label for="title">번호</label> 
								<input type="text" id="nno" name='nno' class="form-control" value="${notice.nno}" readonly>
							</div>
							<div class="form-group">
								<label for="writer">작성자</label> 
								<input type="text" id="writer" readonly	name="writer" class="form-control"  value="${notice.writer }">
							</div>
							<div class="form-group">
								<label for="content">내 용</label>		
								<textarea class="form-control" name="content" id="content" rows="3"
									placeholder="500자 내외로 작성하세요.">${notice.content }</textarea>						
							</div>
						</form>
					</div><!--end card-body  -->
					
				</div><!-- end card -->				
			</div><!-- end col-md-12 -->
		</div><!-- end row -->
    </section>
    <!-- /.content -->
    <script>
	$('#modifyBtn').on('click',function(e){				
		var title=$('input[name="title"]');
		if(title.val()==""){
			alert("제목은 필수입니다.");			
			title.focus();
			return;
		}
		var form=document.noticeModifyForm;		
		form.submit();
	});
	
	$('#cancelBtn').on('click',function(e){
		history.go(-1);
	});
</script>  
    
    
    
    

<%@ include file="/WEB-INF/views/summernote/summernote.jsp" %>  
<%@ include file="/WEB-INF/views/include/open_footer.jsp" %>  