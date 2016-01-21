<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
    <spring:eval var="sessionData" expression="@sessionData" />
    <div id="sessionData_wo_fh">
        <h1>${sessionData.message}</h1>
    </div>
    <a id="back" href="${pageContext.request.contextPath}/welcome/">back</a> 
</body>
</html>
