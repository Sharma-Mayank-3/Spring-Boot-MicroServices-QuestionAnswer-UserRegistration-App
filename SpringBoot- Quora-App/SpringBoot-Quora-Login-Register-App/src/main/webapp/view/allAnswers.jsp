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

			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/home" class="btn btn-success">Home
					Page </a>
			</div>

			<div class="container text-right">

				<a href="<%=request.getContextPath()%>/logout"
					class="btn btn-success"> Logout </a>
			</div>
		</nav>
	</header>
	<br>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">${questionById.question}</h3>
			<hr>
			<br>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/newAnswer?qid=<c:out value='${questionById.qid}'/>"
					class="btn btn-success">Submit your Answer</a>
			</div>
			<br>
			
			<table class="table table-bordered">
				<thead>
					<tr>
						<th class="container text-center">List of Answers</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="answers" items="${allAnswers}">

						<tr>
							<td><c:out value="${answers.answer}" /></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>
</body>
</html>