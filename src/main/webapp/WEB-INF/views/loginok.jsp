<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인 확인</title>
<script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap" rel="stylesheet">
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
    margin: 150px 0;
    font-family: 'Gowun Dodum', sans-serif; 
}


.cp_message1{
    font-size: 40px;
}
.cp_message1, .cp_message2{
    margin: 30px;
}
.cp_message2{
    font-weight: 600;
    color: rgb(82, 63, 13);
} 
.cp_gohome{
    border: 1px solid brown;
    padding: 20px;
    margin-top: 20px;
    font-weight: 600;
    border-radius: 10px;
}
</style>
    <script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap" rel="stylesheet">
</head>
<body>
<%@ include file = "nav.jsp" %>
<div class="c_paymentpage">
		
        <h1 class="cp_message1">
            ${memId}님 환영합니다
        </h1>
        <p class="cp_message2">
            저희 트라이 퍼퓸에서 다양한 상품들을 만나보세요
        </p>
        <a href="<c:url value="/home"/>">
            <p class="cp_gohome">home으로 돌아가기</p>
        </a>
</div>
<hr>    
<%@ include file = "footer.jsp" %>
</body>
</html>