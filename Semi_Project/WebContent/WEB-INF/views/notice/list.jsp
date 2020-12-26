<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/views/include/open_header.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- slider Area Start-->
 <c:set var="pageMaker" value="${dataMap.pageMaker }" />	
<div class="slider-area ">
	<!-- Mobile Menu -->
	<div class="single-slider slider-height2 d-flex align-items-center"
		data-background="<%=request.getContextPath()%>/resources/assets/img/hero/category.jpg">
		<div class="container">
			<div class="row">
				<div class="col-xl-12">
					<div class="hero-cap text-center">
						<h2>공지사항</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- slider Area End-->


<!-- Main content -->
<section class="content">
	<div class="card">
		<div class="card-header with-border">
			<div id="keyword" class="card-tools" style="width: 350px;">
				<div class="input-group row">
					<select class="form-control col-md-4" name="searchType"
						id="searchType">
						<option value="tcw"
							${pageMaker.cri.searchType eq 'tcw' ? 'selected':'' }>전
							체</option>
						<option value="t"
							${pageMaker.cri.searchType eq 't' ? 'selected':'' }>제 목</option>
						<option value="w"
							${pageMaker.cri.searchType eq 'w' ? 'selected':'' }>작성자</option>
						<option value="c"
							${pageMaker.cri.searchType eq 'c' ? 'selected':'' }>내 용</option>
						<option value="tc"
							${pageMaker.cri.searchType eq 'tc' ? 'selected':'' }>제목+내용</option>
						<option value="cw"
							${pageMaker.cri.searchType eq 'cw' ? 'selected':'' }>작성자+내용</option>
					</select> 
						<input class="form-control" type="text" name="keyword" placeholder="검색어를 입력하세요." value="${param.keyword }" />
						<span class="input-group-append">
						<button class="btn btn-primary" type="button"onclick="searchList_go(1);" data-card-widget="search">
						<i class="fa fa-fw fa-search"></i>
						</button>
					</span>
				</div>
			</div>
		</div>
	</div>
</section>











<!-- product list part start-->
<section class="product_list section_padding">
	<div class="container">
		<h3 class="mb-30">공지사항</h3>
		<div class="progress-table-wrap" style="overflow-x:hidden;">
			<div class="progress-table">
				<div class="table-head">
					<div class="serial">번호</div>
					<div class="percentage">제목</div>
					<div class="country">작성자</div>
					<div class="percentage">작성일</div>
					<div class="visit">조회수</div>
				</div>
				<c:forEach items="${dataMap.noticeList}" var="notice">
					<div class="table-row">
						<div class="serial">${notice.nno}
							<a href="#"
								onClick="OpenWindow('noticeDetail.do?nno=${notice.nno}');">${notice.nno}</a>
						</div>
						<div class="percentage">${notice.title}
							<a href="#"
								onClick="OpenWindow('noticeDetail.do?nno=${notice.nno}');">${notice.nno}</a>
						</div>
						<div class="country">${notice.writer}</div>
						<div class="percentage">
							<fmt:formatDate value="${notice.regDate}" pattern="yyyy-MM-dd" />
						</div>
						<div class="visit">${notice.viewcnt}</div>
					</div>
				</c:forEach>
			</div>
			<div class="container">
				<button type="button" class="genric-btn success large" id="registBtn" onclick="OpenWindow('noticeRegistForm.do' );">공지등록</button>
			</div>
		</div>
	</div>
</section>
<!-- product list part end-->


<div class="card-footer">
	<%@ include file="/WEB-INF/views/pagination/pagination.jsp"%>
</div>

<!-- /.content-wrapper -->
<form id="jobForm">
	<input type='hidden' name="page" value="${pageMaker.cri.page}" /> <input type='hidden' name="perPageNum" value="${pageMaker.cri.perPageNum}" />
	<input type='hidden' name="searchType" value="${pageMaker.cri.searchType }" /> <input type='hidden'	name="keyword" value="${pageMaker.cri.keyword }" />
</form>

<script>
	
	$('#searchBtn').on('click',function(e){
		
		var jobForm=$('#jobForm');
		jobForm.find("[name='page']").val(1);
		jobForm.find("[name='searchType']").val($('select[name="searchType"]').val());
		jobForm.find("[name='keyword']").val($('input[name="keyword"]').val());
		
		/* alert(jobForm.serialize()); */
		
		jobForm.attr("action","list.do").attr("method","get");
		jobForm.submit();
	});
	
	
</script>

</body>




<%@ include file="/WEB-INF/views/include/open_footer.jsp"%>

