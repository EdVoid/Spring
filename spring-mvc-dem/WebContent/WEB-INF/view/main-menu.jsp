<!DOCTYPE html>
<html>

	<head>
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/resources/css/my-test.css">
			
		<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
	</head>
	<body>
		<h2>String MVC Demo - Home Page</h2>
		
		<hr>
		<br><br>
		<p>
		<img src="${pageContext.request.contextPath}/resources/images/first fire.png"/>
		</p>		
		<a href="hello/showForm">Hello World Form</a>
		
		<br><br>
		
		<a href="student/showForm">Student Form</a>
		
		<input type="button" onclick="doSomeWork()" value ="Click Me"/>
	</body>
</html>