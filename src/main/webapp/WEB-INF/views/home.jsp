<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.sql.*"%>    
<!DOCTYPE html>
<html>
<head>
<title>tryperfumehome</title>
<style>
*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
    color: black;
}
.slider input[id*="slide"]{
    display: none;
} 
.slider .slidewap{
    max-width: 1920px;
    margin: 0;
    overflow: hidden;
    max-height: 1002.05px;
} 
.slider .slidelist{
    white-space: nowrap;
    font-size: 0;
}
.slider .slidelist > li{
    display:inline-block;
    vertical-align: middle;
    width: 100%;
    height:1002.05px;
    transition: all .5s;
}
.slider .slidelist > li > a{
    display: block;
    position: relative;
}
.slider .slidelist > li > a > img{
    width: 100%;
    height: 100%;
}
.slider .slidelist label{
    position: absolute;
    z-index: 1;
    top: 50%;
    transform: translateY(-50%);
    padding: 50px;
    cursor: pointer;
    
}
.slider .slidelist .left{
    left: 30px;
    background: url('./resources/images//home/left.png') center center / 100% no-repeat;
   
}
.slider .slidelist .right{
    right: 30px;
    background: url('./resources/images//home/right.png') center center / 100% no-repeat;
    
}

#slide01:checked ~ .slidewap .slidelist > li {
    transform:translateX(0%);
}
#slide02:checked:checked ~ .slidewap .slidelist > li {
    transform:translateX(-100%);
}
#slide03:checked:checked ~ .slidewap .slidelist > li {
    transform:translateX(-200%);
}
/*일단 슬라이드 끝*/
/*베스트셀러 화면 시작*/
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
    font-family: 'Abril Fatface', cursive;
    margin: 80px 0;
    font-size: 40px;
}
.bestpro{
    display: flex;
    justify-content: space-evenly;
    align-items: center;
    margin: 10px 150px;
   
}
.bestpro a{
   margin: 40px 10px;
}
.bestpro img{
    width: 250px;
    height: 350px;
    border-radius: 5px;
    margin-top: 30px;
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
/*베스트셀러 끝*/
/*뉴 시작*/
.new{
    display: block;
    width: 100%;
    height: 100%;
    justify-content: center;
    align-items: center;
    margin-top: 100px;
}
.new h1{
    justify-content: center;
    align-items: center;
    text-align: center;
    font-family: 'Abril Fatface', cursive;
    margin: 80px 0;
    font-size: 40px;
}
.newpro{
    display: flex;
    justify-content: space-evenly;
    align-items: center;
    margin: 10px 150px;
   
}
.newpro a{
   margin: 40px 10px;
}
.newpro img{
    width: 250px;
    height: 350px;
    border-radius: 5px;
    margin-top: 30px;
    
}
.newpro h4{
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    margin: 10px 0;
}
.newpro p{
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    font-weight: 500;
}
/*뉴 메뉴 끝*/
/*myper 시작*/
.myper{
    display: block;
    justify-content: center;
    margin-top: 100px;
    align-items: center;
    width: 100%;
    height: 100%;
    background-color:rgb(250, 243, 234);
    height: 1030px;

}
.myper h2{
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 35px;
    font-weight: 700;
    padding-top: 100px;
}
.myper p{
    text-align: center;
    margin: 30px 0;
    font-family: 'Gowun Dodum', sans-serif;
}
.myper img{
    width: 80%;
    display: block;
    margin: 10px auto;
    border-radius: 20px;
    height: 70%;
  
    
}
</style>
    <script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap" rel="stylesheet">
</head>
<body>
	<%@ include file="nav.jsp" %>
	<!-- 슬라이드 화면 시작-->
        <div class="slider">
            <input type="radio" id="slide01" name="slide" checked>
            <input type="radio" id="slide02" name="slide">
            <input type="radio" id="slide03" name="slide">
            <div class="slidewap">
                <ul class="slidelist">
                    <li>
                        <a>
                            <label for="slide03" class="left"></label>
                            <img src="<c:url value="/resources/images/home/perfume-gc6a1a7863_1920 (1).jpg"/>" alt=""/>
                            <label for="slide02" class="right"></label>
                        </a>
                    </li>
                    <li>
                        <a>
                            <label for="slide01" class="left"></label>
                            <img src="<c:url value="/resources/images/home/happy-mothers-day-gb951f82e7_1920 (1).jpg"/>" alt=""/>
                            <label for="slide03" class="right"><i class="fas fa-chevron-right"></i></label>
                        </a>
                    </li>
                    <li>
                        <a>
                            <label for="slide02" class="left"></label>
                            <img src="<c:url value="/resources/images/home/advertising-g7b6ad7bd0_1920 (1).jpg"/>" alt=""/>
                            <label for="slide01" class="right"></label>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <!--슬라이드 화면 끝-->
        <!--베스트셀러 화면 시작-->
        <div class="bestseller">
            <h1>BEST SELLER</h1>
            <div class="bestpro">
                <div>
                    <a href="<c:url value="/perfumes/perfume?pname=포멘트%20시그니처%20퍼퓸%20코튼허그"/>">
                        <img src="<c:url value="/resources/images/perfumes/forment.jpg"/>" alt="">
                        <h4>포맨트 시그니처 퍼퓸 코튼허그</h4>
                        <p>39000원</p>
                    </a>
                </div>
                <div>
                    <a href="<c:url value="/perfumes/perfume?pname=페르소나%20소일%20베이크드"/>">
                        <img src="<c:url value="/resources/images/perfumes/julyme.png"/>" alt="">
                        <h4>페르소나 소일 베이크드</h4>
                        <p>46000원</p>
                    </a>
                </div>
                <div>
                    <a href="<c:url value="/perfumes/perfume?pname=그라펜%20타투%20퍼퓸%20원우드"/>">
                        <img src="<c:url value="/resources/images/perfumes/grafen.jpg"/>" alt="">
                        <h4>그라펜 타투 퍼퓸 원우드</h4>
                        <p>44000원</p>
                    </a>
                </div>
                <div>
                    <a href="<c:url value="/perfumes/perfume?pname=이노센트%20타임%20오드뚜왈렛"/>">
                        <img src="<c:url value="/resources/images/perfumes/lairdesavon.jpg"/>" alt="">
                        <h4>이노센스 타임 오드뚜왈렛</h4>
                        <p>35000원</p>
                    </a>
                </div>
            </div>
        </div>
        <!--뉴 화면 시작-->
        <div class="new">
            <h1>NEW</h1>
            <div class="newpro">
                <div >
                    <a href="<c:url value="/perfumes/perfume?pname=그라펜%20타투%20퍼퓸%20레몬"/>">
                        <img src="./resources/images/perfumes/grafentattoo.jpg" alt="">
                        <h4>그라펜 타투 퍼퓸 레몬</h4>
                        <p>37000원</p>
                    </a>
                </div>
                <div>
                    <a href="<c:url value="/perfumes/perfume?pname=오%20드%20퍼퓸%20뮬"/>">
                        <img src="./resources/images/perfumes/aozmull.jpg" alt="">
                        <h4>오 드 퍼퓸 뮬</h4>
                        <p>46000원</p>
                    </a>
                </div>
                <div>
                    <a href="<c:url value="/perfumes/perfume?pname=LMTQ%20프리지아%20퍼퓸"/>">
                        <img src="./resources/images/perfumes/lomentiquefreesia.jpg" alt="">
                        <h4>LMTQ 프리지아 퍼퓸</h4>
                        <p>29900원</p>
                    </a>
                </div>
                <div>
                     <a href="<c:url value="/perfumes/perfume?pname=포맨트%20시그니처%20퍼퓸%20벨벳허그"/>">
                        <img src="./resources/images/perfumes/formentvelvet.jpg" alt="">
                        <h4>포맨트 시그니처 퍼퓸 벨벳허그</h4>
                        <p>49000원</p>
                    </a>
                </div>
            </div>
        </div>
        <!--myper 시작-->
        <div class="myper"> 
            <h2>당신만의 향수를 찾아가세요</h2>
            <p>사람들마다 각자의 취향이 있듯이 우리 모두 각자의 향이 있습니다<br>
            오늘 하루 당신이 좋아하는 향을 찾는다면 당신의 또 다른 취향을 찾은 것입니다</p>
            <img src="./resources/images/home/myperfume.gif" alt="">
        </div>
     <hr>   
	<%@ include file="footer.jsp" %>
</body>
</html>