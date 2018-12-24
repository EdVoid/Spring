<%@ page language="java" errorPage="/Jsp/ErrorPage.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>


	<jsp:useBean id="ProductoBean" class="bean.Producto" scope="page">		</jsp:useBean>
			<jsp:setProperty name="ProductoBean" property="*" />	
ID
<jsp:getProperty property="id" name="ProductoBean"/>
<br>
<jsp:getProperty property="nombre" name="ProductoBean"/>
<br>
<jsp:getProperty property="descripcion" name="ProductoBean"/>
<jsp:getProperty property="tipo" name="ProductoBean"/>
<jsp:getProperty property="invet.precio" name="ProductoBean"/>

</form>



</body>
</html>