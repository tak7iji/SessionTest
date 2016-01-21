<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
    <div id="sessionData2">
        <h1>${f:h(sessionData2.message)}</h1>
    </div>
    <a id="back" href="${pageContext.request.contextPath}/welcome/">back</a> 
</body>
</html>
