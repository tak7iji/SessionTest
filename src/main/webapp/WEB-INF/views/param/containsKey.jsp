<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
	<c:choose>
		<c:when test="${param.containsKey('foo')}">
		    <div id="containsKey">
		        <h1>OK</h1>
		    </div>
		</c:when>
	</c:choose>
    <a id="back" href="${pageContext.request.contextPath}/welcome/">back</a> 
</body>
</html>
