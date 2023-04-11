<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>review Page</title>
<style>
*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
    color: black;
}
.page{
    width: 100%;
    height: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
}
.pagetitle{
    font-family: 'Gowun Dodum', sans-serif;
    padding: 70px 0;
    font-size: 35px;
    text-align: center;
}
.page1{
    width: 70%;
    border-collapse: collapse;
    border: 1px solid lightgray;
}

.page1 tr{
    height: 40px;
   
}
.part1{
    text-align: center;
    background-color:rgb(250, 243, 234);
}
.part2{
    padding-left: 10px;
}
.page2{
    width: 70%;
    display: flex;
    margin: 20px 0;
}
.page2 p{
    margin-left: 30px;
}
.page3{
    text-align: left;
    margin: 50px 0;
    width: 60%;
}
.page3 h3{
    margin-bottom: 30px;
}
.page3 p{
    margin-top: 20px;
    line-height: 30px;
    
}
.page4{
    margin-bottom: 60px;
    width: 60%;
    margin-top: 50px;
}
.page4 a{
    border: 1px solid black;
    padding: 10px 30px;
    border-radius: 10px;
}
</style>
</head>
<body>
<%@ include file = "nav.jsp" %>
	 <div class="page">
            <p class="pagetitle">고객리뷰</p>
            <table class="page1">
                <colgroup>
                    <col width="230px">
                    <col width="auto">
                </colgroup>
                <thead>
                <tr>
                    <td class="part1">제목</td>
                    <td class="part2">${review.ntname}</td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td class="part1">작성자</td>
                    <td class="part2">${review.memId}</td>
                </tr>
                </tbody>
            </table>
            <div class="page2">
                <p>작성일 ${review.ndate}</p>
                <p>${review.views}</p>
            </div>
            <hr>
            <div class="page3">
            	<h3>리뷰 제품: ${review.ntproduct }</h3>
            	<br>
                <p>${review.ntmain}<p>
            </div>
            <hr>
            <div class="page4">
                <a href="<c:url value="/review"/>">목록</a>
                
            </div>
        </div>    
        <hr>
<%@ include file = "footer.jsp" %>
</body>
</html>