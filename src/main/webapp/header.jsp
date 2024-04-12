<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#container {
    display: flex;
    justify-content: center;
}

header#header nav.top_util { display: flex; justify-content: space-between; align-items: center; }
header#header nav.top_util hgroup.header_inner { display: inline-block; margin-right: 20px}
header#header nav.top_util ul.menu_list { display: flex; list-style: none; }
header#header nav.top_util ul.menu_list li { margin-right: 5px; }
header#header nav.top_util div.search { display: flex; align-items: center; }
header#header nav.top_util div.search input.search_box { margin-right: 5px; }

header#header nav.top_util hgroup.header_inner img.logo_img { width:250px; }
header#header nav.top_util ul.menu_list li a {
    text-decoration: none; /* 링크에 밑줄 제거 */
    color: #333; /* 링크 텍스트 색상 변경 */
    font-weight: bold; /* 링크 텍스트 굵게 표시 */
}

header#header nav.top_util ul.menu_list li a:hover {
    color: #ff6600; /* 링크에 마우스를 올렸을 때 색상 변경 */
}

header#header nav.top_util ul.menu_list li a::after {
    content: "|"; /* 가상 요소에 표시할 내용 설정 */
    margin-left: 5px; /* 구분자와 링크 사이의 간격 설정 */
    color: #333; /* 구분자 색상 설정 */
}
</style>
<link rel="icon" href="${contextPath}/image/logo.png">
</head>
<body>

<div id="container">
	<form action="#" method="post">
		<header id="header">
				<nav class="top_util">
				
					<hgroup class="header_inner">
						<h1><a href="${contextPath}/index.jsp"><img class="logo_img" src="${contextPath}/image/logo.png"></a>
						</h1>
					</hgroup>
				
					<div class="search">
						<input class="search_box" type="text" name="search" value="" placeholder=""/>
						<input type="submit" value="검색">
					</div>
						<c:choose> 
							<c:when test="${ sessionScope.user == null }">
							<ul class="menu_list">
								<li><a href="${contextPath}/login.jsp">로그인/회원가입</a></li>
								<li><a href="user/basket.jsp">장바구니</a></li>
								<li><a href="user/membership/membership.jsp">멤버십/쿠폰</a></li>
							</ul>
							</c:when>
							<c:otherwise>
							<ul class="menu_list">
									<li><a href="${contextPath}/logout">로그아웃</a></li>
									<li><a href="#">마이페이지</a></li>
									<li><a href="user/basket.jsp">장바구니</a></li>
									<li><a href="${contextPath}/membership/membership.jsp">멤버십/쿠폰</a></li>
							</ul>
							</c:otherwise>
						</c:choose>
				</nav>
		</header>
	</form>
</div>

</body>
</html>