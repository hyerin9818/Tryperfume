<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>writelist</title>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>review</title>
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
.writelist{
    width: 100%;
    height:30%;
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    align-items:center;   
    margin-bottom: 40px;
}
.writelist h2{
    width: 100%;
    margin: 30px 0;
    text-align: center;
    font-size: 35px;
    font-family: 'Gowun Dodum', sans-serif;
}
.writech{
    width: 100%;
}

.writecheck{
    width: 100%;
    display: flex;
    justify-content: space-around;
    align-items: center;
    margin-bottom: 30px;
    margin-top: 70px;
}
.writecheck2{
    display: flex;
    justify-content: space-around;
    align-items: center;
    margin-top: 50px;
    margin-bottom: 80px;
}
.writecheck2 label{
    border: 1px solid black;
    padding: 10px;
}
.page{
    width: 100%;
    text-align: center;
    margin: 70px 0;
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
</style>
</head>
<body>
	<%@ include file = "nav.jsp" %>
    <div class="writelist">
            <h2>내 글 목록</h2>
 				<div class="ac2">
                <table>
                	 
                	<thead>
                    <tr>
                        <th>선택</th>
                        <th>제목</th>
                        <th>날짜</th>
                        <th>글 관리</th>
                    </tr>
                    </thead>
               
                    <tbody>
                    <tr>
                        <td><input type="checkbox" id="check1"></td>
                        <td>글 제목</td>
                        <td>글 쓴 날짜</td>
                        <td><button>삭제</button></td>
                    </tr>
                    </tbody>   
                </table>
               </div> 
                     
        </div>  
        <hr>
   <%@ include file = "footer.jsp" %>
</body>
</html>