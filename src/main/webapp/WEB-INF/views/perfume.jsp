<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.sql.*"%>    
<!DOCTYPE html>
<html>
<head>
<title>perfume</title>
  <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
.productpage{
    display: flex;
    justify-content: space-around;
    height: 100%;
    margin: 100px auto;
}
.productpage img{
	max-height : 500px; 
	max-width: 400px;
}
.productmain{
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    align-items: flex-start;
    
}
.productmain h2{
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 30px;
    font-weight: 700;
}
.productmain p{
    font-family: 'Gowun Dodum', sans-serif;
    font-weight: 600;
    font-size: 16px;
}
.probuy{
   display: flex;
   justify-content: space-between;
}
.probuy a{
    margin-right:70px;
    margin-left: 30px;
    border: 1px solid black;
    padding: 10px;
    border-radius: 10px;
    width:150px;
    text-align:center;
    
}
.productpic{
    text-align: center;
   
}
.productpic p{
    font-family:'Gowun Dodum', sans-serif;
    font-size: 25px;
    margin: 10px 0;
}
.productpic img{
    max-width: 1000px;
    height: auto;
    margin: 20px auto;

}
.productbuttom{
	display:flex;
	justify-content:flex-end;
	margin-top:40px;
}
.productbuttom a{
	 border: 1px solid black;
    padding: 10px;
    border-radius: 10px;
    width:120px;
    text-align:center;
    margin: 0 20px;
}

</style>
<script>
function loginnow(){
	if(${memId} == null){
		alert('로그인 후 이용 가능합니다');
		window.location.href="http://localhost:8080/Tryperfume/login";
	}
}

</script>
</head>
<body>
	<%@ include file = "nav.jsp" %>
	<div div class="productbuttom">
                <c:if test="${memId eq 'admin'}">
        
                <a href="<c:url value="./updateperfume?pname=${perfume.pname }"/>">상품 수정</a>
                <a href="<c:url value="./delete?pname=${perfume.pname }"/>">상품 삭제</a>
            	</c:if>
            </div>
		<div class="productpage">
			
            <div>
                <img src="<c:url value="/resources/images/perfume/${perfume.ppicmainname }"/>" alt="Perfume" >
            </div>
            <div class="productmain">
                <h2 class="proname">${perfume.pname}</h2>
                <p>${perfume.pbrand }</p>
                <p>${perfume.pmoney }원</p>
                <p>${perfume.pdes }</p>
                <p>${perfume.psmell }</p>
                <p>${perfume.pgram }</p>
                <div class="probuy">
                    <a href="<c:url value="/paymentsys"/>" class="buynow" onclick="loginnow()">바로구매하기</a>
                    <a href="<c:url value="/addcart"/>" class="buycart" onclick="alert('장바구니에 추가하였습니다')">장바구니</a>
                </div>
            </div>
        </div>
        <div class="productpic">
            <p>제품 상세 정보</p>
            <img src="<c:url value="/resources/images/perfume/${perfume.ppicsub1name }"/>" onerror="this.style.display='none'">
            <img src="<c:url value="/resources/images/perfume/${perfume.ppicsub2name }"/>" onerror="this.style.display='none'">
            <img src="<c:url value="/resources/images/perfume/${perfume.ppicsub3name }"/>" onerror="this.style.display='none'">
        </div>
    <hr>
   <%@ include file = "footer.jsp" %>
</body>
</html>