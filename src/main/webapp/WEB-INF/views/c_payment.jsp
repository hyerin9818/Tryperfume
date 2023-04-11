<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>c_payment</title>
<script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap"
        rel="stylesheet">
<style>
*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
    color: black;
}
.c_paymentpage{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    margin: 150px;
    padding: 20px;
}

.cp_gohome{
    border: 1px solid brown;
    padding: 20px;
}

.cp_message1, .cp_message2{
    margin: 40px;
} 
</style>        
</head>
<body>
	<%@ include file="nav.jsp" %>
	 <div class="c_paymentpage">
        <p class="cp_message1">
        <h1>결제가 완료되었습니다</h1>
        </p>
        <p class="cp_message2">
            무통장 입금은 이틀 내에 입금하지 않을 시 주문이 취소될 수 있습니다
        </p>
        <a href="<c:url value="/home"/>">
            <p class="cp_gohome">HOME으로 돌아가기</p>
        </a>
    </div>
    <hr>
	<%@ include file="footer.jsp" %>
</body>
</html>