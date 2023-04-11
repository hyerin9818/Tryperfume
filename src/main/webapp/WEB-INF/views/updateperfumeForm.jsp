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
        <p class="signup">향수 수정</p>
       
            <form
            name="perfume" 
            action="./updateperfume" 
            method="post" 
            enctype="multipart/form-data">
                <table class="signuppage">
                <tr class="num">
                    <th>상품 번호 </th>
                    <td><input type="text" name="pnum" id="pnum" value="${perfume.pnum }" class="s_name" readonly ></td>
                </tr>
                <tr class="num">
                    
                    <td>*상품 번호는 변경 불가능 합니다</td>
                </tr>   
                <tr class="name">
                    <th>상품 이름 </th>
                    <td><input type="text" name="pname" id="pname" value="${perfume.pname }" class="s_name" required></td>
                </tr>               
                <tr class="ID">
                    <th>브랜드</th>
                    <td><input type="text" name="pbrand" id="pbrand" value="${perfume.pbrand }" class="s_id" required>
                    </td>
                </tr>
                <tr class="name">
                    <th>상품 가격 </th>
                    <td><input type="text" name="pmoney" id="pmoney" value="${perfume.pmoney }" class="s_name" required></td>
                </tr> 
                 
                <tr class="name">
                    <th>상품 설명 </th>
                    <td><input type="text" name="pdes" id="pdes" value="${perfume.pdes }" class="ap_long" required></td>
                </tr> 
                <tr class="scent">
                    <th>향기</th>
                    <td><input type="text" name="psmell" id="psemll" value="${perfume.psmell }" class="ap_long" required></td>
                </tr> 
                <tr class="name">
                    <th>상품 용량 </th>
                    <td><input type="text" name="pgram" id="pgram" value="${perfume.pgram }" class="s_name" required></td>
                </tr>
       
                <tr class="image">
                    <th>상품 이미지</th>
                    <td>
                        
                       <input type="file" id="ppicmain" name="ppicmain" value="${perfume.ppicmainname }" accept="image/*" onchange="loadFile(this)" >
                    </td>
                </tr>
                <tr class="image">
                    <th>상품 상세이미지1</th>
                    <td>
                        
                        <input type="file" id="ppicsub1" name="ppicsub1" accept="image/*" onchange="loadFile(this)" >
                    </td>
                </tr>
                <tr class="image">
                    <th>상품 상세이미지2</th>
                    <td>
                        
                        <input type="file" id="ppicsub2" name="ppicsub2" accept="image/*" onchange="loadFile(this)" >
                    </td>
                </tr>
                <tr class="image">
                    <th>상품 상세이미지3</th>
                    <td>
                       
                        <input type="file" id="ppicsub3" name="ppicsub3" accept="image/*" onchange="loadFile(this)">
                    </td>
                </tr>       
                </table>
                <div class="signup">
                    <input type="submit" value="상품 등록" class="subtn">
                 </div>
            </form>
         
    </div>

    <hr>
    
    <%@ include file="footer.jsp" %>
</body>

</html>