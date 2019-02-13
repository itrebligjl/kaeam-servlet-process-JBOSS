<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<title>KAEAM Process (JBOSS)</title>
</head>
<body>
<p>Start KAEAM Process</p>
<p><%= request.getAttribute("message") == null ? "" : request.getAttribute("message") %></p>
<form method="post" action="process">
<input type="submit" value="Start Process">
</form>
</body>
</html>