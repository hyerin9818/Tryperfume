<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>requestboard</title>
<style>
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



.fr1,  .fr3{
    margin: 15px;
}

.freeboard_title{
    text-align: center;
    font-size: 32px;
    margin: 20px;
    font-family: 'Gowun Dodum', sans-serif;
}
.freeboard_sort{
    width: 800px;
    text-align: end;
    font-family: 'Gowun Dodum', sans-serif;
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
            <p class="freeboard_title">입고요청</p>
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
                    <c:forEach items="${requestboard}" var="requestboard">
                    <tr>
                        <td><a href="<c:url value="/requestboard/requestboardpage?rnum=${requestboard.rnum}"/>"><p>${requestboard.rtname}</p></a></td>
                        <td>${requestboard.rdate}</td>
                        <td>${requestboard.memId}</td>
                        <td>${requestboard.rviews}</td>
                    </tr>
           </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="fr3">
            <div class="fr3">
                <a href="<c:url value="requestboard/writelist"/>"><p class="frlist1">내 글 목록</p></a>
                <a href="<c:url value="requestboard/requestboardwrite"/>"><p class="frlist2">게시물 작성</p></a>
            </div>
            
        </div>
    </div>
    <hr>
   <%@ include file = "footer.jsp" %>
</body>
</html>