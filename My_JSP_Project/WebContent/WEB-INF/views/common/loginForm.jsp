<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<!DOCTYPE html>
    <head>
 
  			
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap Login &amp; Register Templates</title>
	
        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/form-elements.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=request.getContextPath()%>/resources/assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=request.getContextPath()%>/resources/assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=request.getContextPath()%>/resources/assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="<%=request.getContextPath()%>/resources/assets/ico/apple-touch-icon-57-precomposed.png">

    </head>
    <style>
		body{
			background-color: #123123;
		}
	</style>

    <body>
    	

        <!-- Top content -->
	<div class="top-content">

		<div class="container">

			<div class="row">
				<div class="col-sm-8 col-sm-offset-2 text">
					<div class="description">
						<p></p>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-sm-6">

					<div class="form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h3>로그인</h3>
								<p>ID와 비밀번호를 입력하세요</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-key"></i>
							</div>
						</div>
						<div class="form-bottom">
							<form role="form" method="post" class="login-form"
								action="<%=request.getContextPath() %>/common/login.do">
								<div class="form-group">
									<label class="sr-only" for="form-username">이름</label> <input
										type="text" name="id" placeholder="Username..."
										class="form-username form-control" id="inputLogin">
								</div>
								<div class="form-group">
									<label class="sr-only" for="form-password">패스워드</label> <input
										type="password" name="pwd" placeholder="Password..."
										class="form-password form-control" id="inputPw">
								</div>
								<button type="submit" class="btn">로그인</button>
								<button class="btn" onclick="location.href='<%=request.getContextPath()%>/common/registForm.do'">회원가입</button>
								<p>아이디/패스워드 찾기</p>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>




	<!-- Footer -->
        <footer>
        	<div class="container">
        		<div class="row">
        			
        			<div class="col-sm-8 col-sm-offset-2">
        				<div class="footer-border"></div>
        				<p>Shared by <i class="fa fa-love"></i><a href="https://bootstrapthemes.co">BootstrapThemes</a></p>
        			</div>
        			
        		</div>
        	</div>
        </footer>

        <!-- Javascript -->
        <script src="<%=request.getContextPath()%>/resources/assets/js/jquery-1.11.1.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/js/jquery.backstretch.min.js"></script>
        <script src="<%=request.getContextPath()%>/resources/assets/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="<%=request.getContextPath()%>/resources/assets/js/placeholder.js"></script>
        <![endif]-->

    
    
    
    <script>
		var message="${msg}";
		if(message!=""){
			alert(message);
		}
    </script>
    
    	<% session.removeAttribute("msg"); %>
    </body>
    
    
    
    

</html>