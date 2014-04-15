<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Hello World!</h2>

<c:url var="dataUrl" value="/data"/>
<div><a href="${dataUrl}">View Data Table</a></div>

<c:url var="messageUrl" value="/message"/>
<form method="post" action="${messageUrl}">
    <input type="text" name="msg"/>
    <input type="submit" value="Submit"/>
</form>


</body>
</html>
