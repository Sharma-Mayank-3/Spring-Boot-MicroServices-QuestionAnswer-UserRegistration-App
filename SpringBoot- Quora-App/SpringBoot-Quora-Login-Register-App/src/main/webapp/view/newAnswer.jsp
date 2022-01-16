<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
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
				<a href="https://www.xadmin.net" class="navbar-brand"> Submit your Answer </a>
			</div>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<form action="newAnswerPost" method="post">
					<!-- <fieldset class="form-group">
						<label>Name :</label> <input type="text" class="form-control"
							name="question" required="required">
					</fieldset> -->

					<fieldset class="form-group">
						<textarea id="w3review" name="answer" rows="4" cols="50">
  						
  						</textarea>
					</fieldset>
					<input type="hidden" name="qid" value="<c:out value='${qid}' />" />

					<button type="submit" class="btn btn-success">submit</button>
					<div class="container text-right">

						<%-- <a href="<%=request.getContextPath()%>/register"
							class="btn btn-success"> New Registration </a> --%>

						<%-- <a href=${requestScope['javax.servlet.forward.request_uri']}register
							class="btn btn-success"> New Registration </a> --%>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>