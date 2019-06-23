<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="./resources/css/main.css">
</head>
<body>
	
	
	<div class="container-login100">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
			<form:form action="validate" method="post" id="Login" class="login100-form">
				<span class="login100-form-title p-b-37">
					Rústico Restaurant
				</span>

				<div class="wrap-input100 m-b-20" data-validate="Enter username">
					<input class="input100" type="text" name="username" id = "usernameInput" placeholder="username">
				</div>

				<div class="wrap-input100 m-b-25" data-validate = "Enter password">
					<input class="input100" type="password" name="password" id = "passwordInput" placeholder="password">
				</div>

				<div class="container-login100-form-btn">
					<button type="submit" class="login100-form-btn">
						Ingresar
					</button>
				</div>
			</form:form>

			
		</div>
	</div>

</body>
</html>