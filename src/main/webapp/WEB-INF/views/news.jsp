<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.sql.*"%>  
<html >
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>news</title>
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
.freeboardmain{
    display: flex;
    flex-direction: column;
    align-items: center;
    margin: 80px;
    padding: 20px;
    
}

.freeboardmain .fr2{
    width: 70%;
}

.freeboardmain .fr2 table{
    width: 100%;
    border-collapse: collapse;
}
.freeboardmain .fr2 table thead th{
   padding: 15px; 
   background-color:  rgb(241, 231, 218);
}

.freeboardmain .fr2 table thead th:first-child{
    border-radius: 10px 0 0 0px;
}
.freeboardmain .fr2 table thead th:last-child{
    border-radius: 0 10px 0px 0px;
}

.freeboardmain .fr2 table tbody td{
    padding: 10px;
    border-bottom: 1px solid  rgb(211, 208, 204);
    
}

.fr3{
    display: flex;
    width:80%;
}
.fr3 a{
    border: 1px solid black;
    margin: 20px;
    width: 120px;
    height: 40px;
    border-radius: 5px;
    background-color: rgb(250, 243, 234);
    
}
.fr3 p{
    padding-top: 5px;
    padding-right: 15px;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 18px;

}

.fr1 {
    margin: 15px;
}

.freeboard_title{
    text-align: center;
    font-size: 35px;
    margin: 20px;
    font-family:'Gowun Dodum', sans-serif;
}
.freeboard_sort{
    width: 800px;
    text-align: end;
    font-family: 'Gowun Dodum', sans-serif;
}

.frlist1, .frlist2{
    display: flex;
    padding-left: 10px;
    justify-content: right;
}
.num{
    text-align: center;
    margin-top: 20px;
}


</style>
</head>
<body>
	<%@ include file = "nav.jsp" %>
    <div class="freeboardmain">
        <div class="fr1">
            <p class="freeboard_title">NEWS</p>
        </div>
        <div class="fr2">
            <table>
                <colgroup>
                    <col width="auto">
                    <col width="150px" >
                    <col width="150px">
                    <col width="80px">
                </colgroup>
                <thead>
                    <tr>
                        <th>제목</th>
                        <th>작성일</th>
                        <th>작성자</th>
                        <th>조회</th>
                    </tr>    
                </thead>
                <tbody>
		   <c:forEach items="${news}" var="news">
                    <tr>
                        <td><a href="<c:url value="/news/newspage?snum=${news.snum}"/>"><p>${news.stname}</p></a></td>
                        <td>${news.sdate}</td>
                        <td>관리자</td>
                        <td>${news.sviews}</td>
                    </tr>
           </c:forEach>
              </tbody>     
            </table>
        </div>
        <c:if test="${memId eq 'admin'}">
        <div class="fr3">
            <div class="fr3">
                <a href="<c:url value="news/writelist"/>"><p class="frlist1">내 글 목록</p></a>
                <a href="<c:url value="news/newswrite"/>"><p class="frlist2">게시물 작성</p></a>
            </div>
            
        </div>
        </c:if>
    </div>
     <hr>
   <%@ include file = "footer.jsp" %>
</body>

</html>