<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<a href="<c:url value='/' />">home</a>
<a href="<c:url value='/spring/greeting' />">greeting</a>
<a href="<c:url value='/spring/hello/Tuncay' />">hello</a>
</body>
</html>
