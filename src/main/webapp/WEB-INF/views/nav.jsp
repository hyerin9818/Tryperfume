<%@ page contentType="text/html; charset=utf-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<style>
	
*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
    color: black;
}

/*nav 시작*/
nav{
    /*자식 정렬*/
    display: flex;
    justify-content: space-around;
    align-items: center;
    background-color: rgb(250, 243, 234);
    width: 100%;
    height: 90px;
    z-index: 1;
}
nav .nav_logo{
    display: flex;
    align-items: center;
    height: 100%;
    margin-left: 30px;
    
}
nav .nav_logo img{
    heigth:20px;
    width:150px;
}

.nav_menu > ul{
    display: flex;
    align-items: center;
}
.nav_menu > ul > li{
    margin: 0 40px;
    font-family: 'Lobster', cursive;
    font-size: 20px;
}
.menu_sub{
    display: none;
    position: absolute;
    font-family: 'Gowun Dodum', sans-serif; 
    margin-right: 30px; 
    justify-content: center; 
    align-items: center;
}
.sub:hover .menu_sub{
    display: block;
    z-index: 1;
}
.nav_icon{
    display: flex;
    justify-content: space-between;
    align-items: center;
}
.nav_icon i{
    margin: 0 30px;
}
.icon_sub{
    display: none;
    position: absolute;
    font-family: 'Gowun Dodum', sans-serif; 
    margin-right: 30px; 
    justify-content: center; 
    align-items: center;
}

#icons:hover .icon_sub{
    display: block;
    z-index: 1;
}
.welcome{
	color:gray;
	font-family: 'Gowun Dodum', sans-serif; 
}
	
</style>
 <script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
 <link rel="preconnect" href="https://fonts.googleapis.com">
 <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
 <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap"
        rel="stylesheet">
<title>nav</title>
</head>
<body>

	<nav>
        <div class="nav_logo">
            <a href="<c:url value="/home"/>"><img src="<c:url value="/resources/images/home/tryperfumelogo.png"/>" alt=""/> </a>
        </div>
        <div class="nav_menu">
            <ul>
                <li>
                    <a href="<c:url value="/perfumes"/>"> Perfume </a>
                </li>
               <!--  <li>
                    <a href="<c:url value="/myperfume"/>">My Perfume </a>
                </li> -->
                <li>
                    <a href="<c:url value="/etcs"/>">etc</a>
                </li>
                <li class="sub"><a href="<c:url value="/notice"/>">community </a>
                    <ul class="menu_sub">
                        <br>
                        <li>
                            <a href="<c:url value="/notice"/>">공지사항 </a>
                        </li>
                        <li>
                            <a href="<c:url value="/news"/>">News </a>
                        </li>
                        <li>
                            <a href="<c:url value="/faq"/>">FAQ </a>
                        </li>
                        <li>
                            <a href="<c:url value="/review"/>">고객리뷰 </a>
                        </li>
                        <li>
                            <a href="<c:url value="/freeboard"/>">자유게시판 </a>
                        </li>
                        <li>
                            <a href="<c:url value="/requestboard"/>">입고요청 </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="nav_icon">
        	<!-- 로그인시 마이페이지로 이동하도록 설정 -->
        	<c:if test="${memId !=null }">
            <a href="<c:url value="./mypage?memId=${memId}"/>">
                <!--  <i class="fas fa-search"></i>-->
                <p class="welcome">${memId}님 환영합니다</p>
            </a>
            </c:if>
            <a href="<c:url value="/addcart"/>">
                <i class="fas fa-shopping-cart"></i>
             </a>
            <i id="icons" class="fas fa-user">
                <ul class="icon_sub">
                    <br>
                    <!-- 로그인을 하지 않을 시 나타나는 네비 메뉴 -->
                    <c:if test="${memId==null }">
                    <li>
                    	
                        <a href="<c:url value="/login"/>">로그인 </a>
                    </li>
                    <br>
                    <li>
                        <a href="<c:url value="/signin"/>">회원가입 </a>
                    </li>
                    </c:if>
                    <br>
                    <!-- 로그인 시에만 페이지가 나타나도록 함 -->
                    <c:if test="${memId!=null }">
                    <li>
                    
                    	<!-- model값과 매핑 -->
                        <a href="<c:url value="./mypage?memId=${memId}"/>">마이페이지</a>
                    </li>
                    <br>
                    <li>
                        <a href="<c:url value="./logout"/>" onclick="alert('로그아웃이 완료되었습니다')">로그아웃</a>
                    </li>
                    </c:if>
                    <br>
                    <!--관리자 아이디로 들어갈경우 관리자 페이지가 따로 뜨도록 설정 -->
                    <c:if test="${memId eq 'admin'}">
                    <li>
                    	<a href="<c:url value="/addperfume"/>">향수 추가</a>
                    </li>
                    <br>
                    <li>
                    	<a href="<c:url value="/addetc"/>">etc 추가</a>
                    </li>
                    </c:if>
                </ul>
            </i>
            
        </div>
    </nav>
</body>
</html>