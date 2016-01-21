<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
    <div id="sessionData2ClassName_wo_fh2">
        <p>Class: ${sessionScope['sessionData2'].getClass().getName()}</p>
    </div>
    <a id="back" href="${pageContext.request.contextPath}/welcome/">back</a> 
</body>
</html>
