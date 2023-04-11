<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>write</title>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>review</title>
    <script src="https://kit.fontawesome.com/05d87c1911.js" crossorigin="anonymous"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Gowun+Dodum&family=Lobster&display=swap"
        rel="stylesheet">
    <!-- SmartEditor2 라이브러리  --> 
<script type="text/javascript" src="./resources/smarteditor/js/HuskyEZCreator.js" charset="utf-8"></script>

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
            <form name="review" action="./add" method="post">
                <p class="writetitle">리뷰 작성</p>
                <div class="writeboardmain">
                    
                    <div>
                        <p class="wr2">
                            제목 <input type="text" name="ntname" required>
                        </p>
                    </div>
                    <div>
                        <p class="wr2">
                            작성자 <input type="text" name="memId" value="${memId }" readonly>
                        </p>
                    </div>
                    <div>
                        <p class="wr2">
                            리뷰제품 <input type="text" name="ntproduct" required>
                        </p>
                    </div>
                      
                    <div>
                        <p class="wr3">내용</p>
                        <textarea name="ntmain" id="editorTxt" 
                  		rows="20" cols="10" 
                  		placeholder="내용을 입력해주세요"
                  		style="width: 500px"></textarea>
                    </div>
                    <script>
    					let oEditors = []

    					smartEditor = function() {
      					console.log("Naver SmartEditor")
      					nhn.husky.EZCreator.createInIFrame({
        				oAppRef: oEditors,
        				elPlaceHolder: "editorTxt",
        				sSkinURI: "/smarteditor/SmartEditor2Skin.html",
        				fCreator: "createSEditor2"
     					 })
    					}

    				$(document).ready(function() {
      					smartEditor()
    				})
  				</script>
                </div>
                <div>
                    <div>
                        <input type="submit" value="등록">
                    </div>
                    
                </div>
            </form>
        </div>
    <hr>
<%@ include file = "footer.jsp" %>
</body>
</html>