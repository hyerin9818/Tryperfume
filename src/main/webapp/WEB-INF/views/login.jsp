<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>login</title>
<style>
	*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
    color: black;
    }
    .logintitle{
    display: flex;
    justify-content: center;
    margin-top:100px;
}

.loginpage{
    width: 100%;
    height: 600px;
    position: relative;
    display: flex;
    justify-content: center;
    vertical-align: middle;
    }
.logintitle{
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 40px;
    padding: 40px 0;
}
.loginpage2{
    display: flex;
}
.loginpro{
    display: block;
    justify-content: center;
    width: 100%;
    height: 100%;
}



.loginbox{
    align-items: center;
    border-radius: 10%;
    border-color: transparent;
    margin:30px 20px;
    padding: 10px;
    background-color: transparent;
    width: 100px;
    height: 100px;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 20px;
    background-color: rgb(61, 35, 4);
    color: white;
    
}



.membercheck{
    display: flex;
    justify-content: center;
    margin-bottom: 80px;
    margin-top: 80px;
    
}

.mc1{
    padding-right: 20px ;
    font-family: 'Gowun Dodum', sans-serif;
}
.mc2 a{
    color: red;
    font-family: 'Gowun Dodum', sans-serif;
   
}

.memId{
    height: 50px;
    width: 300px;
    border-radius: 5px;
    margin: 20px;
    margin-left: 30px;
    padding-left: 20px;

}
.memPw{
    height: 50px;
    width: 300px;
    border-radius: 5px;
    margin: 20px;
    padding-left: 20px;
    margin-left: 30px;
}
.error{
	color: red;
	text-align: center;
}
</style>
<script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap"
        rel="stylesheet">
</head>
<body>
	<%@ include file="nav.jsp" %>
	<div class="loginpage">
        <div class="loginpage1">
            <div>
                <p class="logintitle">로그인</p>
            </div>
            <form action="./loginok" method="post">
                <div class="loginpage2">
                    <div class="loginpro">
                        <input type="text" name="memId" id="memId" class="memId" placeholder="아이디" required><br>
                        <input type="password" name="memPw" id="memPw" class="memPw" placeholder="비밀번호" required>
                    </div>
                    <div class="log">
                         <input type="submit" class="loginbox" value="로그인">
                    </div>
                </div>
            </form>
            <!-- 에러메세지 출력 -->
            <!-- model에 담은 메세지 출력 -->
            <p class="error">${error}</p>
            <div class="membercheck">
                     <div><p class="mc1">회원이 아니신가요?</p></div>
                    <div><p class="mc2"><a href="signin">회원가입</a></p></div>
           </div>
        </div>
    </div>
	<hr>   
	<%@ include file="footer.jsp" %>
</body>
</html>