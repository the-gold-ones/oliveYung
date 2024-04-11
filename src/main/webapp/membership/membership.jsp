<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.membership_header {
	align:center;
	text-align:center;
}

table.membership_table {
	text-align:center;
	align:center;
}

.membership_body {
	align:center;
}

.membership_container {
	width :900px;
	margin: 0 auto;
	min-width : 1020px;
	}
	
	.membership_container::after {
		content: "";
		display:block;
		clear:both;
}
</style>
</head>
<body>

<jsp:include page="../header.jsp" />
<div class=membership_container>
	<div>
		<h2>멤버십</h2>
		<hr>
			<h3>${sessionScope.user.id }님의 등급 : ${sessionScope.user.level}</h3>
			<h3>가지고 있는 쿠폰 : <a href="${contextPath}/user/coupon">${sessionScope.user.coupon }</a></h3>
		<h3>등급에 따른 다양한 혜택</h3>
	</div>
	<div class="membership_body">
			<table border="1" class="membership_table">
				<colgroup>
					<col style="width:304px">
					<col style="width:143px">
					<col style="width:143px">
					<col style="width:143px">
					<col style="width:143px">
					<col style="">
				</colgroup>
				<thead>
				<tr>
					<th scope="col">등급별 혜택</th>
					<th scope="col" class="sffont-area gold">YUNG?<br>OLIVE</th>
					<th scope="col" class="sffont-area black">YUNG<br>OLIVE</th>
					<th scope="col" class="sffont-area green">YUNGYUNG<br>OLIVE</th>
					<th scope="col" class="sffont-area pink">YUNG~<br>OLIVE</th>
					<th scope="col" class="sffont-area baby">YUNG!<br>OLIVE</th>
				</tr>
				</thead>
				<tbody>
				<tr>
					<th scope="row">선정 기준<span class="table-sub-title">*직전 반기 온・오프라인 누적 구매 금액</span></th>
					<td><span class="sffont-area">100</span>만원 이상</td>
					<td><span class="sffont-area">70</span>만원 이상 ~<br><span class="sffont-area">100</span>만원 미만</td>
					<td><span class="sffont-area">40</span>만원 이상 ~<br><span class="sffont-area">70</span>만원 미만</td>
					<td><span class="sffont-area">10</span>만원 이상 ~<br><span class="sffont-area">40</span>만원 미만</td>
					<td><span class="sffont-area">10</span>만원 미만</td>
				</tr>
				
				<tr>
					<th scope="row">쇼핑 쿠폰<span class="table-sub-title">*<span class="sffont-area">6</span>개월 내 <span class="sffont-area">1</span>회 온・오프라인 통합</span></th>
					<td><span class="sffont-area">4</span>장</td>
					<td><span class="sffont-area">3</span>장</td>
					<td><span class="sffont-area">2</span>장</td>
					<td><span class="sffont-area">1</span>장</td>
					<td></td>
				</tr>
				<tr>
					<th scope="row">생일 쿠폰<span class="table-sub-title">*생일월 한정, <strong style="color: red;text-decoration:underline">인당 연 1회 제공</strong></span></th>
					<td><span class="sffont-area">1</span>장</td>
					<td><span class="sffont-area">1</span>장</td>
					<td><span class="sffont-area">1</span>장</td>
					<td><span class="sffont-area">1</span>장</td>
					<td></td>
				</tr>
				</tbody>
			</table>
		</div>
</div>
<jsp:include page="../footer.jsp" />

</body>
</html>