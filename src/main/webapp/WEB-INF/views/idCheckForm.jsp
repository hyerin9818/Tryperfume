<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>아이디 중복 확인</title>
</head>
<body>
	<div style="text-align: center">
	<h3>아이디 중복확인</h3>
    <form method="post" action="idCheckPro" onsubmit="return blankCheck(this)">
    아이디 : <input type="text" name="memId" maxlength="10" autofocus>
    <input type="submit" value="중복확인">
    </form>
    </div>
    
    <script>
    function blankCheck(f){
    	var memId=f.memId.value;
        memId=memId.trim();
        
        return true;
    }//blankCheck() end
    </script>
 </body>
</html>