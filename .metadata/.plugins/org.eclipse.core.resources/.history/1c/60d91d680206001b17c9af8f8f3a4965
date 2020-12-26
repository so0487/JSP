<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces = "true" %>
<%@ include file="/WEB-INF/views/include/open_header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!-- slider Area Start-->
    <div class="slider-area ">
        <!-- Mobile Menu -->
        <div class="single-slider slider-height2 d-flex align-items-center" data-background="<%=request.getContextPath()%>/resources/assets/img/hero/category.jpg">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="hero-cap text-center">
                            <h2>Top</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- slider Area End-->
    
    <!-- product list part start-->
    <section class="product_list section_padding">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="product_sidebar">
                        <div class="single_sedebar">
                            <form action="#">
                                <input type="text" name="#" placeholder="Search keyword">
                                <i class="ti-search"></i>
                            </form>
                        </div>
                        <div class="single_sedebar">
                            <div class="select_option">
                                <div class="select_option_list">Category <i class="right fas fa-caret-down"></i> </div>
                                <div class="select_option_dropdown">
                                    <p><a href="#">LONG</a></p>
                                    <p><a href="#">SHORT</a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-8">
                    <div class="product_list">
                        <div class="row">
	                        <c:forEach items="${dataMap.topList}" var="cloth">
	                          	<c:if test="${cloth.cscode eq 'T_SHORT' or cloth.cscode eq 'T_LONG'}">
	                            <div class="col-lg-4 col-sm-4">
	                                <div class="single_product_item">
	                                    <img class="img-fluid" alt="옷 사진" src="<%=request.getContextPath()%>/resources/img/${cloth.cimage}">
	                                    <h3> <a href="topDetail.do?ccode=${cloth.ccode}">${cloth.cname}</a></h3>
	                                    <p>${cloth.price}</p>
	                                </div>
	                            </div>
	                     	</c:if> 
	                     	</c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- product list part end-->
    
<%@ include file="/WEB-INF/views/include/open_footer.jsp" %>