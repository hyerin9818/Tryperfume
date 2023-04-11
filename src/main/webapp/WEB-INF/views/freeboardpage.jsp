<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>freeboardpage</title>
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
    width: 50%;
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
    text-align: right;
}
.page4 a{
    border: 1px solid black;
    padding: 10px 30px;
    border-radius: 10px;
}
.page5{
    width: 60%;
}

.page5_1{
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 20px;
    font-weight: 600;
    margin: 30px;
}
.page5_2{
    margin: 20px 0;
    margin-left: 30px;
}
.page5_2 p{
    margin-top: 10px;
}
.page5_3{
    margin: 70px 0 50px 40px;
    
}
</style>
</head>
<body>
	<%@ include file="nav.jsp" %>
	  <div class="page">
            <p class="pagetitle">자유게시판</p>
            <table class="page1">
                <colgroup>
                    <col width="230px">
                    <col width="auto">
                </colgroup>
                <thead>
                <tr>
                    <td class="part1">제목</td>
                    <td class="part2">${freeboard.ftname}</td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td class="part1">작성자</td>
                    <td class="part2">${freeboard.memId}</td>
                </tr>
                </tbody>
            </table>
            <div class="page2">
                <p>${freeboard.fdate}</p>
                <p>${freeboard.fviews}</p>
            </div>
            <hr>
            <div class="page3">
                <h3>제목: ${freeboard.ftname}</h3>
                <br>
                <p>${freeboard.ftmain}</p>
            </div>
            <hr>
            <div class="page4">
                <a href="<c:url value="/freeboard"/>">목록</a>
                
                
            </div>
             
        </div>
	<hr>   
	<%@ include file="footer.jsp" %>
</body>
</html>