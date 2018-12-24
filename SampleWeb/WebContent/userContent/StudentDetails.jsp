<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h1>Student Records</h1>
<table border="1" style="width:100%">
<TR><TH>STUDENT ID</TH><TH>NAME</TH><TH>SUBJECT</TH><TH>SCORE</TH>
</TR>

 <c:if test = "${not empty sessionScope.currentSessionUser}">
<c:forEach var="student" items="${sessionScope.students}">
<TR><TD align="center"><c:out value="${student.id}"/> </TD><TD align="center"><c:out value="${student.name}"/> </TD><td align="center"><c:out value="${student.subject}"/> </td><td align="center"><c:out value="${student.score}"/> </td></TR>
</c:forEach>
</c:if>
</table>


</body>
</html>