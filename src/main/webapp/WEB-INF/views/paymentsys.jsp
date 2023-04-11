<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>paymentsys</title>
  <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>review</title>
    <script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
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
    height: 100%;
    justify-content: center;
    align-items: center;
}
.payment{
    width: 100%;
    text-align: center;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 35px;
    margin-bottom: 50px;
}
.paymentsys{
    margin: 0 auto;
    height: 400px;
    margin-top: 70px;
}

.paymentsys th{
    font-size: 20px;
    font-weight: 500;
    padding-right: 140px;
    font-family: 'Gowun Dodum', sans-serif;
}
.paymentsys input{
    height: 25px;
    border-radius: 5px;
    border: 1px solid gray;
}
.firstnum{
    width: 80px;
    text-align: center;
    height: 25px;
    border-radius: 5px;
}
.phone input{
    width: 100px;
    margin: 0 10px;
}
.mailbox{
    width: 150px;
    height: 25px;
    border-radius: 5px;
    border: 1px solid gray;
}
.address input{
    margin-right: 20px;
}
.p_add2{
    width: 80px;
}
.p_add3 input{
    width: 350px;
}
.p_add4 input{
    width: 150px;
    height: 25px;
    border: 1px solid gray;
    border-radius: 5px;
}
.price{
    display: flex;
    justify-content: space-around;
    margin: 40px 0;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 20px;
}
.container2{
    display: block;
    justify-content: center;
    text-align: center;
    
}
.bank{
    border: 1px solid gray;
    border-radius: 10px;
    margin: 0 auto;
    width: 600px;
    margin-bottom: 40px;
    font-family: 'Gowun Dodum', sans-serif;
}
.bank p{
    margin: 20px 0;
    font-family: 'Gowun Dodum', sans-serif;
    font-size: 20px;
}
.bank div{
    margin: 30px 0;
}
.inputbox1{
    width: 280px;
    height: 25px;
    border-radius: 5px;
    border: 1px solid gray;
    margin-left: 50px;
    padding-left: 10px;
}
.bankok{
    margin-bottom: 30px;
    width: 90px;
}
.cardok{
    margin-bottom: 70px;
    width: 100px;
    height: 25px;
}
</style>

</head>
<body>
	<%@ include file = "nav.jsp" %>
 <br><br><br><br><br><br><br>
     <div class="container">
        <p class="payment">결제</p>  
            <table class="paymentsys">
                <tr class="name">
                    <th>이름 </th>
                    <td><input type="text" name="name" class="p_name" required></td>
                </tr>
                <tr class="phone">
                    <th>휴대전화</th>
                    <td><select name="phonenum" class="firstnum">
                        <option value="010" selected>010</option>
                        <option value="011">011</option>
                        <option value="012">012</option>
                        <option value="019">019</option>    
                    </select>
                    <input type="text" name="middlenum" maxlength="4" class="middlenum" required>
                    <input type="text" name="lastnum" maxlength="4" class="lastnum" required>
                    </td>
                </tr>
                <tr class="email">
                    <th>이메일</th>
                    <td><input type="text" name="text" class="p_email" required> &#64;
                    <select class="mailbox">
                        <option value="naver">naver.com</option>
                        <option value="daum">daum.net</option>
                        <option value="gmail">gmail.com</option>
                        <option value="nate">nate.com</option>
                    </select>
                    </td>
                </tr>
                <tr class="address">
                    <th>주소</th>
                    <td><input type="text" name="add" id="sample6_postcode" class="p_add1" placeholder="우편번호">
                    <input type="submit" value="우편번호" onclick="sample6_execDaumPostcode()" class="p_add2"></td>
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
           
       

        <div class="container2">
            
                
                    <div class="bank">                  
                         <p>무통장입금</p>
                         <div>
                             <label>입금 은행</label>
                             <input type="text" name="bankname" value="012-3456-789-10 농협(주)트라이퍼퓸" class="inputbox1"><br>
                         </div> 
                         <div> 
                            <label>입금자 명</label> 
                            <input type="text" name="bankname"  class="inputbox1">
                         </div> 
                         <a href="<c:url value="paymentsys/c_payment"/>"><button class="bankok">확인</button></a>
                    </div> 
                
            
                
                    <a href="<c:url value="paymentsys/cardsystem"/>"><button class="cardok">카트</button></a>
         
       </div>
            

    </div>
    <hr>
   <%@ include file = "footer.jsp" %>
</body>
</html>