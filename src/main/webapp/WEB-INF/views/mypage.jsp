<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.sql.*"%> 
<!DOCTYPE html>
<html>
<head>
<title>my page</title>
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
.container{
    width: 100%;
    justify-content: center;
    align-items: center;
    margin-bottom: 40px;
}
.signup{
    width: 100%;
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 35px;
    margin-bottom: 50px;
    margin-top: 100px;
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
.phone select{
    width: 80px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
    text-align: center;
}
.phone input{
    width: 90px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
    margin-left: 20px;
}

.signuppage th{
    font-size: 18px;
    font-weight: 600;
    font-family: 'Gowun Dodum', sans-serif;
    padding-right: 70px;
}
.memId{
    width: 170px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}
.idCheck{
    width: 100px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
    text-align: center;
    margin-left: 20px;
}
.s_pw{
    width: 170px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}
.messege{
	font-size:13px;
}
.s_email{
    width: 170px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}
.email select{
    width: 170px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}
.p_add1{
    width: 120px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}
.p_add2{
    width: 90px;
    margin-left: 20px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}

.p_add3 input{
    width: 400px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}
.p_add4 input{
    width: 150px;
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
.signup a{
	font-size:25px;
	border: 1px solid black;
	border-radius: 5px;
	padding:10px;
	background-color:  rgb(250, 243, 234);
}

</style>
</head>
<body>
<%@ include file = "nav.jsp" %>
	<div class="container">
        <p class="signup">마이페이지</p>
       
            
                <table class="signuppage">
                <tr class="name">
                    <th>이름 </th>
                    <td>${member.memname }</td>
                </tr>
                <tr class="phone">
                    <th>휴대전화</th>
                    <td>
                        0${member.phonenum1 } - ${member.phonenum2 } - ${member.phonenum3 }
                    </td>
                </tr>
                <tr class="ID">
                    <th>아이디</th>
                    <td>
                    	${member.memId }
                    </td>
                </tr>
                   
                <tr class="password">
                    <th>비밀번호</th>
                    <td>${member.memPw }</td>
                 
                </tr>
                
                <tr class="email">
                    <th>이메일</th>
                    <td>${member.email1 } &#64; ${member.email2 }.com</td>
                        
                </tr>
                <tr class="address">
                    <th>주소</th>
                    <td>${member.address1 }</td>
                </tr>
        
                <tr class="p_add3">
                    <th></th>
                    <td>${member.address2} (기본 주소지)</td>
                </tr>
                <tr class="p_add4">
                    <th></th>
                    <td>${member.address3 } (추가 주소지)</td>
                </tr>
            
                </table>
                <div class="signup">
                    <a href="<c:url value="./updatemember?memId=${member.memId}"/>">회원수정</a>
                 </div>
            
         
    </div>
    <hr>    
   <%@ include file = "footer.jsp" %>  
</body>
</html>