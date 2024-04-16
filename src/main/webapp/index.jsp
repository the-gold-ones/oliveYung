<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp" />
<h3>접속중인 사용자수:${user.getActiveSession()}</h3>
<jsp:include page="footer.jsp" />

</body>
</html>