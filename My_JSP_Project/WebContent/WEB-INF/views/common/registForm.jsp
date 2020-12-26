<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>회원가입</title>
<style>
select {
	border: 1px solid #ebebeb;
	border-radius: 5px;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	-o-border-radius: 5px;
	-ms-border-radius: 5px;
	box-sizing: border-box;
	padding: 15px 20px;
	font-size: 14px;
	font-weight: bold;
	font-family: 'Montserrat';
}
</style>
<!-- Font Icon -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/colorlib-regform-14/fonts/material-icon/css/material-design-iconic-font.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/colorlib-regform-14/vendor/jquery-ui/jquery-ui.min.css">

<!-- Main css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/colorlib-regform-14/css/style.css">
</head>
<body>

	<div class="main">
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<form method="POST" id="signup-form" class="signup-form">
						<div class="form-row">
							<div class="form-group">
								<label for="first_name">이름</label> <input type="text" class="form-input" name="name" id="name" />
							</div>
							<div class="form-group">
								<label for="last_name">아이디</label> <input type="text" class="form-input" name="id" id="id" />
							</div>
						</div>
						<div class="form-row">
							<div class="form-group">
								<label for="password">패스워드</label> <input type="password" class="form-input" name="pwd" id="pwd" />
							</div>
							<div class="form-group">
								<label for="re_password">패스워드 재확인</label> <input type="password" class="form-input" name="pwCheck" id="pwCheck" />
							</div>
						</div>

						<div class="form-row">
							<div class="form-radio">
								<label for="gender">성별</label>
								<div class="form-flex">
									<input type="radio" name="gender" value="male" id="male" checked="checked" />
									<label for="male">남자</label>
									<input type="radio" name="gender" value="female" id="female" />
									<label for="female">여자</label>
								</div>
							</div>

						</div>
						<div class="form-row">
							<label>생년월일</label>
						</div>
						<div class="form-row">
							<input type="text" class="form-input" name="birth"><label>년</label>
							<select name="birth">

							<c:forEach var="i" begin="1" end="12" step="1">
								<option>${i}</option>								
							</c:forEach>
							
							</select><label>월</label>
							<select name="birth">
								<c:forEach var="i" begin="1" end="31" step="1">
									<option>${i}</option>
								</c:forEach>
							</select> <label>일</label>
						</div>
						<div class="form-row">
							<label for="phone_number">휴대폰번호</label>
						</div>
						<div class="form-row">
							<input type="number" class="form-input" name="phone" id="phone_number" />
							<p>-</p>
							<input type="number" class="form-input" name="phone" id="phone_number" />
							<p>-</p>
							<input type="number" class="form-input" name="phone" id="phone_number" />
						</div>
						<div class="form-row">
					
							<label for="email">Email</label>
						</div>
						<div class="form-row">
							<input type="text" class="form-input" name="email" id="email" />
							<p>@</p>
							<select name="email">
								<option value="naver.com">naver.com</option>
                  				<option value="gmail.com">gmail.com</option>
                  				<option value="daum.net">daum.net</option>
							</select>
						</div>
                        <div class="form-group">
                            <input type="submit" name="submit" id="submit" class="form-submit" value="Submit"/>
                        </div>
                    </form>
                </div>
            </div>
        </section>
    </div>
				


	<!-- JS -->
	<script	src="<%=request.getContextPath()%>/resources/colorlib-regform-14/vendor/jquery/jquery.min.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/colorlib-regform-14/vendor/jquery-ui/jquery-ui.min.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/colorlib-regform-14/vendor/jquery-validation/dist/jquery.validate.min.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/colorlib-regform-14/vendor/jquery-validation/dist/additional-methods.min.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/colorlib-regform-14/js/main.js"></script>
</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>