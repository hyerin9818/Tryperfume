<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>write</title>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항 수정</title>
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
.writemain{
    display: flex;
    flex-direction: column;
    align-items: center;
    margin: 80px;
    padding: 20px;
}

.writetitle{
    text-align: center;
    font-size: 32px;
    margin: 20px;
    font-family: 'Gowun Dodum', sans-serif;
}
.write_sort{
    width: 800px;
    text-align: end;
    font-family: 'Gowun Dodum', sans-serif;
}
.insert{
    text-align: center;
    border: 1px solid;
    margin-top: 20px;
    background-color:  rgb(250, 243, 234);
    padding: 10px;
}
.wr1, .wr2, .wr3{
    margin: 20px;
}
</style>
</head>
<body>
	<%@ include file = "nav.jsp" %>
	 <div class="writemain">
            <form name="news" action="./updatenews" method="post">
                <p class="writetitle">NEWS 수정</p>
                <div class="writeboardmain">
                    
                    <div>
                        <p class="wr2">
                            제목 <input type="text" name="stname" value="${news.stname}" required>
                        </p>
                    </div>
                    <div>
                        <p class="wr2">
                            작성자 <input type="text" name="memId" value="${news.memId }" readonly>
                        </p>
                    </div>
                    
                      
                    <div>
                        <p class="wr3">내용</p>
                        <textarea name="stmain" id="stmain" cols="80" rows="30" value="${news.stmain}"></textarea>
                    </div>
                </div>
                <div>
                    <div>
                        
                    </div>
                    <input type="submit" value="등록">
                </div>
            </form>
        </div>
    <hr>
<%@ include file = "footer.jsp" %>
</body>
</html>