<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href = "css/signupStyle.css" TYPE = "text/css">
<title>Insert title here</title>
</head>
<body>
	
	<div class="Signup-form">
  		<form method="post" action="addUser">
   	 		<h1>Sign-up</h1>
    		<div class="content">
      			<div class="input-field">
        		<input type="text" placeholder="Enter Username" name="userName" required>
      			</div>
      			<div class="input-field">
        		 <input type="password" placeholder="Enter Password" name="password" required>
      			</div>
      			<div class="input-field">
        		  <input type="number" placeholder="Enter Phone Number" name="phoneNumber" required>
      			</div>
      			<div class="input-field">
        		 <input type="email" placeholder="Enter Email Id" name="email" required>
      			</div>
      			<div class="input-field">
        		  <input type="text" placeholder="Enter your Address" name="address" required>
      			</div>
      		</div>
      		<div class="action">
      			<button>Register</button>
      			
    		</div>
    		
    	</form>
    </div>
</body>
</html>