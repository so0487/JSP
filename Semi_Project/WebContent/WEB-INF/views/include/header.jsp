<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces = "true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>eCommerce HTML-5 Template </title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="manifest" href="site.webmanifest">
		<link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath()%>/resources/assets/img/favicon.ico">
      	<script src="<%=request.getContextPath()%>/resources/assets/js/vendor/jquery.min.js"></script>
      	<script src="<%=request.getContextPath()%>/resources/assets/js/vendor/jquery.js"></script>
		<!-- CSS here -->
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/bootstrap.min.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/owl.carousel.min.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/flaticon.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/slicknav.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/animate.min.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/magnific-popup.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/fontawesome-all.min.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/themify-icons.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/slick.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/nice-select.css">
            <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/style.css">
   </head>
	<style>
		.latest-product-area{padding-bottom:0px;}
		footer{border-top:solid 1px black;}
		.main-header{border-bottom:solid 1px black;}
		.footer-padding{padding : 70px 0 10px 0;background-color:#C8C8C8;}
	</style>
   <body>
       
    <header>
        <!-- Header Start -->
       <div class="header-area">
            <div class="main-header ">
                <div class="header-top top-bg d-none d-lg-block">
                   <div class="container-fluid">
                       <div class="col-xl-12">
                            <div class="row d-flex justify-content-between align-items-center">
                                <div class="header-info-left d-flex">
                                    <div class="flag">
                                        
                                    </div>
                                    <div class="select-this">
                                        
                                    </div>
                                    <ul class="contact-now">     
                                        
                                    </ul>
                                </div>
                                <div class="header-info-right">
                                   <ul>                   
                                   <c:if test="${loginUser.id ne 'admin'}">                       
                                       <li><a href="javascript:goPageMain('/member/myPageForm.do')">My Page </a></li>
                                       <li><a href="javascript:goPageMain('/order/orderedForm.do')">Ordered</a></li>
                                       <li><a href="javascript:goPageMain('/cart/cartForm.do')">Cart</a></li>
                                       <li id="loginText"><a href="javascript:goPageMain('/common/loginForm.do')" style="color:yellow">Login</a></li>
                                       <li><a href="javascript:goPageMain('/common/joinForm.do')" style="color:yellow">Regist</a></li>
                                   </c:if>
                                   <c:if test="${loginUser.id eq 'admin'}">                       
                                       <li><a href="javascript:goPageMain('/member/memberList.do')">MemberList</a></li>
                                       <li><a href="javascript:goPageMain('/order/orderedList.do')">OrderedList</a></li>
                                       <li><a href="javascript:goPageMain('/order/orderedList.do')">ProductList</a></li>
                                       <li id="loginText"><a href="javascript:goPageMain('/common/loginForm.do')" style="color:yellow">Login</a></li>
                                       <li><a href="javascript:goPageMain('/common/joinForm.do')" style="color:yellow">Regist</a></li>
                                   </c:if>
                                   </ul>
                                </div>
                            </div>
                       </div>
                   </div>
                </div>
               <div class="header-bottom  header-sticky">
                    <div class="container-fluid">
                        <div class="row align-items-center">
                            <!-- Logo -->
                            <div class="col-xl-1 col-lg-1 col-md-1 col-sm-3">
                                <div class="logo">
                                  <a href="<%=request.getContextPath()%>/"><img style="width:150px;" src="<%=request.getContextPath()%>/resources/assets/img/logo/LostlogoF.png" alt=""></a>
                                </div>
                            </div>
                            <div class="col-xl-7 col-lg-8 col-md-7 col-sm-5">
                                <!-- Main-menu -->
                                <div class="main-menu f-right d-none d-lg-block">
                                    <nav>                                                
                                        <ul id="navigation">
											<c:forEach items="${menuList}" var="menu">
                                        	    <li><a href="javascript:goPage('${menu.murl}','${menu.mcode}');">${menu.mname}</a></li>
											</c:forEach>
                                        </ul>
                                    </nav>
                                </div>
                            </div> 
<!--                             <div class="col-xl-4 col-lg-3 col-md-3 col-sm-3 fix-card"> -->
<!--                                 <ul class="header-right f-right d-none d-lg-block d-flex justify-content-between"> -->
<!--                                     <li> -->
<!--                                         <div class="shopping-card"> -->
<!--                                             <a href="cart.html"><i class="fas fa-shopping-cart"></i></a> -->
<!--                                         </div> -->
<!--                                     </li> -->
<!--                                    <li class="d-none d-lg-block"> <a href="#" class="btn header-btn">Log-in</a></li> -->
<!--                                    <li class="d-none d-lg-block"> <a href="#" class="btn header-btn">Regist</a></li> -->
<!--                                 </ul> -->
<!--                             </div> -->
                            <!-- Mobile Menu -->
                            <div class="col-12">
                                <div class="mobile_menu d-block d-lg-none"></div>
                            </div>
                        </div>
                    </div>
               </div>
            </div>
       </div>
        <!-- Header End -->
    </header>
    
    <script>
         $(document).ready(function(){
            var logInfo = "${loginUser}";
            if(logInfo!=""){
               $('#loginText').html('<a href="<%=request.getContextPath()%>/common/logout.do" style="color:yellow">logout</a>');                         
            }
         });
    </script>
