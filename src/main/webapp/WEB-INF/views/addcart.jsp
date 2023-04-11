<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.springmvc.domain.Perfume"%>
<%@ page import="com.springmvc.domain.Etc"%>
<%@ page import="com.springmvc.repository.PerfumeRepository"%>
<%@ page import="com.springmvc.repository.EtcRepository"%>
<!DOCTYPE html>
<html>
<head>
<title>addcart</title>
<script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap"
        rel="stylesheet">
    <style>
    
*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
    color: black;
}
    
.addcart{
   
    height: 100%;
    display: flex;
    flex-direction: column;
    align-items:center;  
    margin:80px;
}
.ac1{
    width: 100%;
}
.ac1 h3{
    margin: 30px 0;
    text-align: center;
    font-size: 35px;
    font-family: 'Gowun Dodum', sans-serif;
}
.ac1 p{
    font-family: 'Gowun Dodum', sans-serif;
    font-weight: 600;
}


.addlist{
    width:100%;
    margin-left: 80px;
    margin-bottom: 40px;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 20px;
}

.ac2{
    width: 80%;
}
.ac2 table{
    width: 100%;
    border-collapse: collapse;
    
}
.ac2 table thead { 
    height: 50px;
    background-color: rgb(241, 231, 218);
}
.ac2 table thead tr th:first-child{
    border-radius: 10px 0px 0px 0px;
}
.ac2 table thead tr th:last-child{
    border-radius: 0px 10px 0px 0px;
}

.ac2 table tbody{
    height: 60px;
    text-align: center;
}
.ac2 table tbody td{
    padding: 10px;
    border-bottom: 1px solid  rgb(211, 208, 204);
}
.ac2 table tbody button{
    width: 40px;
    
}


.page{
    width: 100%;
    text-align: right;
    margin: 70px 0;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 18px;
    font-weight: 500;
}
.addcartbu{
    text-align: center;
}
.addcartbu input{
    margin: 0 10px;
    padding: 10px;
}  	
    </style>    
<%
	String cartId=session.getId();
%>

</head>
<body>
	<%@ include file="nav.jsp" %>
	 <div class="addcart">
            <div class="ac1">
            <h3>장바구니</h3>
            <p class="addlist">상품 목록</p>
            </div>
            <div class="ac2">
            <form action="paymentsys">   
                <table>
                	 
                	<thead>
                    <tr>
                        <th>perfume</th>
                        <th>제품 정보</th>
                        <th>수량</th>
                        <th>판매가</th>
                        <th>주문 관리</th>
                    </tr>
                    </thead>
               
                    <tbody>
                    <tr>
                        <td><input type="checkbox" id="check1"></td>
                        <td>${perfume.pname }</td>
                        <td>1</td>
                        <td>${perfume.pmoney }</td>
                        <td><button>삭제</button></td>
                    </tr>
                    </tbody>   
                </table>
                <br><br><br>
                <table>
                	 
                	<thead>
                    <tr>
                        <th>etc</th>
                        <th>제품 정보</th>
                        <th>수량</th>
                        <th>판매가</th>
                        <th>주문 관리</th>
                    </tr>
                    </thead>
               
                    <tbody>
                    
                    <tr>
                        <td><input type="checkbox" id="check1"></td>
                        <td></td>
                        <td>1</td>
                        <td></td>
                        <td><button>삭제</button></td>
                    </tr>
                    
                    </tbody>   
                </table>
                <p class="page">총액 : 총액금</p>
                <div class="addcartbu">
                    <input type="submit" value="전체 구매하기">
                    <input type="submit" value="선택 구매하기">
                </div>       
            </form>
            </div>
        </div>  
        <hr> 
	<%@ include file="footer.jsp" %>
</body>
</html>