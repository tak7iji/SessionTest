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
        <p>The time on the server is ${serverTime}.</p>
        <ul>
        	<li><a id="containsKey" href="${pageContext.request.contextPath}/welcome/containsKey?foo">containsKey</a>        	
        	<li><a id="notnull" href="${pageContext.request.contextPath}/welcome/notnull?foo">notnull</a>        	
        	<li><a id="sessionData" href="${pageContext.request.contextPath}/welcome/sessionData">f:h(sessionData.message)</a>        	
	        <li><a id="sessionData_wo_fh" href="${pageContext.request.contextPath}/welcome/sessionData_wo_fh">sessionData.message</a>
    	    <li><a id="sessionData2" href="${pageContext.request.contextPath}/welcome/sessionData2">f:h(sessionData2.message)</a>
        	<li><a id="sessionData2_wo_fh" href="${pageContext.request.contextPath}/welcome/sessionData2_wo_fh">sessionData2.message</a>
        	<li><a id="sessionDataClassName" href="${pageContext.request.contextPath}/welcome/sessionDataClassName">f:h(sessionScope['scopedTarget.sessionData'].getClass().getName())</a>        	
        	<li><a id="sessionDataClassName2" href="${pageContext.request.contextPath}/welcome/sessionDataClassName2">f:h(sessionScope.sessionData.getClass().getName())</a>        	
        	<li><a id="sessionDataClassName3" href="${pageContext.request.contextPath}/welcome/sessionDataClassName3">f:h(sessionScope[scopedTarget.sessionData].getClass().getName())</a>        	
        	<li><a id="sessionData2ClassName" href="${pageContext.request.contextPath}/welcome/sessionData2ClassName">f:h(sessionScope.sessionData2.getClass().getName())</a>        	
        	<li><a id="sessionData2ClassName2" href="${pageContext.request.contextPath}/welcome/sessionData2ClassName2">f:h(sessionScope['sessionData2'].getClass().getName())</a>        	
        	<li><a id="sessionData2ClassName_wo_fh" href="${pageContext.request.contextPath}/welcome/sessionData2ClassName_wo_fh">sessionScope.sessionData2.getClass().getName()</a>        	
        	<li><a id="sessionData2ClassName_wo_fh2" href="${pageContext.request.contextPath}/welcome/sessionData2ClassName_wo_fh2">sessionScope['sessionData2'].getClass().getName()</a>        	
        	<li><a id="noClassName" href="${pageContext.request.contextPath}/welcome/noClassName">noClassName</a>        	
        	<li><a id="noClassName2" href="${pageContext.request.contextPath}/welcome/noClassName2">noClassName2</a>        	
        </ul>
        <p>${sessionScope}
    </div>
</body>
</html>
