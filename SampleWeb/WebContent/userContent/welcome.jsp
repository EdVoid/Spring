<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<center><p>Welcome ${sessionScope.currentSessionUser}</p> </center>
<BR/>
<h1>Options Available</h1>
<a href="MainServlet">Student Details</a>
<%="Users " + com.ibm.bb.wrkshp.web.UserTracker.getUsers() %>
</body>
</html>