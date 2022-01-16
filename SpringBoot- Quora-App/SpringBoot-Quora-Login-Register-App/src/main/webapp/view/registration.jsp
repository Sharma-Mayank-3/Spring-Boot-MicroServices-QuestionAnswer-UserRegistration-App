<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Quora Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<%@ page isELIgnored="false"%>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue">
			<div>
				<a href="https://www.xadmin.net" class="navbar-brand">
					Registration Page </a>
			</div>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div>${nope}</div>
		<div class="card">
			<div class="card-body">
				<form action="insert" method="post">
					<fieldset class="form-group">
						<label>Name :</label> <input type="text" class="form-control"
							name="name" required="required">
					</fieldset>

					<fieldset class="form-group">
						<label>Password : </label> <input type="password" class="form-control"
							name="password">
					</fieldset>

					<fieldset class="form-group">
						<label>age :</label> <input type="text" class="form-control"
							name="age" required="required">
					</fieldset>

					<fieldset class="form-group">
						<label>Address :</label> <input type="text" class="form-control"
							name="address" required="required">
					</fieldset>

					<button type="submit" class="btn btn-success">Save</button>
					<div class="container text-right"></div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>