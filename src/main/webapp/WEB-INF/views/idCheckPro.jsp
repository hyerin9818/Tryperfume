<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="com.springmvc.repository.MemberRepositoryImpl" %>
<!DOCTYPE html>
<html>
<head>
<title>아이디 중복 확인 결과</title>
</head>
<body>
	<div style="text-align: center"></div>
	<h3> 아이디 중복 확인 결과 </h3>
<%
    //1) 사용가능한 아이디일 경우, 아이디 입력 폼에 넣기 위함
	MemberRepositoryImpl member=new MemberRepositoryImpl();
    String memId=request.getParameter("memId");
    int cnt=member.idCheck(memId);
    out.println("입력 ID : <strong>" + memId + "</stong>");
    if(cnt==0){
    	out.println("<p>사용 가능한 아이디입니다.</p>");
	out.println("<a href='javascript:apply(\"" + memId + "\")'>[적용]</a>");
%>

	<script>
    	function apply(memId){
            //2) 중복확인 id를 부모창에 적용
            //부모창 opener
            opener.document.regForm.memId.value=id;
            window.close(); //창닫기
        }//apply () end
    </script>
 <%
 	}else{
    	out.println("<p style='color: red'>해당 아이디는 사용하실 수 없습니다.</p>");
    }//if end
 %>
 <hr>
 <a href="javascript:history.back()">[다시시도]</a>
 &nbsp; &nbsp;
 <a href="javascript:window.close()">[창닫기]</a>
 
 </body>
</html>