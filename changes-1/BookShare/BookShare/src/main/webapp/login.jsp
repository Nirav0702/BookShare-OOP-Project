<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "css/loginStyle.css" TYPE = "text/css">
<title>Insert title here</title>
</head>
<body>

	<div class="login-form">
  		<form method="post" action="userHome">
   	 		<h1>Login</h1>
    		<div class="content">
      			<div class="input-field">
        		<input type="text" placeholder="Enter Username" name="uname" required>
      			</div>
      			<div class="input-field">
        		<input type="password" placeholder="Enter Password" name="psw" required>
      			</div>
       		<span class="psw">Forgot <a href="#">password?</a></span>
    		</div>
    		<div class="action">
      			<button>Register</button>
      			<button>Sign in</button>
    		</div>
    	</form>
    </div>
    
</body>
</html>