<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>

<title>myperfume</title>
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
.bestseller p{
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
    margin-bottom: 70px;
   
}

.bestpro img{
    width: 150px;
    height: 180px;
    border-radius: 5px;
    margin: 40px 30px;

}
.bestpro h4{
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    margin: 10px 0;
}
.bestpro p{
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    font-weight: 500;
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
        <h1>당신만의 향수를 찾아보세요</h1>
        <p>당신이 좋아하는 계절</p>
        <div class="bestpro">
            <div>
                <a href="myperfumeas">
                    <img src="./resources/images/myperfume/spring.jpg" alt="">
                    <h4>봄</h4>
                </a>
            </div>
            <div>
                <a href="myperfumeas">
                    <img src="./resources/images/myperfume/summer.jpg" alt="">
                    <h4>여름</h4>
                </a>
            </div>
            <div>
                <a href="myperfumeas">
                    <img src="./resources/images/myperfume/fall.jpg" alt="">
                    <h4>가을</h4>
                </a>
            </div>
            <div>
                <a href="myperfumeas">
                    <img src="./resources/images/myperfume/winter.jpg" alt="">
                    <h4>겨울</h4>
                </a>
            </div>
        </div>
    </div>
	<hr>   
	<%@ include file="footer.jsp" %>
</body>
</html>