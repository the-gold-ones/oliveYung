<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠폰 목록</title>
<style type="text/css">
    .coupon_table {
        
        border-collapse: collapse;
        margin: auto; /* 가운데 정렬을 위해 */
    }
    
    .coupon_div {
        text-align: center; /* 가운데 정렬을 위해 */
    }
    
    th, td {
        padding: 10px; /* 셀 안의 내용과 테두리 간의 여백 설정 */
    }
</style>
</head>
<body>

<jsp:include page="../header.jsp" />
<div class="coupon_div">
    <table class="coupon_table" border="1">
        <tr>
            <th>쿠폰 이름</th>
            <th>쿠폰 할인율</th>
            <th>쿠폰 등록일</th>
        </tr>
        <c:forEach var="coupon" items="${coupons}">
            <tr>
                <td>${coupon.name}</td>
                <td>${coupon.discount}%</td>
                <td>${coupon.moment}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>
