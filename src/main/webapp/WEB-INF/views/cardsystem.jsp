<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>cardsystem</title>
<style>
*{
    margin: 0;
    padding: 0;
    text-decoration: none;
    list-style: none;
    box-sizing: border-box;
    color: black;
}
.cardsystem{
	margin-top:200px;
    width: 100%;
    height: 700px;
    display: block;
    text-align:justify;
    line-height: 20px;
}
.cardsystem h3{
    width: 100%;
    text-align: center;
    font-size: 30px;
    font-family: 'Gowun Dodum', sans-serif; 
    margin-bottom: 80px;  
}
form{
    width: 100%;
    line-height: 60px;
}
.cardmen{
    margin: 0 auto;
}
.cardmen th{
    padding-right: 60px;
    font-family: 'Gowun Dodum', sans-serif; 
}
.cardmen input{
    width: 120px;
    height: 23px;
    border: 1px solid gray;
    border-radius: 5px;
}
.cardmen select{
    width: 200px;
    height: 30px;
    border-radius: 5px;
}
.cardclose{
    width: 100%;
    text-align: center;
    margin-top: 30px;
}
.cardclose input{
    width: 100px;
    height: 40px;
}
.cardnow{
    text-align: center;
}
.cardnow input{
    width: 150px;
    height: 32px;
    margin-top: 60px;
    font-family: 'Gowun Dodum', sans-serif; 
    font-size: 18px;

}
</style>
<script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap" rel="stylesheet">
</head>
<body>
	<%@ include file="nav.jsp" %>
	<div class="cardsystem">
        <h3>카드 결제 시스템</h3>
        <form action="c_payment">
            <table class="cardmen">
                <tr>
                     <th>이름</th>
                    <td><input type="text" required></tr>
                </tr>
                <tr>
                    <th>카드 회사</th>
                    <td><select name="cardfa" required>
                            <option value="nh" >농협카드</option>
                            <option value="kb">국민카드</option>
                            <option value="ss">삼성카드</option>
                            <option value="sh">신환카드</option>
                            <option value="bc">비씨카드</option>
                        </select>
                    </td>
                </tr>
            <tr>
                <th>카드 번호</th>
                <td><input type="text" name="one" maxlength="4" class="one" required>
                <input type="text" name="two" maxlength="4" class="two" required>
                <input type="text" name="three" maxlength="4" class="three" required>
                <input type="text" name="four" maxlength="4" class="four" required></td>
            </tr>
            <tr>
                <th>비밀번호</th>
                <td><input type="password" required></td>
            </tr>   
            </table>
            <div class="cardnow">   
                <input type="submit" value="결제하기" >
            </div>     
        </form>
    </div>
	<hr>
	<%@ include file="footer.jsp" %>
</body>
</html>