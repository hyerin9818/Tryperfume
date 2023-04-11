<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>myperfumeas</title>
<style>
*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
    color: black;
}
.bestseller{
    display: block;
    width: 100%;
    height: 100%;
    justify-content: center;
    align-items: center;
    margin-top: 60px;
}
.bestseller h1{
    justify-content: center;
    align-items: center;
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    margin: 80px 0;
    margin-bottom: 60px;
    font-size: 40px;
}
.bestseller h3{
    font-family: 'Gowun Dodum', sans-serif;
    text-align: center;
    font-size: 25px;
    color: rgb(165, 86, 29);
}
.bestpro{
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 10px 150px;
   
}

.bestpro img{
    width: 150px;
    height: 200px;
    border-radius: 5px;
    margin: 40px 30px;

}
.bestpro h4{
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    margin: 10px 0;
}
.text{
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 20px;
    font-weight: 500;
    margin: 40px 0;
    line-height: 30px;
    color: rgb(165, 86, 29);
}
</style>
<script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap"
        rel="stylesheet">
</head>
<body>
	<%@ include file="nav.jsp" %>
	<div class="bestseller">
        <h1>당신의 향수는 플로럴 계열입니다</h1>
        <h3>당신에게 어울리는 추천 향수</h3>
        <div class="bestpro">
            <div>
                <a href="product">
                    <img src="./resources/images/perfumes/formentflo.jpg" alt="">
                    <h4>포맨트 시그니처 퍼퓸</h4>
                </a>
            </div>
            <div>
                <a href="product">
                    <img src="./resources/images/perfumes/julymeflo.png" alt="">
                    <h4>페르소나 퍼퓸 피오니 워크</h4>
                </a>
            </div>
            <div >
                <a href="product">
                    <img src="./resources/images/perfumes/에리게니아 플로어.jpg" alt="">
                    <h4>스위티구르망 여자 니치향수</h4>
                </a>
            </div>
        </div>
        <div class="text">
            <p>플로워 향은 여러 가지의 꽃 향기가 어우러진 향기입니다.
            <br> 플로워 향은 향수의 기본적인 향으로 사랑스럽고 부드러운 느낌이 특징입니다.<br>
                 당신이 가진 사랑스러운 느낌과 잘 어울리는 향입니다. 당신만의 싱그러운 꽃을 찾아가세요.
             </p>
        </div>     
    </div>
	<hr>   
	<%@ include file="footer.jsp" %>
</body>
</html>