<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Football Management system </title>
</head>
<body>
    <h2>List of Players</h2>
	<c:forEach items="${players}" var="p"><p>${p.toString()}</p></c:forEach>
    <h2>List of Stats</h2>
	<c:forEach items="${stats}" var="s"><p>${s.toString()}</p></c:forEach>
    <h2>List of Teams</h2>
	<c:forEach items="${teams}" var="t"><p>${t.toString()}</p></c:forEach>
    <h2>List of Fixtures</h2>
	<c:forEach items="${fixtures}" var="f"><p>${f.toString()}</p></c:forEach>
    <h2>List of League</h2>
	<c:forEach items="${leagues}" var="l"><p>${l.toString()}</p></c:forEach>
</body>
</html>