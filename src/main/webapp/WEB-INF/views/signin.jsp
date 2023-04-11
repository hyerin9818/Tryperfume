<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>signin</title>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>signin</title>
    <script src="https://kit.fontawesome.com/05d87c1911.js" >="anonymous"></script>
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


</style>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>

function CheckId(){
	
	var v = document.getElementById('memId').value;
    window.open("signin/idCheckForm?memId="+v,'_blank','width=500,height=300,top=200,left=200');
 }
</script>
</head>
<body>
	<%@ include file = "nav.jsp" %>
	<div class="container">
        <p class="signup">회원가입</p>
       
            <form name="member"
             action="signin/singinok" method="post">
                <table class="signuppage">
                <tr class="name">
                    <th>이름 </th>
                    <td><input type="text" name="memname" class="s_name" required></td>
                </tr>
                <tr class="phone">
                    <th>휴대전화</th>
                    <td>
                        <select name="phonenum1">
                            <option value="010" selected>010</option>
                            <option value="011">011</option>
                            <option value="012">012</option>
                            <option value="019">019</option>
                        </select>
                        <input type="text" name="phonenum2" maxlength="4" class="middlenum" required/>
                        <input type="text" name="phonenum3" maxlength="4" class="lastnum" required/>
                    </td>
                </tr>
                <tr class="ID">
                    <th>아이디</th>
                    <td><input type="text" name="memId" class="memId" id="memId"  maxlength="15" required/>
                        <input type="button" class="idCheck" onclick="CheckId()" id="idCheck" value="중복확인"/>
                    </td>
                </tr>
                
                <tr class="messege">
                	<td></td>     
                    <td>*영어소문자, 숫자포함 15자 이하</td>
                    
                </tr>    
                <tr class="password">
                    <th>비밀번호</th>
                    <td><input type="password" name="memPw" class="s_pw" maxlength="15" required/></td>
                 
                </tr>
                <tr class="messege"> 
                	<td></td>   
                    <td>*영어소문자, 숫자포함 15자 이하<td>
                </tr>
                <tr class="email">
                    <th>이메일</th>
                    <td><input type="text" name="email1" class="s_email" required/> &#64;
                        <select name="email2">
                            <option value="naver">naver.com</option>
                            <option value="daum">daum.net</option>
                            <option value="gmail">gmail.com</option>
                            <option value="nate">nate.com</option>
                        </select></td>
                </tr>
                <tr class="address">
                    <th>주소</th>
                    <td><input type="text" name="address1" id="sample6_postcode" class="p_add1" placeholder="우편번호">
                    	<!-- onclick으로 스크립트 기능 사용 표기 -->
                    	<input type="button"  onclick="sample6_execDaumPostcode()" value="우편번호 찾기">
                </tr>
        
                <tr class="p_add3">
                    <th></th>
                    <td><input type="text" name="address2" id="sample6_address"  placeholder="주소" required></td>
                </tr>
                <tr class="p_add4">
                    <th></th>
                    <td><input type="text" name="address3" id="sample6_detailAddress" placeholder="상세주소" required>
                    <input type="text" id="sample6_extraAddress" placeholder="참고항목"></td>
                </tr>
            
                </table>
                <!-- 다음 주소 api 사용 -->
                <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
				<script>
    				function sample6_execDaumPostcode() {
        			new daum.Postcode({
            		oncomplete: function(data) {
                	// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                	// 각 주소의 노출 규칙에 따라 주소를 조합한다.
                	// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                	var addr = ''; // 주소 변수
                	var extraAddr = ''; // 참고항목 변수

                	//사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                	if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    	addr = data.roadAddress;
                	} else { // 사용자가 지번 주소를 선택했을 경우(J)
                    	addr = data.jibunAddress;
                	}

                	// 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                	if(data.userSelectedType === 'R'){
                    	// 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    	// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                	} else {
                    document.getElementById("sample6_extraAddress").value = '';
                	}

                	// 우편번호와 주소 정보를 해당 필드에 넣는다.
               		 document.getElementById('sample6_postcode').value = data.zonecode;
               		 document.getElementById("sample6_address").value = addr;
                		// 커서를 상세주소 필드로 이동한다.
                	document.getElementById("sample6_detailAddress").focus();
            		}
        		}).open();
    			}
    					
			</script>
                <div class="signup">
                    <input type="submit" value="회원 가입" class="subtn">
                 </div>
            </form>
         
    </div>
    <hr>    
   <%@ include file = "footer.jsp" %>  
   
    
</body>
</html>