<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ include file="/WEB-INF/views/include/open_header.jsp"%>





	<!-- Main content -->
	<div class="row">
		<div class="col-md-12">
			<div class="card-header">
				<h3 class="card-title">상세보기</h3>
			</div>
			<div class="card-body">
				<div class="form-group col-sm-12">
					<label for="title">제 목</label> <input type="text"
						class="form-control" id="title" readonly value="${notice.title}" />
				</div>
				<div class="row">
					<div class="form-group col-sm-3">
						<label for="writer">번호</label>
						<input type="text" class="form-control" id="nno" readonly value="${notice.nno }" />
					</div>
					<div class="form-group col-sm-3">
						<label for="writer">작성자</label>
						<input type="text" class="form-control" id="writer" readonly value="${notice.writer }" />
					</div>

					<div class="form-group col-sm-3">
						<label for="regDate">작성일</label>
						<input type="text" class="form-control" id="regDate" 
						readonly value="<fmt:formatDate value="${notice.regDate}" pattern="yyyy-MM-dd" />" />

					</div>
					<div class="form-group col-sm-3">
						<label for="viewcnt">조회수</label>
						<input type="text" class="form-control" id="viewcnt" readonly value="${notice.viewcnt}" />
					</div>
				</div>
				<div>
					<label for="content">내 용</label>
					<div class="content" id="content">${notice.content}</div>
				</div>
			</div><!-- cardbody -->
		</div>
		<!-- end col-md-12 -->
	</div>
	<!-- end row  -->
	<button type="button" id="modifyBtn" name="modifyBtn" class="genric-btn success circle">수정</button>	
	<button type="button" id="removeBtn" name="removeBtn"class="genric-btn danger circle">삭제</button>	
	<button type="button" id="listBtn" name="listBtn" class="genric-btn primary circle">닫기</button>	

<form role="form">
	<input type="hidden" name="nno" value="${notice.nno}"/>
</form>


<%@ include file="notice_js_jsy.jsp" %>
<%@ include file="/WEB-INF/views/include/open_footer.jsp"%>
