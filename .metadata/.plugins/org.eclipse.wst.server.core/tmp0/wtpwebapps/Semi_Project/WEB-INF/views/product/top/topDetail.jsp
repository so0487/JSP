<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="manifest" href="site.webmanifest">
<link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath()%>/resources/assets/img/favicon.ico">

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


<body>

	<!-- slider Area Start-->
	<div class="slider-area ">
		<!-- Mobile Menu -->
		<div class="single-slider slider-height2 d-flex align-items-center"
			data-background="<%=request.getContextPath()%>/resources/assets/img/hero/category.jpg">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="hero-cap text-center">
							<h2>product Details</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- slider Area End-->

	<!--================Single Product Area =================-->
	<div class="product_image_area">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-12">
					<div class="product_img_slide owl-carousel">
						<div class="single_product_img">
							<img src="<%=request.getContextPath()%>/resources/img/${cloth.cimage}" alt="#" class="img-fluid">
						</div>
					</div>
				</div>
				<div class="col-lg-8">
					<div class="single_product_text text-center">
						<h3>${cloth.cname}</h3>
						<p>${cloth.detail}</p>
						<div class="card_area">
							<div class="product_count_area">
								<p>Quantity</p>
								<div class="product_count d-inline-block">
									<span class="product_count_item inumber-decrement">
									 <i	class="ti-minus"></i>
									</span> 
								<input class="product_count_item input-number" type="text" value="1" min="0" max="10">
								 <span class="product_count_item number-increment">
								  <i class="ti-plus"></i>
								 </span>
								</div>
								<p>${cloth.price}</p> <!-- 지금은 1개의 가격만 표시... 카트테이블과 합쳐 total금액으로 나와야 할 듯..... -->
							</div>
							<div class="add_to_cart">
								<a href="#" class="btn_3">add to cart</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--================End Single Product Area =================-->
	
	
	
	
	
	<!-- 하단 부분은 지워도 될 듯..... -->
	
	<!-- subscribe part here -->
	<section class="subscribe_part section_padding">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-8">
					<div class="subscribe_part_content">
						<h2>Get promotions & updates!</h2>
						<p>Seamlessly empower fully researched growth strategies and
							interoperable internal or “organic” sources credibly innovate
							granular internal .</p>
						<div class="subscribe_form">
							<input type="email" placeholder="Enter your mail"> <a
								href="#" class="btn_1">Subscribe</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- subscribe part end -->

	

	<!-- JS here -->
	<!-- All JS Custom Plugins Link Here here -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/vendor/modernizr-3.5.0.min.js"></script>

	<!-- Jquery, Popper, Bootstrap -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/vendor/jquery-1.12.4.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/popper.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/bootstrap.min.js"></script>
	<!-- Jquery Mobile Menu -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/jquery.slicknav.min.js"></script>

	<!-- Jquery Slick , Owl-Carousel Plugins -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/owl.carousel.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/slick.min.js"></script>

	<!-- One Page, Animated-HeadLin -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/wow.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/animated.headline.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/jquery.magnific-popup.js"></script>

	<!-- Scrollup, nice-select, sticky -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/jquery.scrollUp.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/jquery.nice-select.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/jquery.sticky.js"></script>

	<!-- contact js -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/contact.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/jquery.form.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/jquery.validate.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/mail-script.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/jquery.ajaxchimp.min.js"></script>

	<!-- Jquery Plugins, main Jquery -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/plugins.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/main.js"></script>

	<!-- swiper js -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/swiper.min.js"></script>
	<!-- swiper js -->
	<script src="<%=request.getContextPath()%>/resources/assets/js/mixitup.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/jquery.counterup.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/assets/js/waypoints.min.js"></script>


</body>

</html>