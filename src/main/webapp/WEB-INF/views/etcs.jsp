<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<html>
<head>
<title>etcs</title>
<style>
	*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
    color: black;
	}
	.productstitle{
    display: flex;
    justify-content: center;
    margin: 30px;
    font-size: 50px;
    font-family: 'Lobster', cursive;
    margin-top: 80px;
    
}

.productlist{
    display: block;
    width: 90%;
    height: 100%;
    justify-content: center;
    align-items: center;
    margin-top: 60px;
    font-size: 18px;
    margin: 30px auto;
}


.productlist1, .productlist2, .productlist3{
    display: flex;
    justify-content: space-evenly;
    align-items: center;
    margin: 10px 150px; 
   
}

.productlist a{
   margin: 40px 10px;
}
.productlist img{
    width: 250px;
    height: 350px;
    border-radius: 5px;
    margin-top: 30px;
}
.productlist h4{
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    margin: 10px 0;
}
.productlist p{
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    font-weight: 500;
}

.productbox, .productbox2{
    display: flex;
    justify-content: space-between;
    width: 100%;
    margin: 80px;
}

.Brand, .Var{
    margin-left: 20px;
    font-family: 'Lobster', cursive;
    font-size: 30px;
}

.productsmain{
    display: flex;
    justify-content: space-between;
}

.showbox{
    display: flex;
    justify-content: right;
}
	
</style>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap" rel="stylesheet">
</head>
<body>
	<%@ include file="nav.jsp" %>
	<div class="productmenu">
            <div>
                <p class="productstitle">etc</p>
            </div>
        </div>
        
        <div class="productsmain">

            <div class="productlist">
                <c:forEach items="${etc }" var="etc">
                <div  class="productlist1" >
                    <a href="<c:url value="/etcs/etc?ename=${etc.ename }"/>">
                        <img src="./resources/images/etc/${etc.epicmainname }" alt="">
                        <h4>${etc.ename }</h4>
                        <p>${etc.cate }
                        <p>${etc.emoney }원</p>
                    </a>
                    
                </div>
               </c:forEach>
            </div>

        </div>
	 <hr>   
	<%@ include file="footer.jsp" %>
</body>
</html>