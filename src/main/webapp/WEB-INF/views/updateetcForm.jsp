<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.sql.*"%>   
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>addperfume</title>
    <style>
    .container{
    width: 100%;
    height: 100%;
    justify-content: center;
    align-items: center;
    margin-bottom: 100px;
}
.signup{
    width: 100%;
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 35px;
    margin-bottom: 50px;
    margin-top: 50px;
}
.signuppage{
    margin: 0 auto;
    height: 400px;
}
.s_name{
    width: 170px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}
.ap_long{
	width: 350px;
	height: 25px;
	border: 1px solid gray;
    border-radius: 5px;
}

.signuppage th{
    font-size: 18px;
    font-weight: 600;
    font-family: 'Gowun Dodum', sans-serif;
    padding-right: 70px;
}
.s_id{
    width: 170px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}

.subtn{
    padding: 10px;
    background-color:  rgb(250, 243, 234);
    border: 1px solid rgb(82, 63, 13);;
    border-radius: 5px;
    width: 100px;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 18px;
}
    
    </style>
    <link rel="stylesheet" href="signin.css">
    <script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap"
        rel="stylesheet">
</head>

<body>
<%@ include file="nav.jsp" %>
 <br><br><br><br><br><br>
    <div class="container">
        <p class="signup">etc 수정</p>
       
            <form name="etc" 
            action="./updateetc" 
            method="post" 
            enctype="multipart/form-data">
                <table class="signuppage">
                <tr class="num">
                    <th>상품 번호 </th>
                    <td><input type="text" name="enumber" id="enumber" value="${etc.enumber } " class="s_name" readonly></td>
                </tr>
                <tr class="num">
                    
                    <td>*상품 번호는 변경 불가능 합니다</td>
                </tr>   
                <tr class="name">
                    <th>상품 이름 </th>
                    <td><input type="text" name="ename" id="ename" value="${etc.ename }" class="s_name" required></td>
                </tr>
                <tr class="name">
                    <th>카테고리 </th>
                    <td><input type="text" name="cate" id="cate" value="${etc.cate } " class="s_name" required></td>
                </tr>               
                <tr class="ID">
                    <th>브랜드</th>
                    <td><input type="text" name="ebrand" id="ebrand" value="${etc.ebrand }" class="s_id" required>
                    </td>
                </tr>
                <tr class="name">
                    <th>상품 가격 </th>
                    <td><input type="text" name="emoney" id="emoney" class="s_name" value="${etc.emoney } " required></td>
                </tr> 
                 
                <tr class="name">
                    <th>상품 설명 </th>
                    <td><input type="text" name="edes" id="edes" value="${etc.edes }" class="ap_long" required></td>
                </tr> 
                <tr class="scent">
                    <th>향기</th>
                    <td><input type="text" name="esmell" id="esmell" value="${etc.esmell }" class="ap_long" required></td>
                </tr> 
                <tr class="name">
                    <th>상품 용량 </th>
                    <td><input type="text" name="egram" id="egram" value="${etc.egram } " class="s_name" required></td>
                </tr>
       
                <tr class="image">
                    <th>상품 이미지</th>
                    <td>
                        
                       <input type="file" id="epicmain" name="epicmain" accept="image/*" onchange="loadFile(this)" >
                    </td>
                </tr>
                <tr class="image">
                    <th>상품 상세이미지1</th>
                    <td>
                        
                        <input type="file" id="epicsub1" name="epicsub1" accept="image/*" onchange="loadFile(this)" >
                    </td>
                </tr>
                <tr class="image">
                    <th>상품 상세이미지2</th>
                    <td>
                        
                        <input type="file" id="epicsub2" name="epicsub2" accept="image/*" onchange="loadFile(this)" >
                    </td>
                </tr>
                <tr class="image">
                    <th>상품 상세이미지3</th>
                    <td>
                       
                        <input type="file" id="epicsub3" name="epicsub3" accept="image/*" onchange="loadFile(this)">
                    </td>
                </tr>       
                </table>
                <div class="signup">
                    <input type="submit" value="상품 등록" class="subtn">
                 </div>
            </form>
         
    </div>
           <hr>
<%@ include file = "footer.jsp" %>