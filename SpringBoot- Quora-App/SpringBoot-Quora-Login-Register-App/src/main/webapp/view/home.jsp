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
				<a href="https://www.xadmin.net" class="navbar-brand"> Question Page </a>
			</div>
			
			<div class="container text-right">

				<a href="<%=request.getContextPath()%>/logout"
					class="btn btn-success pull-right"> Logout </a>
			</div>
		</nav>
	</header>
	<br>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Question's</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/newQuestion" class="btn btn-success">Ask
					New Question</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Question</th>
						<th>Answers</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="question" items="${allQuestion}">

						<tr>
							<td><c:out value="${question.question}" /></td>
							<td><a href="answer?qid=<c:out value='${question.qid}' />">View Answer</a>
								&nbsp;&nbsp;&nbsp;&nbsp; 
							
						</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>
</body>
</html>