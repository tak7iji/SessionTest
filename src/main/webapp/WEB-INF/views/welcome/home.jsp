<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<link rel="stylesheet"
    href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
    <div id="wrapper">
    	<c:choose>
    		<c:when test="${empty param.foo}">
    			<p>No parameter!</p>
    		</c:when>
    	</c:choose>
        <p>The time on the server is ${serverTime}.</p>
        <ul>
        	<li><a id="sessionData" href="${pageContext.request.contextPath}/welcome/sessionData">f:h(sessionData.message)</a>        	
	        <li><a id="sessionData_wo_fh" href="${pageContext.request.contextPath}/welcome/sessionData_wo_fh">sessionData.message</a>
    	    <li><a id="sessionData2" href="${pageContext.request.contextPath}/welcome/sessionData2">f:h(sessionData2.message)</a>
        	<li><a id="sessionData2_wo_fh" href="${pageContext.request.contextPath}/welcome/sessionData2_wo_fh">sessionData2.message</a>
        	<li><a id="sessionDataClassName" href="${pageContext.request.contextPath}/welcome/sessionDataClassName">f:h(sessionScope['scopedTarget.sessionData'].getClass().getName())</a>        	
        	<li><a id="sessionData2ClassName" href="${pageContext.request.contextPath}/welcome/sessionData2ClassName">f:h(sessionScope.sessionData2.getClass().getName())</a>        	
        	<li><a id="sessionData2ClassName2" href="${pageContext.request.contextPath}/welcome/sessionData2ClassName2">f:h(sessionScope['sessionData2'].getClass().getName())</a>        	
        	<li><a id="sessionData2ClassName_wo_fh" href="${pageContext.request.contextPath}/welcome/sessionData2ClassName_wo_fh">sessionScope.sessionData2.getClass().getName()</a>        	
        	<li><a id="sessionData2ClassName_wo_fh2" href="${pageContext.request.contextPath}/welcome/sessionData2ClassName_wo_fh2">sessionScope['sessionData2'].getClass().getName()</a>        	
        </ul>
    </div>
</body>
</html>
